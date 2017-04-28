/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2000-2006 Keith Godfrey and Maxym Mykhalchuk
               2013 Didier Briel
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

package org.omegat.gui.dialogs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.swing.JFileChooser;
import javax.swing.SwingWorker;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.omegat.util.Log;
import org.omegat.util.OStrings;
import org.omegat.util.Preferences;
import org.omegat.util.gui.OSXIntegration;
import org.omegat.util.gui.StaticUIUtils;

/**
 * Dialog showing the log.
 *
 * @author Maxym Mykhalchuk
 * @author Didier Briel
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class LogDialog extends javax.swing.JDialog {
    /** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if OK button has been pressed */
    public static final int RET_OK = 1;

    private int returnStatus = RET_CANCEL;

    /**
     * Creates new form LogDialog
     */
    public LogDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();

        setTitle(OStrings.getString("LOGDIALOG_TITLE") + " " + Log.getLogFileName());

        StaticUIUtils.setEscapeClosable(this);

        setSize(600, 400);
        setLocationRelativeTo(parent);

        final File logLocation = new File(Log.getLogFilePath());
        new SwingWorker<String, Object>() {
            @Override
            protected String doInBackground() throws Exception {
                try (FileInputStream fis = new FileInputStream(logLocation)) {
                    return IOUtils.toString(fis, StandardCharsets.UTF_8);
                } catch (Exception e) {
                    return "";
                }
            }
            protected void done() {
                try {
                    logTextPane.setText(get());
                } catch (Exception e) {
                    Log.log(e);
                }
                logTextPane.setCaretPosition(0);
                OSXIntegration.setProxyIcon(getRootPane(), logLocation);
            };
        }.execute();
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        logTextPane = new javax.swing.JTextPane();
        buttonPanel = new javax.swing.JPanel();
        innerButtonPanel = new javax.swing.JPanel();
        saveAsButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setTitle(OStrings.getString("LOGDIALOG_TITLE")); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        logTextPane.setEditable(false);
        scroll.setViewportView(logTextPane);

        getContentPane().add(scroll, java.awt.BorderLayout.CENTER);

        buttonPanel.setLayout(new java.awt.BorderLayout());

        innerButtonPanel.setLayout(new javax.swing.BoxLayout(innerButtonPanel, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(saveAsButton, OStrings.getString("BUTTON_SAVE_AS")); // NOI18N
        saveAsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsButtonActionPerformed(evt);
            }
        });
        innerButtonPanel.add(saveAsButton);

        org.openide.awt.Mnemonics.setLocalizedText(okButton, OStrings.getString("BUTTON_OK")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        innerButtonPanel.add(okButton);

        buttonPanel.add(innerButtonPanel, java.awt.BorderLayout.EAST);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        doClose(RET_OK);
    }//GEN-LAST:event_okButtonActionPerformed

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void saveAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsButtonActionPerformed
        String curDir = Preferences.getPreferenceDefault(Preferences.CURRENT_FOLDER, System.getProperty("user.home"));
        JFileChooser chooser = new JFileChooser();
        chooser.setSelectedFile(new File(curDir, Log.getLogFileName()));
        if (chooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File outFile = chooser.getSelectedFile();
        if (outFile.exists() && !FileCollisionDialog.promptToReplace(this, outFile.getName())) {
            return;
        }
        try {
            FileUtils.copyFile(new File (Log.getLogFilePath()), chooser.getSelectedFile());
        } catch (IOException ex) {
            Log.log(ex);
        }
        Preferences.setPreference(Preferences.CURRENT_FOLDER, outFile.getParent());
    }//GEN-LAST:event_saveAsButtonActionPerformed

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel innerButtonPanel;
    private javax.swing.JTextPane logTextPane;
    private javax.swing.JButton okButton;
    private javax.swing.JButton saveAsButton;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
