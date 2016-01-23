/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2013 Alex Buloichik
               2014 Aaron Madlon-Kay, Piotr Kulik
               2015 Yu Tang
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.omegat.gui.search;

import org.omegat.gui.common.OmegaTIcons;
import org.omegat.util.OStrings;

/**
 *
 * @author Alex Buloichik (alex73mail@gmail.com)
 * @author Aaron Madlon-Kay
 * @author Piotr Kulik
 */
@SuppressWarnings("serial")
public class SearchWindowForm extends javax.swing.JFrame {

    /**
     * Creates new form SearchWindowForm
     */
    public SearchWindowForm() {
        OmegaTIcons.setIconImages(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupSearch = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroupReplace = new javax.swing.ButtonGroup();
        buttonGroupSearchState = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        m_searchLabel = new javax.swing.JLabel();
        m_searchField = new javax.swing.JComboBox();
        m_replaceLabel = new javax.swing.JLabel();
        m_replaceField = new javax.swing.JComboBox();
        m_searchButton = new javax.swing.JButton();
        m_panelSearch = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        m_searchExactSearchRB = new javax.swing.JRadioButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        m_searchKeywordSearchRB = new javax.swing.JRadioButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        m_searchRegexpSearchRB = new javax.swing.JRadioButton();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        m_resultsLabel = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel3 = new javax.swing.JPanel();
        m_searchCase = new javax.swing.JCheckBox();
        filler29 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_searchSpaceMatchNbsp = new javax.swing.JCheckBox();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_searchSource = new javax.swing.JCheckBox();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_searchTranslation = new javax.swing.JCheckBox();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_searchNotesCB = new javax.swing.JCheckBox();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_searchCommentsCB = new javax.swing.JCheckBox();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel12 = new javax.swing.JPanel();
        m_searchTranslatedUntranslated = new javax.swing.JRadioButton();
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_searchTranslated = new javax.swing.JRadioButton();
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_searchUntranslated = new javax.swing.JRadioButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_displayLabel = new javax.swing.JLabel();
        m_allResultsCB = new javax.swing.JCheckBox();
        m_fileNamesCB = new javax.swing.JCheckBox();
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        m_panelReplace = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        m_replaceExactSearchRB = new javax.swing.JRadioButton();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        m_replaceRegexpSearchRB = new javax.swing.JRadioButton();
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        m_resultsLabel1 = new javax.swing.JLabel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel11 = new javax.swing.JPanel();
        m_replaceCase = new javax.swing.JCheckBox();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_replaceSpaceMatchNbsp = new javax.swing.JCheckBox();
        filler30 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_replaceUntranslated = new javax.swing.JCheckBox();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        m_SearchInPane = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        m_SearchInProjectPane = new javax.swing.JPanel();
        m_rbProject = new javax.swing.JRadioButton();
        m_cbSearchInMemory = new javax.swing.JCheckBox();
        m_cbSearchInTMs = new javax.swing.JCheckBox();
        m_cbSearchInGlossaries = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jSeparator1 = new javax.swing.JSeparator();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        m_SearchInDirPane = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        m_rbDir = new javax.swing.JRadioButton();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        m_recursiveCB = new javax.swing.JCheckBox();
        m_dirLabel = new javax.swing.JLabel();
        m_dirField = new javax.swing.JTextField();
        m_dirButton = new javax.swing.JButton();
        m_advancedVisiblePane = new javax.swing.JPanel();
        m_authorCB = new javax.swing.JCheckBox();
        m_authorField = new org.omegat.gui.search.MFindField();
        m_authorField.setDefaultText(OStrings.getString("TF_CUR_SEGMENT_UNKNOWN_AUTHOR"));
        m_dateFromCB = new javax.swing.JCheckBox();
        m_dateFromButton = new javax.swing.JButton();
        m_dateToCB = new javax.swing.JCheckBox();
        m_dateToButton = new javax.swing.JButton();
        m_numberLabel = new javax.swing.JLabel();
        m_numberOfResults = new javax.swing.JSpinner();
        m_dateFromSpinner = new javax.swing.JSpinner();
        m_dateToSpinner = new javax.swing.JSpinner();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        m_excludeOrphans = new javax.swing.JCheckBox();
        m_fullHalfWidthInsensitive = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        m_advancedButton = new javax.swing.JButton();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollPane1 = new javax.swing.JScrollPane();
        m_viewer = new EntryListPane();
        jPanel8 = new javax.swing.JPanel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel7 = new javax.swing.JPanel();
        m_autoSyncWithEditor = new javax.swing.JCheckBox();
        m_backToInitialSegment = new javax.swing.JCheckBox();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        m_replaceAllButton = new javax.swing.JButton();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_replaceButton = new javax.swing.JButton();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_filterButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        m_dismissButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(m_searchLabel, OStrings.getString("SW_SEARCH_TEXT")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(m_searchLabel, gridBagConstraints);

        m_searchField.setEditable(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 10);
        jPanel1.add(m_searchField, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_replaceLabel, OStrings.getString("SW_REPLACE_TEXT")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(m_replaceLabel, gridBagConstraints);

        m_replaceField.setEditable(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 10);
        jPanel1.add(m_replaceField, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_searchButton, OStrings.getString("BUTTON_SEARCH")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel1.add(m_searchButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jPanel1, gridBagConstraints);

        m_panelSearch.setLayout(new java.awt.GridLayout(3, 0));

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        buttonGroupSearch.add(m_searchExactSearchRB);
        m_searchExactSearchRB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_searchExactSearchRB, OStrings.getString("SW_EXACT_SEARCH")); // NOI18N
        jPanel2.add(m_searchExactSearchRB);
        jPanel2.add(filler3);

        buttonGroupSearch.add(m_searchKeywordSearchRB);
        org.openide.awt.Mnemonics.setLocalizedText(m_searchKeywordSearchRB, OStrings.getString("SW_WORD_SEARCH")); // NOI18N
        jPanel2.add(m_searchKeywordSearchRB);
        jPanel2.add(filler4);

        buttonGroupSearch.add(m_searchRegexpSearchRB);
        org.openide.awt.Mnemonics.setLocalizedText(m_searchRegexpSearchRB, OStrings.getString("SW_REGEXP_SEARCH")); // NOI18N
        jPanel2.add(m_searchRegexpSearchRB);
        jPanel2.add(filler14);
        jPanel2.add(m_resultsLabel);
        jPanel2.add(filler2);

        m_panelSearch.add(jPanel2);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        m_searchCase.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_searchCase, OStrings.getString("SW_CASE_SENSITIVE")); // NOI18N
        jPanel3.add(m_searchCase);
        jPanel3.add(filler29);

        org.openide.awt.Mnemonics.setLocalizedText(m_searchSpaceMatchNbsp, OStrings.getString("SW_SEARCH_SPACE_MATCH_NBSP")); // NOI18N
        jPanel3.add(m_searchSpaceMatchNbsp);
        jPanel3.add(filler5);

        m_searchSource.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_searchSource, OStrings.getString("SW_SEARCH_SOURCE")); // NOI18N
        jPanel3.add(m_searchSource);
        jPanel3.add(filler17);

        m_searchTranslation.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_searchTranslation, OStrings.getString("SW_SEARCH_TRANSLATION")); // NOI18N
        jPanel3.add(m_searchTranslation);
        jPanel3.add(filler6);

        m_searchNotesCB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_searchNotesCB, OStrings.getString("SW_SEARCH_NOTES")); // NOI18N
        jPanel3.add(m_searchNotesCB);
        jPanel3.add(filler24);

