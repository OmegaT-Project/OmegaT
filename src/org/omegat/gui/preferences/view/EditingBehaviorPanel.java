/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2000-2006 Keith Godfrey and Maxym Mykhalchuk
               2009 Didier Briel
               2011 John Moran, Didier Briel
               2012 Didier Briel
               2016 Aaron Madlon-Kay
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

package org.omegat.gui.preferences.view;

import javax.swing.JPanel;

import org.omegat.util.OStrings;

/**
 * @author Maxym Mykhalchuk
 * @author Didier Briel
 * @author John Moran
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class EditingBehaviorPanel extends JPanel {

    /** Creates new form EditingBehaviorPanel */
    public EditingBehaviorPanel() {
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

        ourButtonGroup = new javax.swing.ButtonGroup();
        descriptionTextArea = new javax.swing.JTextArea();
        defaultRadio = new javax.swing.JRadioButton();
        leaveEmptyRadio = new javax.swing.JRadioButton();
        insertFuzzyCheckBox = new javax.swing.JCheckBox();
        similarityLabel = new javax.swing.JLabel();
        similaritySpinner = new javax.swing.JSpinner();
        prefixLabel = new javax.swing.JLabel();
        prefixText = new javax.swing.JTextField();
        convertNumbers = new javax.swing.JCheckBox();
        allowTranslationEqualToSource = new javax.swing.JCheckBox();
        exportCurrentSegment = new javax.swing.JCheckBox();
        stopOnAlternativeTranslation = new javax.swing.JCheckBox();
        allowTagEditing = new javax.swing.JCheckBox();
        tagValidateOnLeave = new javax.swing.JCheckBox();
        cbSaveAutoStatus = new javax.swing.JCheckBox();
        initialSegCountLabel = new javax.swing.JLabel();
        initialSegCountSpinner = new javax.swing.JSpinner();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new java.awt.GridBagLayout());

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(prefixLabel.getFont());
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setText(OStrings.getString("GUI_WORKFLOW_DESCRIPTION")); // NOI18N
        descriptionTextArea.setWrapStyleWord(true);
        descriptionTextArea.setDragEnabled(false);
        descriptionTextArea.setFocusable(false);
        descriptionTextArea.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        add(descriptionTextArea, gridBagConstraints);

        ourButtonGroup.add(defaultRadio);
        defaultRadio.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(defaultRadio, OStrings.getString("WF_OPTION_INSERT_SOURCE")); // NOI18N
        defaultRadio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        defaultRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 0);
        add(defaultRadio, gridBagConstraints);

        ourButtonGroup.add(leaveEmptyRadio);
        org.openide.awt.Mnemonics.setLocalizedText(leaveEmptyRadio, OStrings.getString("WF_OPTION_INSERT_NOTHTHING")); // NOI18N
        leaveEmptyRadio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(leaveEmptyRadio, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(insertFuzzyCheckBox, OStrings.getString("WF_OPTION_INSERT_FUZZY_MATCH")); // NOI18N
        insertFuzzyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        add(insertFuzzyCheckBox, gridBagConstraints);

        similarityLabel.setLabelFor(similaritySpinner);
        org.openide.awt.Mnemonics.setLocalizedText(similarityLabel, OStrings.getString("GUI_WORKFLOW_OPTION_Minimal_Similarity")); // NOI18N
        similarityLabel.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 5);
        add(similarityLabel, gridBagConstraints);

        similaritySpinner.setEnabled(false);
        similaritySpinner.setValue(90);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(similaritySpinner, gridBagConstraints);

        prefixLabel.setLabelFor(prefixText);
        org.openide.awt.Mnemonics.setLocalizedText(prefixLabel, OStrings.getString("WF_OPTION_INSERT_FUZZY_PREFIX")); // NOI18N
        prefixLabel.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 5);
        add(prefixLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(prefixText, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(convertNumbers, OStrings.getString("WF_OPTION_CONVERT_NUMBERS")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        add(convertNumbers, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(allowTranslationEqualToSource, OStrings.getString("WF_OPTION_ALLOW_TRANS_EQ_TO_SRC")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(allowTranslationEqualToSource, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(exportCurrentSegment, OStrings.getString("WF_OPTION_EXPORT__CURRENT_SEGMENT")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(exportCurrentSegment, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(stopOnAlternativeTranslation, OStrings.getString("WF_OPTION_GOTO_NEXT_UNTRANSLATED")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(stopOnAlternativeTranslation, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(allowTagEditing, OStrings.getString("WF_TAG_EDITING")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(allowTagEditing, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(tagValidateOnLeave, OStrings.getString("WG_TAG_VALIDATE_ON_LEAVE")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(tagValidateOnLeave, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(cbSaveAutoStatus, OStrings.getString("WG_SAVE_AUTO_STATUS")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(cbSaveAutoStatus, gridBagConstraints);

        initialSegCountLabel.setLabelFor(initialSegCountSpinner);
        org.openide.awt.Mnemonics.setLocalizedText(initialSegCountLabel, OStrings.getString("WG_INITIAL_SEGMENT_LOAD_COUNT")); // NOI18N
        initialSegCountLabel.setToolTipText(OStrings.getString("WG_INITIAL_SEGMENT_LOAD_COUNT_TOOLTIP")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        add(initialSegCountLabel, gridBagConstraints);

        initialSegCountSpinner.setToolTipText(OStrings.getString("WG_INITIAL_SEGMENT_LOAD_COUNT_TOOLTIP")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(initialSegCountSpinner, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(filler1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void radiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiosActionPerformed

    }//GEN-LAST:event_radiosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox allowTagEditing;
    javax.swing.JCheckBox allowTranslationEqualToSource;
    javax.swing.JCheckBox cbSaveAutoStatus;
    javax.swing.JCheckBox convertNumbers;
    javax.swing.JRadioButton defaultRadio;
    private javax.swing.JTextArea descriptionTextArea;
    javax.swing.JCheckBox exportCurrentSegment;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel initialSegCountLabel;
    javax.swing.JSpinner initialSegCountSpinner;
    javax.swing.JCheckBox insertFuzzyCheckBox;
    javax.swing.JRadioButton leaveEmptyRadio;
    private javax.swing.ButtonGroup ourButtonGroup;
    javax.swing.JLabel prefixLabel;
    javax.swing.JTextField prefixText;
    javax.swing.JLabel similarityLabel;
    javax.swing.JSpinner similaritySpinner;
    javax.swing.JCheckBox stopOnAlternativeTranslation;
    javax.swing.JCheckBox tagValidateOnLeave;
    // End of variables declaration//GEN-END:variables

}
