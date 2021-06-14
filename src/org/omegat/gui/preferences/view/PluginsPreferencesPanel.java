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
 * @author Hiroshi Miura
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
        scrollTable = new javax.swing.JScrollPane();
        tablePluginsInfo = new javax.swing.JTable();
        panelPluginDetails = new javax.swing.JPanel();
        availablePlugins = new javax.swing.JSplitPane();
        panelAvalablePluginsInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAvailablePluginsInfo = new javax.swing.JTable();
        panelAvailablePluginDetails = new javax.swing.JPanel();
        otherInfoPanel = new javax.swing.JPanel();
        browsePluginsButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        operationPanel = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        installFromDiskButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setMinimumSize(new java.awt.Dimension(250, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        panelPluginsInfo.setMinimumSize(new java.awt.Dimension(150, 23));
        panelPluginsInfo.setPreferredSize(new java.awt.Dimension(252, 426));
        panelPluginsInfo.setLayout(new javax.swing.BoxLayout(panelPluginsInfo, javax.swing.BoxLayout.PAGE_AXIS));

        tablePluginsInfo.setAutoCreateRowSorter(true);
        tablePluginsInfo.setModel(PluginsPreferencesController.getInstalledPluginInfoTableModel());
        tablePluginsInfo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollTable.setViewportView(tablePluginsInfo);

        panelPluginsInfo.add(scrollTable);

        installPlugins.setLeftComponent(panelPluginsInfo);

        panelPluginDetails.setLayout(new javax.swing.BoxLayout(panelPluginDetails, javax.swing.BoxLayout.PAGE_AXIS));
        installPlugins.setRightComponent(panelPluginDetails);

        pluginsInfoTab.addTab("Installed plugins", installPlugins);

        panelAvalablePluginsInfo.setLayout(new javax.swing.BoxLayout(panelAvalablePluginsInfo, javax.swing.BoxLayout.LINE_AXIS));

        tableAvailablePluginsInfo.setAutoCreateRowSorter(true);
        tableAvailablePluginsInfo.setModel(PluginsPreferencesController.getAvailablePluginInfoTableModel());
        tableAvailablePluginsInfo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableAvailablePluginsInfo);

        panelAvalablePluginsInfo.add(jScrollPane1);

        availablePlugins.setLeftComponent(panelAvalablePluginsInfo);

        panelAvailablePluginDetails.setLayout(new javax.swing.BoxLayout(panelAvailablePluginDetails, javax.swing.BoxLayout.PAGE_AXIS));
        availablePlugins.setRightComponent(panelAvailablePluginDetails);

        pluginsInfoTab.addTab("Available plugins", availablePlugins);

        org.openide.awt.Mnemonics.setLocalizedText(browsePluginsButton, OStrings.getString("PREFS_PLUGINS_BROWSE_ONLINE")); // NOI18N
        browsePluginsButton.setAlignmentY(0.0F);
        otherInfoPanel.add(browsePluginsButton);

        org.openide.awt.Mnemonics.setLocalizedText(messageLabel, OStrings.getString("PREFS_PLUGINS_AVAILABLE_ONLINE")); // NOI18N
        messageLabel.setAlignmentY(0.0F);
        otherInfoPanel.add(messageLabel);

        pluginsInfoTab.addTab("Other plugin information", otherInfoPanel);

        add(pluginsInfoTab);
        pluginsInfoTab.getAccessibleContext().setAccessibleName("plugins information");

        operationPanel.setLayout(new javax.swing.BoxLayout(operationPanel, javax.swing.BoxLayout.LINE_AXIS));
        operationPanel.add(filler1);

        org.openide.awt.Mnemonics.setLocalizedText(installFromDiskButton, "Install from Disk");
        operationPanel.add(installFromDiskButton);

        add(operationPanel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane availablePlugins;
    javax.swing.JButton browsePluginsButton;
    private javax.swing.Box.Filler filler1;
    javax.swing.JButton installFromDiskButton;
    private javax.swing.JSplitPane installPlugins;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JPanel operationPanel;
    private javax.swing.JPanel otherInfoPanel;
    javax.swing.JPanel panelAvailablePluginDetails;
    private javax.swing.JPanel panelAvalablePluginsInfo;
    javax.swing.JPanel panelPluginDetails;
    private javax.swing.JPanel panelPluginsInfo;
    private javax.swing.JTabbedPane pluginsInfoTab;
    private javax.swing.JScrollPane scrollTable;
    javax.swing.JTable tableAvailablePluginsInfo;
    javax.swing.JTable tablePluginsInfo;
    // End of variables declaration//GEN-END:variables
}
