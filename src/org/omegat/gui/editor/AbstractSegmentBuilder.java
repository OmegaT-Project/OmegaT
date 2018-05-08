/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2009 Alex Buloichik, Martin Fleurke
               2010 Alex Buloichik, Didier Briel
               2012 Martin Fleurke, Hans-Peter Jacobs
               2015 Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.gui.editor;

import org.omegat.core.Core;
import org.omegat.core.data.ProjectTMX;
import org.omegat.core.data.SourceTextEntry;
import org.omegat.core.data.TMXEntry;
import org.omegat.gui.editor.MarkerController.MarkInfo;
import org.omegat.util.*;
import org.omegat.util.gui.StaticUIUtils;
import org.omegat.util.gui.UIThreadsUtil;

import javax.swing.text.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 *
 * CLG:  Consider using as a base class for SegmentBuild and SourceOnlySegmentBuilder so that code can be reused as there there is some good and well tested code in the SegmentBuilder that I would like to reuse...
 *
 * Refactored from work done by:
 *
 * @author Alex Buloichik (alex73mail@gmail.com)
 * @author Didier Briel
 * @author Martin Fleurke
 * @author Hans-Peter Jacobs
 * @author Aaron Madlon-Kay
 */
public abstract class AbstractSegmentBuilder implements ISegmentBuilder {

    static AtomicLong globalVersions = new AtomicLong();

    final SourceTextEntry ste;
    final int segmentNumberInProject;

    /**
     * Version of displayed variant of segment. Required for check in delayed
     * thread, like spell checking. Version changed(in Swing thread only) each
     * time when entry drawn, and when user edits it (for active entry).
     */
    volatile long displayVersion;  // CLG should each builder/editor have it's own display version?

    /** Source text of entry with internal bidi chars, or null if not displayed. */
    String sourceText;
    /** Translation text of entry with internal bidi chars, or null if not displayed. */
    String translationText;
    /** True if entry is active. */
    boolean active;
    /** True if translation exist for entry. */
    boolean transExist;
    /** True if entry has a note attached. */
    boolean noteExist;
    /** True if translation is default, false - is multiple. */
    boolean defaultTranslation;

    final Document3 doc;
    final IEditor controller;
    final EditorSettings settings;
    /**
     * Offset of first c.q. last character in active source text
     */
    int activeTranslationBeginOffset, activeTranslationEndOffset;

    /** Boundary of full entry display. */
    Position beginPosP1, endPosM1;

    /** Source start position - for marks. */
    Position posSourceBeg;
    int posSourceLength;
    /** Translation start position - for marks. */
    Position posTranslationBeg;
    int posTranslationLength;

    /** current offset in document to insert new stuff*/
    int offset;

    /**
     * Markers for this segment.
     *
     * Array of displayed marks. 1nd dimension - marker, 2nd dimension - marks
     */
    MarkInfo[][] marks;

    /**
     * True if source OR target languages is RTL. In this case, we will insert
     * RTL/LTR embedded direction chars. Otherwise - will not insert, since JDK
     * 1.6 has bug with performance with embedded directions chars.
     */
    final boolean hasRTL;

    public AbstractSegmentBuilder(final IEditor controller, final Document3 doc, final EditorSettings settings,
                                  final SourceTextEntry ste, final int segmentNumberInProject, final boolean hasRTL) {
        this.controller = controller;
        this.doc = doc;
        this.settings = settings;
        this.ste = ste;
        this.segmentNumberInProject = segmentNumberInProject;
        this.hasRTL = hasRTL;
    }

