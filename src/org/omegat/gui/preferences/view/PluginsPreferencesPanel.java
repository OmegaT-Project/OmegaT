/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2016 Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: https://omegat.org/support

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
 * @author Aaron Madlon-Kay
 * @author Briac Pilpre
 */
@SuppressWarnings("serial")
public class PluginsPreferencesPanel extends JPanel {

    /** Creates new form PluginsPanel */
    public PluginsPreferencesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pluginsInfoTab = new javax.swing.JTabbedPane();
        installPlugins = new javax.swing.JSplitPane();
        panelPluginsInfo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filterTextField = new javax.swing.JTextField();
        scrollTable = new javax.swing.JScrollPane();
        tablePluginsInfo = new javax.swing.JTable();
        panelPluginDetails = new javax.swing.JPanel();
        scrollText = new javax.swing.JScrollPane();
        pluginDetails = new javax.swing.JTextArea();
        availablePluginsInfo = new javax.swing.JPanel();
        pluginWikiInfo = new javax.swing.JPanel();
        messageLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        browsePluginsButton = new javax.swing.JButton();
        operationPanel = new javax.swing.JPanel();
        installFromDiskButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setMinimumSize(new java.awt.Dimension(250, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        panelPluginsInfo.setPreferredSize(new java.awt.Dimension(252, 426));
        panelPluginsInfo.setLayout(new javax.swing.BoxLayout(panelPluginsInfo, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, "Filter name:");
        jPanel1.add(jLabel1);

        filterTextField.setToolTipText("filter by name");
        jPanel1.add(filterTextField);

        panelPluginsInfo.add(jPanel1);

        tablePluginsInfo.setAutoCreateRowSorter(true);
        tablePluginsInfo.setModel(new PluginInfoTableModel());
        tablePluginsInfo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePluginsInfo.getColumnModel().getColumn(PluginInfoTableModel.COLUMN_VERSION).setPreferredWidth(50);
        scrollTable.setViewportView(tablePluginsInfo);

        panelPluginsInfo.add(scrollTable);

        installPlugins.setLeftComponent(panelPluginsInfo);

        panelPluginDetails.setMinimumSize(new java.awt.Dimension(102, 47));
        panelPluginDetails.setLayout(new javax.swing.BoxLayout(panelPluginDetails, javax.swing.BoxLayout.PAGE_AXIS));

        scrollText.setPreferredSize(new java.awt.Dimension(262, 100));

        pluginDetails.setEditable(false);
        pluginDetails.setColumns(20);
        pluginDetails.setLineWrap(true);
        pluginDetails.setRows(5);
        pluginDetails.setFocusable(false);
        pluginDetails.setPreferredSize(new java.awt.Dimension(252, 80));
        scrollText.setViewportView(pluginDetails);

        panelPluginDetails.add(scrollText);

        installPlugins.setRightComponent(panelPluginDetails);

        pluginsInfoTab.addTab("Installed plugins", installPlugins);

        availablePluginsInfo.setLayout(new java.awt.BorderLayout());

        pluginWikiInfo.setLayout(new javax.swing.BoxLayout(pluginWikiInfo, javax.swing.BoxLayout.PAGE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(messageLabel, OStrings.getString("PREFS_PLUGINS_AVAILABLE_ONLINE")); // NOI18N
        messageLabel.setAlignmentY(0.0F);
        pluginWikiInfo.add(messageLabel);
        pluginWikiInfo.add(filler1);

        org.openide.awt.Mnemonics.setLocalizedText(browsePluginsButton, OStrings.getString("PREFS_PLUGINS_BROWSE_ONLINE")); // NOI18N
        browsePluginsButton.setAlignmentY(0.0F);
        pluginWikiInfo.add(browsePluginsButton);

        availablePluginsInfo.add(pluginWikiInfo, java.awt.BorderLayout.CENTER);

        pluginsInfoTab.addTab("Available plugins", availablePluginsInfo);

        add(pluginsInfoTab);
        pluginsInfoTab.getAccessibleContext().setAccessibleName("plugins information");

        operationPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        org.openide.awt.Mnemonics.setLocalizedText(installFromDiskButton, "Install from Disk");
        operationPanel.add(installFromDiskButton);

        add(operationPanel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availablePluginsInfo;
    javax.swing.JButton browsePluginsButton;
    private javax.swing.Box.Filler filler1;
    javax.swing.JTextField filterTextField;
    javax.swing.JButton installFromDiskButton;
    private javax.swing.JSplitPane installPlugins;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JPanel operationPanel;
    private javax.swing.JPanel panelPluginDetails;
    private javax.swing.JPanel panelPluginsInfo;
    javax.swing.JTextArea pluginDetails;
    private javax.swing.JPanel pluginWikiInfo;
    private javax.swing.JTabbedPane pluginsInfoTab;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JScrollPane scrollText;
    javax.swing.JTable tablePluginsInfo;
    // End of variables declaration//GEN-END:variables
}