        org.openide.awt.Mnemonics.setLocalizedText(m_searchCommentsCB, OStrings.getString("SW_SEARCH_COMMENTS")); // NOI18N
        jPanel3.add(m_searchCommentsCB);
        jPanel3.add(filler23);

        m_panelSearch.add(jPanel3);

        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));

        buttonGroupSearchState.add(m_searchTranslatedUntranslated);
        m_searchTranslatedUntranslated.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_searchTranslatedUntranslated, OStrings.getString("SW_SEARCH_TRANSLATEDUNTRANSLATED")); // NOI18N
        jPanel12.add(m_searchTranslatedUntranslated);
        jPanel12.add(filler27);

        buttonGroupSearchState.add(m_searchTranslated);
        org.openide.awt.Mnemonics.setLocalizedText(m_searchTranslated, OStrings.getString("SW_SEARCH_TRANSLATED")); // NOI18N
        jPanel12.add(m_searchTranslated);
        jPanel12.add(filler28);

        buttonGroupSearchState.add(m_searchUntranslated);
        org.openide.awt.Mnemonics.setLocalizedText(m_searchUntranslated, OStrings.getString("SW_SEARCH_UNTRANSLATED")); // NOI18N
        jPanel12.add(m_searchUntranslated);
        jPanel12.add(filler8);

        m_displayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(m_displayLabel, OStrings.getString("SW_DISPLAY_LABEL")); // NOI18N
        jPanel12.add(m_displayLabel);

        m_allResultsCB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_allResultsCB, OStrings.getString("SW_ALL_RESULTS")); // NOI18N
        jPanel12.add(m_allResultsCB);

        org.openide.awt.Mnemonics.setLocalizedText(m_fileNamesCB, OStrings.getString("SW_FILE_NAMES")); // NOI18N
        jPanel12.add(m_fileNamesCB);
        jPanel12.add(filler26);

        m_panelSearch.add(jPanel12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(m_panelSearch, gridBagConstraints);

        m_panelReplace.setLayout(new java.awt.GridLayout(2, 0));

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        buttonGroupReplace.add(m_replaceExactSearchRB);
        m_replaceExactSearchRB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_replaceExactSearchRB, OStrings.getString("SW_EXACT_SEARCH")); // NOI18N
        jPanel5.add(m_replaceExactSearchRB);
        jPanel5.add(filler19);

        buttonGroupReplace.add(m_replaceRegexpSearchRB);
        org.openide.awt.Mnemonics.setLocalizedText(m_replaceRegexpSearchRB, OStrings.getString("SW_REGEXP_SEARCH")); // NOI18N
        jPanel5.add(m_replaceRegexpSearchRB);
        jPanel5.add(filler20);
        jPanel5.add(m_resultsLabel1);
        jPanel5.add(filler21);

        m_panelReplace.add(jPanel5);

        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        m_replaceCase.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_replaceCase, OStrings.getString("SW_CASE_SENSITIVE")); // NOI18N
        jPanel11.add(m_replaceCase);
        jPanel11.add(filler22);

        org.openide.awt.Mnemonics.setLocalizedText(m_replaceSpaceMatchNbsp, OStrings.getString("SW_SEARCH_SPACE_MATCH_NBSP")); // NOI18N
        jPanel11.add(m_replaceSpaceMatchNbsp);
        jPanel11.add(filler30);

        org.openide.awt.Mnemonics.setLocalizedText(m_replaceUntranslated, OStrings.getString("SW_REPLACE_UNTRANSLATED")); // NOI18N
        jPanel11.add(m_replaceUntranslated);
        jPanel11.add(filler11);

        m_panelReplace.add(jPanel11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(m_panelReplace, gridBagConstraints);

        m_SearchInPane.setBorder(javax.swing.BorderFactory.createTitledBorder(OStrings.getString("SW_SEARCH_IN_BOX"))); // NOI18N
        m_SearchInPane.setLayout(new java.awt.BorderLayout());

        jPanel13.setLayout(new java.awt.BorderLayout());

        m_SearchInProjectPane.setLayout(new java.awt.GridBagLayout());

        buttonGroup2.add(m_rbProject);
        org.openide.awt.Mnemonics.setLocalizedText(m_rbProject, OStrings.getString("SW_PROJECT_SEARCH")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        m_SearchInProjectPane.add(m_rbProject, gridBagConstraints);

        m_cbSearchInMemory.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_cbSearchInMemory, OStrings.getString("SW_SEARCH_IN_MEMORY")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        m_SearchInProjectPane.add(m_cbSearchInMemory, gridBagConstraints);

        m_cbSearchInTMs.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_cbSearchInTMs, OStrings.getString("SW_SEARCH_IN_TMS")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        m_SearchInProjectPane.add(m_cbSearchInTMs, gridBagConstraints);

        m_cbSearchInGlossaries.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_cbSearchInGlossaries, OStrings.getString("SW_SEARCH_IN_GLOSSARIES")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        m_SearchInProjectPane.add(m_cbSearchInGlossaries, gridBagConstraints);

        jPanel13.add(m_SearchInProjectPane, java.awt.BorderLayout.WEST);

        jPanel9.setLayout(new java.awt.BorderLayout());
        jPanel9.add(filler25, java.awt.BorderLayout.WEST);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel9.add(jSeparator1, java.awt.BorderLayout.CENTER);
        jPanel9.add(filler9, java.awt.BorderLayout.EAST);

        jPanel13.add(jPanel9, java.awt.BorderLayout.EAST);

        m_SearchInPane.add(jPanel13, java.awt.BorderLayout.WEST);

        m_SearchInDirPane.setLayout(new java.awt.GridBagLayout());

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        buttonGroup2.add(m_rbDir);
        org.openide.awt.Mnemonics.setLocalizedText(m_rbDir, OStrings.getString("SW_DIR_SEARCH")); // NOI18N
        jPanel10.add(m_rbDir);
        jPanel10.add(filler15);

        m_recursiveCB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(m_recursiveCB, OStrings.getString("SW_DIR_RECURSIVE")); // NOI18N
        m_recursiveCB.setEnabled(false);
        jPanel10.add(m_recursiveCB);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        m_SearchInDirPane.add(jPanel10, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_dirLabel, OStrings.getString("SW_LOCATION")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        m_SearchInDirPane.add(m_dirLabel, gridBagConstraints);

        m_dirField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        m_SearchInDirPane.add(m_dirField, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_dirButton, OStrings.getString("SW_BROWSE")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        m_SearchInDirPane.add(m_dirButton, gridBagConstraints);

        m_SearchInPane.add(m_SearchInDirPane, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(m_SearchInPane, gridBagConstraints);

        m_advancedVisiblePane.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(m_authorCB, OStrings.getString("SW_AUTHOR")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        m_advancedVisiblePane.add(m_authorCB, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        m_advancedVisiblePane.add(m_authorField, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_dateFromCB, OStrings.getString("SW_CHANGED_AFTER")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        m_advancedVisiblePane.add(m_dateFromCB, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_dateFromButton, OStrings.getString("SW_NOW")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        m_advancedVisiblePane.add(m_dateFromButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_dateToCB, OStrings.getString("SW_CHANGED_BEFORE")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        m_advancedVisiblePane.add(m_dateToCB, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_dateToButton, OStrings.getString("SW_NOW")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        m_advancedVisiblePane.add(m_dateToButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_numberLabel, OStrings.getString("SW_NUMBER")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        m_advancedVisiblePane.add(m_numberLabel, gridBagConstraints);

        m_numberOfResults.setModel(new javax.swing.SpinnerNumberModel());
        m_numberOfResults.setMinimumSize(new java.awt.Dimension(100, 28));
        m_numberOfResults.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        m_advancedVisiblePane.add(m_numberOfResults, gridBagConstraints);

        m_dateFromSpinner.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        m_advancedVisiblePane.add(m_dateFromSpinner, gridBagConstraints);

        m_dateToSpinner.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        m_advancedVisiblePane.add(m_dateToSpinner, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        m_advancedVisiblePane.add(filler7, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_excludeOrphans, OStrings.getString("SW_EXCLUDE_ORPHANS")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        m_advancedVisiblePane.add(m_excludeOrphans, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(m_fullHalfWidthInsensitive, OStrings.getString("SW_FULLHALFWIDTH_INSENSITIVE")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        m_advancedVisiblePane.add(m_fullHalfWidthInsensitive, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(m_advancedVisiblePane, gridBagConstraints);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(m_advancedButton, OStrings.getString("SW_SHOW_ADVANCED_OPTIONS")); // NOI18N
        jPanel4.add(m_advancedButton);
        jPanel4.add(filler10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jPanel4, gridBagConstraints);

        m_viewer.setText(OStrings.getString("SW_VIEWER_TEXT")); // NOI18N
        jScrollPane1.setViewportView(m_viewer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));
        jPanel8.add(filler13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jPanel8, gridBagConstraints);

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(m_autoSyncWithEditor, OStrings.getString("SW_AUTO_SYNC")); // NOI18N
        m_autoSyncWithEditor.setFocusable(false);
        m_autoSyncWithEditor.setMinimumSize(new java.awt.Dimension(105, 21));
        jPanel7.add(m_autoSyncWithEditor);

        org.openide.awt.Mnemonics.setLocalizedText(m_backToInitialSegment, OStrings.getString("SW_BACK_TO_INITIAL_SEGMENT")); // NOI18N
        m_backToInitialSegment.setFocusable(false);
        m_backToInitialSegment.setMinimumSize(new java.awt.Dimension(105, 21));
        jPanel7.add(m_backToInitialSegment);
        jPanel7.add(filler12);

        org.openide.awt.Mnemonics.setLocalizedText(m_replaceAllButton, OStrings.getString("BUTTON_REPLACE_ALL")); // NOI18N
        m_replaceAllButton.setEnabled(false);
        jPanel7.add(m_replaceAllButton);
        jPanel7.add(filler18);

        org.openide.awt.Mnemonics.setLocalizedText(m_replaceButton, OStrings.getString("BUTTON_REPLACE")); // NOI18N
        m_replaceButton.setEnabled(false);
        jPanel7.add(m_replaceButton);
        jPanel7.add(filler16);

        org.openide.awt.Mnemonics.setLocalizedText(m_filterButton, OStrings.getString("BUTTON_FILTER")); // NOI18N
        m_filterButton.setEnabled(false);
        jPanel7.add(m_filterButton);
        jPanel7.add(filler1);

        org.openide.awt.Mnemonics.setLocalizedText(m_dismissButton, OStrings.getString("BUTTON_CLOSE")); // NOI18N
        jPanel7.add(m_dismissButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jPanel7, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.ButtonGroup buttonGroup2;
    javax.swing.ButtonGroup buttonGroupReplace;
    javax.swing.ButtonGroup buttonGroupSearch;
    javax.swing.ButtonGroup buttonGroupSearchState;
    javax.swing.Box.Filler filler1;
    javax.swing.Box.Filler filler10;
    javax.swing.Box.Filler filler11;
    javax.swing.Box.Filler filler12;
    javax.swing.Box.Filler filler13;
    javax.swing.Box.Filler filler14;
    javax.swing.Box.Filler filler15;
    javax.swing.Box.Filler filler16;
    javax.swing.Box.Filler filler17;
    javax.swing.Box.Filler filler18;
    javax.swing.Box.Filler filler19;
    javax.swing.Box.Filler filler2;
    javax.swing.Box.Filler filler20;
    javax.swing.Box.Filler filler21;
    javax.swing.Box.Filler filler22;
    javax.swing.Box.Filler filler23;
    javax.swing.Box.Filler filler24;
    javax.swing.Box.Filler filler25;
    javax.swing.Box.Filler filler26;
    javax.swing.Box.Filler filler27;
    javax.swing.Box.Filler filler28;
    javax.swing.Box.Filler filler29;
    javax.swing.Box.Filler filler3;
    javax.swing.Box.Filler filler30;
    javax.swing.Box.Filler filler4;
    javax.swing.Box.Filler filler5;
    javax.swing.Box.Filler filler6;
    javax.swing.Box.Filler filler7;
    javax.swing.Box.Filler filler8;
    javax.swing.Box.Filler filler9;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel10;
    javax.swing.JPanel jPanel11;
    javax.swing.JPanel jPanel12;
    javax.swing.JPanel jPanel13;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel5;
    javax.swing.JPanel jPanel7;
    javax.swing.JPanel jPanel8;
    javax.swing.JPanel jPanel9;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JPanel m_SearchInDirPane;
    javax.swing.JPanel m_SearchInPane;
    javax.swing.JPanel m_SearchInProjectPane;
    javax.swing.JButton m_advancedButton;
    javax.swing.JPanel m_advancedVisiblePane;
    javax.swing.JCheckBox m_allResultsCB;
    javax.swing.JCheckBox m_authorCB;
    org.omegat.gui.search.MFindField m_authorField;
    javax.swing.JCheckBox m_autoSyncWithEditor;
    javax.swing.JCheckBox m_backToInitialSegment;
    javax.swing.JCheckBox m_cbSearchInGlossaries;
    javax.swing.JCheckBox m_cbSearchInMemory;
    javax.swing.JCheckBox m_cbSearchInTMs;
    javax.swing.JButton m_dateFromButton;
    javax.swing.JCheckBox m_dateFromCB;
    javax.swing.JSpinner m_dateFromSpinner;
    javax.swing.JButton m_dateToButton;
    javax.swing.JCheckBox m_dateToCB;
    javax.swing.JSpinner m_dateToSpinner;
    javax.swing.JButton m_dirButton;
    javax.swing.JTextField m_dirField;
    javax.swing.JLabel m_dirLabel;
    javax.swing.JButton m_dismissButton;
    javax.swing.JLabel m_displayLabel;
    javax.swing.JCheckBox m_excludeOrphans;
    javax.swing.JCheckBox m_fileNamesCB;
    javax.swing.JButton m_filterButton;
    javax.swing.JLabel m_numberLabel;
    javax.swing.JSpinner m_numberOfResults;
    javax.swing.JPanel m_panelReplace;
    javax.swing.JPanel m_panelSearch;
    javax.swing.JRadioButton m_rbDir;
    javax.swing.JRadioButton m_rbProject;
    javax.swing.JCheckBox m_recursiveCB;
    javax.swing.JButton m_replaceAllButton;
    javax.swing.JButton m_replaceButton;
    javax.swing.JCheckBox m_replaceCase;
    javax.swing.JRadioButton m_replaceExactSearchRB;
    javax.swing.JComboBox m_replaceField;
    javax.swing.JLabel m_replaceLabel;
    javax.swing.JRadioButton m_replaceRegexpSearchRB;
    javax.swing.JCheckBox m_replaceSpaceMatchNbsp;
    javax.swing.JCheckBox m_replaceUntranslated;
    javax.swing.JLabel m_resultsLabel;
    javax.swing.JLabel m_resultsLabel1;
    javax.swing.JButton m_searchButton;
    javax.swing.JCheckBox m_searchCase;
    javax.swing.JCheckBox m_searchCommentsCB;
    javax.swing.JRadioButton m_searchExactSearchRB;
    javax.swing.JComboBox m_searchField;
    javax.swing.JRadioButton m_searchKeywordSearchRB;
    javax.swing.JLabel m_searchLabel;
    javax.swing.JCheckBox m_searchNotesCB;
    javax.swing.JRadioButton m_searchRegexpSearchRB;
    javax.swing.JCheckBox m_searchSource;
    javax.swing.JCheckBox m_searchSpaceMatchNbsp;
    javax.swing.JRadioButton m_searchTranslated;
    javax.swing.JRadioButton m_searchTranslatedUntranslated;
    javax.swing.JCheckBox m_searchTranslation;
    javax.swing.JRadioButton m_searchUntranslated;
    javax.swing.JTextPane m_viewer;
    javax.swing.JCheckBox m_fullHalfWidthInsensitive;
    // End of variables declaration//GEN-END:variables
}