    public boolean isDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(boolean defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    /**
     * Create element for one segment.
     *
     * @return OmElementSegment
     */
    /*public void createSegmentElement(final boolean isActive, TMXEntry trans) {
        createSegmentElement(isActive, doc.getLength(), trans);
    }*/

    /*public void prependSegmentElement(final boolean isActive, TMXEntry trans) {
        createSegmentElement(isActive, 0, trans);
    }*/

    /*public void createSegmentElement(final boolean isActive, int initialOffset, TMXEntry trans) {
        UIThreadsUtil.mustBeSwingThread();

        displayVersion = globalVersions.incrementAndGet();
        this.active = isActive;

        doc.trustedChangesInProgress = true;
        StaticUIUtils.setCaretUpdateEnabled(controller.getEditor(IEditor.EditorType.TRANSLATION), false);
        try {
            try {
                if (beginPosP1 != null && endPosM1 != null) {// CLG note this removes translation (current) from the Doc via DocumentFilter3, and the modified info string
                    // remove old segment
                    int beginOffset = beginPosP1.getOffset() - 1;
                    int endOffset = endPosM1.getOffset() + 1;
                    doc.remove(beginOffset, endOffset - beginOffset);
                    offset = beginOffset;
                } else {
                    // there is no segment in document yet - need to add
                    offset = initialOffset;
                }

                defaultTranslation = trans.defaultTranslation;
                if (!Core.getProject().getProjectProperties().isSupportDefaultTranslations()) {
                    defaultTranslation = false;
                }
                transExist = trans.isTranslated();
                noteExist = trans.hasNote();

                int beginOffset = offset;
                if (isActive) {
                    createActiveSegmentElement(trans);
                } else {
                    createInactiveSegmentElement(trans);
                }
                int endOffset = offset;

                beginPosP1 = doc.createPosition(beginOffset + 1);
                endPosM1 = doc.createPosition(endOffset - 1);
            } catch (BadLocationException ex) {
                throw new RuntimeException(ex);
            }
        } finally {
            doc.trustedChangesInProgress = false;
            StaticUIUtils.setCaretUpdateEnabled(controller.getEditor(IEditor.EditorType.TRANSLATION), true);
        }
    }*/

    public boolean hasBeenCreated() {
        return beginPosP1 != null && endPosM1 != null;
    }

    /**
     * Add separator between segments - one empty line.
     */
    public void addSegmentSeparator() {
        addSegmentSeparator(doc.getLength());
    }

    public void prependSegmentSeparator() {
        addSegmentSeparator(0);
    }

    public void addSegmentSeparator(int index) {
        doc.trustedChangesInProgress = true;
        StaticUIUtils.setCaretUpdateEnabled(controller.getEditor(IEditor.EditorType.TRANSLATION), false);
        try {
            try {
                doc.insertString(index, "\n", null);
            } catch (BadLocationException ex) {
                throw new RuntimeException(ex);
            }
        } finally {
            doc.trustedChangesInProgress = false;
            StaticUIUtils.setCaretUpdateEnabled(controller.getEditor(IEditor.EditorType.TRANSLATION), true);
        }
    }

    /**
     * Create active segment for given entry
     */
   /* void createActiveSegmentElement(TMXEntry trans) throws BadLocationException {
        try {
            if (EditorSettings.DISPLAY_MODIFICATION_INFO_ALL.equals(settings.getDisplayModificationInfo())
                    || EditorSettings.DISPLAY_MODIFICATION_INFO_SELECTED.equals(settings
                            .getDisplayModificationInfo())) {
                addModificationInfoPart(trans);
            }

            int prevOffset = offset;
            sourceText = addInactiveSegPart(true, ste.getSrcText());

            Map<Language, ProjectTMX> otherLanguageTMs = Core.getProject().getOtherTargetLanguageTMs();
            for (Map.Entry<Language, ProjectTMX> entry : otherLanguageTMs.entrySet()) {
                TMXEntry altTrans = entry.getValue().getDefaultTranslation(ste.getSrcText());
                if (altTrans != null && altTrans.isTranslated()) {
                    Language language = entry.getKey();
                    addOtherLanguagePart(altTrans.translation, language);
                }
            }

            posSourceBeg = doc.createPosition(prevOffset + (hasRTL ? 1 : 0));
            posSourceLength = sourceText.length();

            if (trans.isTranslated()) {
                //translation exist
                translationText = trans.translation;
            } else {
                boolean insertSource = !Preferences.isPreference(Preferences.DONT_INSERT_SOURCE_TEXT);
                if (controller.getFilter() != null && controller.getFilter().isSourceAsEmptyTranslation()) {
                    insertSource = true;
                }
                if (insertSource) {
                    // need to insert source text on empty translation
                    String srcText = ste.getSrcText();
                    if (Preferences.isPreference(Preferences.GLOSSARY_REPLACE_ON_INSERT)) {
                        srcText = EditorUtils.replaceGlossaryEntries(srcText);
                    }
                    translationText = srcText;
                } else {
                    // empty text on non-exist translation
                    translationText = "";
                }
            }

            translationText = addActiveSegPart(translationText);
            posTranslationBeg = null;

            doc.activeTranslationBeginM1 = doc.createPosition(activeTranslationBeginOffset *//*- 1*//*);
            doc.activeTranslationEndP1 = doc.createPosition(activeTranslationEndOffset *//*+ 1*//*);
        } catch (OutOfMemoryError oome) {
            // Oh shit, we're all out of storage space!
            // Of course we should've cleaned up after ourselves earlier,
            // but since we didn't, do a bit of cleaning up now, otherwise
            // we can't even inform the user about our slacking off.
            doc.remove(0, doc.getLength());

            // Well, that cleared up some, GC to the rescue!
            System.gc();

            // There, that should do it, now inform the user
            long memory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
            Log.logErrorRB("OUT_OF_MEMORY", memory);
            Log.log(oome);
            Core.getMainWindow().showErrorDialogRB("TF_ERROR", "OUT_OF_MEMORY", memory);
            // Just quit, we can't help it anyway
            System.exit(0);

        }
    }*/


    /*void createInactiveSegmentElement(TMXEntry trans) throws BadLocationException {
        if (EditorSettings.DISPLAY_MODIFICATION_INFO_ALL.equals(settings.getDisplayModificationInfo())) {
            addModificationInfoPart(trans);
        }

        sourceText = null;
        translationText = null;

        if (settings.isDisplaySegmentSources()) {
            sourceText = ste.getSrcText();
        }

        if (trans.isTranslated()) {
            // translation exist
            translationText = trans.translation;
            if (StringUtil.isEmpty(translationText)) {
                translationText = OStrings.getString("EMPTY_TRANSLATION");
            }
        } else {
            if (sourceText == null) {
                // translation not exist, but source display disabled also -
                // need to display source
                sourceText = ste.getSrcText();
            }
        }

        if (sourceText != null) {
            int prevOffset = offset;
            sourceText = addInactiveSegPart(true, sourceText);
            posSourceBeg = doc.createPosition(prevOffset + (hasRTL ? 1 : 0));
            posSourceLength = sourceText.length();
        } else {
            posSourceBeg = null;
        }

        if (translationText != null) {
            int prevOffset = offset;
            translationText = addInactiveSegPart(false, translationText);
            posTranslationBeg = doc.createPosition(prevOffset + (hasRTL ? 1 : 0));
            posTranslationLength = translationText.length();
        } else {
            posTranslationBeg = null;
        }
    }*/

    public SourceTextEntry getSourceTextEntry() {
        return ste;
    }

    public long getDisplayVersion() {
        return displayVersion;
    }

    public boolean isActive() {
        return active;
    }

    public SourceTextEntry getSource(){
        return ste;
    }

    /** Get source text of entry with internal bidi chars, or null if not displayed. */
    public String getSourceText() {
        return sourceText;
    }

    /** Get translation text of entry with internal bidi chars, or null if not displayed. */
    public String getTranslationText() {
        return translationText;
    }

    public int getStartSourcePosition() {
        if (posSourceBeg != null) {
            return posSourceBeg.getOffset();
        } else {
            return -1;
        }
    }

    public int getStartTranslationPosition() {
        if (posTranslationBeg != null) {
            return posTranslationBeg.getOffset();
        } else {
            return -1;
        }
    }

    /**
     * Get segment's start position.
     *
     * @return start position
     */
    public int getStartPosition() {
        return beginPosP1.getOffset() - 1;
    }

    /**
     * Get segment's end position.
     *
     * @return end position
     */
    public int getEndPosition() {
        return endPosM1.getOffset() + 1;
    }

    /**
     * Set attributes for created paragraphs for better RTL support.
     *
     * @param begin
     *            paragraphs begin
     * @param end
     *            paragraphs end
     * @param isRTL
     *            is text right-to-left?
     */
    void setAlignment(int begin, int end, boolean isRTL) {
        boolean rtl = false;
        switch (controller.getCurrentTextOrientation()) {
        case ALL_LTR:
            rtl = false;
            break;
        case ALL_RTL:
            rtl = true;
            break;
        case DIFFER:
            rtl = isRTL;
            break;
        }
        doc.setAlignment(begin, end, rtl);
    }

    /**
     * Check if location inside segment.
     */
    public boolean isInsideSegment(int location) {
        return beginPosP1.getOffset() - 1 <= location && location < endPosM1.getOffset() + 1;
    }

    /**
     * Add inactive segment part, without segment begin/end marks.
     *
     * @param isSource is text the source text (true) or translation text (false)
     * @param text
     *            segment part text
     * @throws BadLocationException
     */
    String addInactiveSegPart(boolean isSource, String text)
            throws BadLocationException {
        int prevOffset = offset;
        boolean rtl = isSource ? controller.isSourceLangRTL() : controller.isTargetLangRTL();
        insertDirectionEmbedding(rtl);
        String result = insertTextWithTags(text, isSource);
        insertDirectionEndEmbedding();
        insert("\n", null);
        setAlignment(prevOffset, offset, rtl);
        return result;
    }

    /**
     * Add inactive segment part, without segment begin/end marks.
     *
     * @param text other language translation text
     * @throws BadLocationException
     */
    void addOtherLanguagePart(String text, Language language)
            throws BadLocationException {
        int prevOffset = offset;
        boolean rtl = EditorUtils.isRTL(language.getLanguageCode());
        insertDirectionEmbedding(false);
        AttributeSet normal = attrs(true, false, false, false);
        insert(language.getLanguage() + ": ", normal);
        insertDirectionEndEmbedding();

        insertDirectionEmbedding(rtl);
        AttributeSet attrs = settings.getOtherLanguageTranslationAttributeSet();
        insert(text, attrs);
        insertDirectionEndEmbedding();
        insert("\n", null);
        setAlignment(prevOffset, offset, rtl);
    }

    /**
     * Adds a string that displays the modification info (author and date). Does
     * nothing if the translation entry is null.
     *
     * @param trans
     *            The translation entry (can be null)
     * @throws BadLocationException
     */
    void addModificationInfoPart(TMXEntry trans) throws BadLocationException {
        if (!trans.isTranslated()) {
            return;
        }
        String text;
        if (Preferences.isPreference(Preferences.VIEW_OPTION_TEMPLATE_ACTIVE)) {
             text = ModificationInfoManager.apply(trans);
        } else {
            String author = (trans.changer == null ? OStrings.getString("TF_CUR_SEGMENT_UNKNOWN_AUTHOR")
                    : trans.changer);
            String template;
            if (trans.changeDate != 0) {
                template = OStrings.getString("TF_CUR_SEGMENT_AUTHOR_DATE");
                Date changeDate = new Date(trans.changeDate);
                String changeDateString = DateFormat.getDateInstance().format(changeDate);
                String changeTimeString = DateFormat.getTimeInstance().format(changeDate);
                Object[] args = { author, changeDateString, changeTimeString };
                text = StringUtil.format(template, args);
            } else {
                template = OStrings.getString("TF_CUR_SEGMENT_AUTHOR");
                Object[] args = { author };
                text = StringUtil.format(template, args);
            }
        }

        int prevOffset = offset;
        boolean rtl = EditorUtils.localeIsRTL();
        insertDirectionEmbedding(rtl);
        AttributeSet attrs = settings.getModificationInfoAttributeSet();
        insert(text, attrs);
        insertDirectionEndEmbedding();
        insert("\n", null);
        setAlignment(prevOffset, offset, rtl);
    }

    /**
     * Add active (translation) segment part, with segment begin/end marks.
     *
     * @param text
     *            segment part text
     * @throws BadLocationException
     */
    String addActiveSegPart(String text) throws BadLocationException {
        int prevOffset = offset;

        // TODO CLG: SKIP IF SOURCE SEGMENT?
        //write translation part
        boolean rtl = controller.isTargetLangRTL();

        insertDirectionEmbedding(rtl);

        activeTranslationBeginOffset = offset;
        String result = insertTextWithTags(text, false); // TODO WHAT IF THIS IS SOURCE...
        activeTranslationEndOffset = offset;

        insertDirectionEndEmbedding();

        //write segment marker
        //we want the marker AFTER the translated text, so use same direction as target text.
        insertDirectionMarker(rtl);

        //the marker itself is in user language
        insertDirectionEmbedding(EditorUtils.localeIsRTL());
        AttributeSet attrSegmentMark = settings.getSegmentMarkerAttributeSet();
        insert(createSegmentMarkText(), attrSegmentMark);
        insertDirectionEndEmbedding();

        //we want the marker AFTER the translated text, so embed in same direction as target text.
        insertDirectionMarker(rtl);

        insert("\n", null);

        setAlignment(prevOffset, offset, rtl);
        return result;
    }

/*    String addActiveSourceSegPart(String text) throws BadLocationException {
        int prevOffset = offset;

        // TODO Add a newline to offset maker tag (IF MARKER ENABLED)
        //insert("\n", null);
        activeTranslationBeginOffset = offset;
        //String result = insertTextWithTags(text, true); // TODO WHAT IF THIS IS SOURCE...

        AttributeSet normal = attrs(true, false, false, false);
        insert(text, normal);
        activeTranslationEndOffset = offset;


        insert("\n", null);

        return text;
    }*/

    public void createInputAttributes(Element element, MutableAttributeSet set) {
        set.addAttributes(attrs(false, false, false, false));
    }

    void insert(String text, AttributeSet attrs) throws BadLocationException {
        doc.insertString(offset, text, attrs);
        offset += text.length();
    }

    /**
     * Make some changes of segment mark from resource bundle for display
     * correctly in editor.
     *
     * @return changed mark text
     */
    String createSegmentMarkText() {
        String text = OConsts.SEGMENT_MARKER_STRING;

        //replace placeholder with actual segment number
        if (text.contains("0000")) {
            String replacement = NUMBER_FORMAT.format(segmentNumberInProject);
            if (Preferences.isPreference(Preferences.MARK_NON_UNIQUE_SEGMENTS)
                    && ste.getDuplicate() != SourceTextEntry.DUPLICATE.NONE) {
                replacement = StringUtil.format(OStrings.getString("SW_FILE_AND_NR_OF_MORE"),
                        replacement,
                        ste.getNumberOfDuplicates());
            }
            text = text.replace("0000", replacement);
        }

        // trim and replace spaces to non-break spaces
        text = text.trim().replace(' ', '\u00A0');

        return text;
    }

    /**
     * Called on the active entry changed. Required for update translation text.
     */
    public void onActiveEntryChanged() {
        translationText = doc.extractTranslation();
        displayVersion = globalVersions.incrementAndGet();
    }

    /**
     * Choose segment part attributes based on rules.
     *
     * @param isSource
     *            is it a source segment or a target segment
     * @param isPlaceholder
     *            is it for a placeholder (OmegaT tag or sprintf-variable etc.) or regular text inside the
     *            segment?
     * @param isRemoveText
     *            is it text that should be removed in the translation?
     * @param isNBSP
     *            is the text a non-breakable space?
     * @return the attributes to format the text
     */
    public AttributeSet attrs(boolean isSource, boolean isPlaceholder, boolean isRemoveText, boolean isNBSP) {
        return settings.getAttributeSet(isSource, isPlaceholder, isRemoveText, ste.getDuplicate(), active,
                transExist, noteExist, isNBSP);
    }

    /**
     * Inserts the texts and formats the text
     * @param text source or translation text
     * @param isSource true if it is a source text, false if it is a translation
     * @throws BadLocationException
     */
    String insertTextWithTags(String text, boolean isSource) throws BadLocationException {
        if (!isSource && hasRTL && controller.isTargetLangRTL()) {
            text = EditorUtils.addBidiAroundTags(text, ste);
        }
        AttributeSet normal = attrs(isSource, false, false, false);
        insert(text, normal);
        return text;
    }

    public void resetTextAttributes() {
        doc.trustedChangesInProgress = true;
        try {
            if (posSourceBeg != null) {
                int sBeg = posSourceBeg.getOffset();
                int sLen = posSourceLength;
                AttributeSet attrs = attrs(true, false, false, false);
                doc.setCharacterAttributes(sBeg, sLen, attrs, true);
            }
            if (active) {
                int tBeg = doc.getTranslationStart();
                int tEnd = doc.getTranslationEnd();
                AttributeSet attrs = attrs(false, false, false, false);
                doc.setCharacterAttributes(tBeg, tEnd - tBeg, attrs, true);
            } else {
                if (posTranslationBeg != null) {
                    int tBeg = posTranslationBeg.getOffset();
                    int tLen = posTranslationLength;
                    AttributeSet attrs = attrs(false, false, false, false);
                    doc.setCharacterAttributes(tBeg, tLen, attrs, true);
                }
            }
        } finally {
            doc.trustedChangesInProgress = false;
        }
    }

    /**
     * Writes (if necessary) an RTL or LTR marker. Use it before writing text in some language.
     * @param isRTL is the language that has to be written a right-to-left language?
     * @throws BadLocationException
     */
    void insertDirectionEmbedding(boolean isRTL) throws BadLocationException {
        if (this.hasRTL) {
            insert(isRTL ? BIDI_RLE : BIDI_LRE, null); // RTL- or LTR- embedding
        }
    }

    /**
     * Writes (if necessary) an end-of-embedding marker. Use it after writing text in some language.
     * @throws BadLocationException
     */
    void insertDirectionEndEmbedding() throws BadLocationException {
        if (this.hasRTL) {
            insert(BIDI_PDF, null); // end of embedding
        }
    }

    /**
     * Writes (if necessary) an RTL or LTR marker. Use it before writing text in some language.
     * @param isRTL is the language that has to be written a right-to-left language?
     * @throws BadLocationException
     */
    void insertDirectionMarker(boolean isRTL) throws BadLocationException {
        if (this.hasRTL) {
            insert(isRTL ? BIDI_RLM : BIDI_LRM, null); // RTL- or LTR- marker
        }
    }

    public Document3 getDocument(){
        return doc;
    }
}