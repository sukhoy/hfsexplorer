/*-
 * Copyright (C) 2007 Erik Larsson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * FileOperationsPanel.java
 *
 * Created on den 27 juni 2007, 08:56
 */

package org.catacombae.hfsexplorer.gui;

import javax.swing.JDialog;
import java.awt.event.ActionListener;

/**
 * @author <a href="http://www.catacombae.org/" target="_top">Erik Larsson</a>
 */
public class FileOperationsPanel extends javax.swing.JPanel {

    /** Creates new form FileOperationsPanel */
    public FileOperationsPanel(JDialog dialog, String filename, long fileSize,
                               ActionListener openListener,
                               ActionListener saveListener) {
        initComponents();
        filenameField.setText(filename);
        sizeField.setText("" + fileSize + " bytes");
        if(openListener != null) {
            openFileButton.addActionListener(openListener);
            openFileButton.setEnabled(true);
            dialog.getRootPane().setDefaultButton(openFileButton);
        }
        else {
            dialog.getRootPane().setDefaultButton(saveFileButton);
        }
        saveFileButton.addActionListener(saveListener);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        openFileButton = new javax.swing.JButton();
        saveFileButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        filenameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sizeField = new javax.swing.JTextField();

        openFileButton.setText("Open file");
        openFileButton.setToolTipText("Extracts the file to a temporary folder and\nopens it with the platform's default helper");
        openFileButton.setEnabled(false);

        saveFileButton.setText("Save file to...");

        jLabel1.setText("Filename:");

        filenameField.setEditable(false);
        filenameField.setText("jTextField1");
        filenameField.setBorder(null);
        filenameField.setOpaque(false);

        jLabel2.setText("Size:");

        sizeField.setEditable(false);
        sizeField.setText("jTextField2");
        sizeField.setBorder(null);
        sizeField.setOpaque(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(openFileButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(saveFileButton))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(sizeField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .add(filenameField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(filenameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(sizeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(openFileButton)
                    .add(saveFileButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filenameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton openFileButton;
    private javax.swing.JButton saveFileButton;
    private javax.swing.JTextField sizeField;
    // End of variables declaration//GEN-END:variables

}
