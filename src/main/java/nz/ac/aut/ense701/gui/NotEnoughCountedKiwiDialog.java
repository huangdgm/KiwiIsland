/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gui;

import javax.swing.JFrame;
import nz.ac.aut.ense701.main.Main;

/**
 * This window is designed to inform the player that there is not enough counted
 * kiwis to increase the stamina.
 *
 * @author ThiEric
 */
public class NotEnoughCountedKiwiDialog extends javax.swing.JFrame {

    /**
     * Creates new form NotEnoughCountedKiwiDialog
     */
    private JFrame jframe;
    private int kiwicount;

    public JFrame getJframe() {
        return jframe;
    }

    public void setJframe(JFrame jframe) {
        this.jframe = jframe;
    }

    public int getKiwicount() {
        return kiwicount;
    }

    public void setKiwicount(int kiwicount) {
        this.kiwicount = kiwicount;
    }

    public NotEnoughCountedKiwiDialog() {
        initComponents();
    }

    public NotEnoughCountedKiwiDialog(JFrame jframe) {
        this.jframe = jframe;
        initComponents();
        this.jframe.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okjBtn = new javax.swing.JButton();
        messagelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        okjBtn.setText("OK");
        okjBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okjBtnActionPerformed(evt);
            }
        });

        messagelbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        messagelbl.setText("<html><body> <p>Not enough Kiwi. You need to count at least 5 Kiwis.</p> </body> </html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okjBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(messagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okjBtn)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * By clicking OK button, it will re-enable the Main Frame.
     *
     * @param evt
     */
    private void okjBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okjBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        this.jframe.setEnabled(true);
        Main.gui.getPnlIsland().requestFocusInWindow();
    }//GEN-LAST:event_okjBtnActionPerformed

    /**
     * By closing the window, it will re-enable the main frame.
     *
     * @param evt
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Re-enable the main gui window after the current window is closed
        Main.gui.setEnabled(true);
        // Get the focus after the current window is closed.
        Main.gui.requestFocus();
        // Make the pnlIsland to get the focus to listen for the subsequent key release event
        Main.gui.getPnlIsland().requestFocusInWindow();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel messagelbl;
    private javax.swing.JButton okjBtn;
    // End of variables declaration//GEN-END:variables
}