/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.omegat.gui.preferences.view;

/**
 *
 * @author Hiroshi Miura
 */
@SuppressWarnings("serial")
public class PluginDetailHeader extends javax.swing.JPanel {

    /**
     * Creates new form PluginDetailHeader
     */
    public PluginDetailHeader() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelCategory = new javax.swing.JLabel();
        installButton = new javax.swing.JButton();
        labelPluginName = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32876, 64));
        setMinimumSize(new java.awt.Dimension(100, 64));
        setPreferredSize(new java.awt.Dimension(100, 64));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 56));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 32));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 32));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 32));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        jPanel3.setLayout(flowLayout1);

        labelCategory.setText("category");
        jPanel3.add(labelCategory);

        installButton.setText("Install");
        jPanel3.add(installButton);

        jPanel2.add(jPanel3);

        labelPluginName.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelPluginName.setText("Name");
        jPanel2.add(labelPluginName);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton installButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    javax.swing.JLabel labelCategory;
    javax.swing.JLabel labelPluginName;
    // End of variables declaration//GEN-END:variables
}
