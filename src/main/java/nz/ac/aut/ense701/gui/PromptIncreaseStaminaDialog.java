/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gui;

import java.awt.HeadlessException;
import javax.swing.*;
import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.main.Main;

/**
 *
 * @author ThiEric
 */
public class PromptIncreaseStaminaDialog extends javax.swing.JFrame {

    /**
     * Creates new form PromptIncreaseStaminaDialog
     */
    
    private int numKiwi;
    private double stamina;
    private Game game;
    private JFrame jframe;
    private JLabel lblKiwiCount;
    private JProgressBar staminaProgress;

    public int getNumKiwi() {
        return numKiwi;
    }

    public void setNumKiwi(int numKiwi) {
        this.numKiwi = numKiwi;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }
    
    
    public PromptIncreaseStaminaDialog() {
        initComponents();
    }

    public JFrame getJframe() {
        return jframe;
    }

    public void setJframe(JFrame jframe) {
        this.jframe = jframe;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public JLabel getLblKiwiCount() {
        return lblKiwiCount;
    }

    public void setLblKiwiCount(JLabel lblKiwiCount) {
        this.lblKiwiCount = lblKiwiCount;
    }

    public JProgressBar getStaminaProgress() {
        return staminaProgress;
    }

    public void setStaminaProgress(JProgressBar staminaProgress) {
        this.staminaProgress = staminaProgress;
    }
    
    

    public PromptIncreaseStaminaDialog(int numKiwi, double stamina, JFrame jframe,
                Game game) {
        initComponents();
        this.numKiwi = numKiwi;
        this.stamina = stamina;
        this.jframe = jframe;
        this.game = game;
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

        messagelbl = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        cancelBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        messagelbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        messagelbl.setText("Do you want to increase your stamina by 50%?");

        acceptBtn.setText("Accept");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        cancelBtn1.setText("Cancel");
        cancelBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messagelbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(acceptBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBtn1)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(messagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(cancelBtn1))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Main.gui.setEnabled(true);
        // Get the focus after the current window is closed.
        Main.gui.requestFocus();
        // Make the pnlIsland to get the focus to listen for the subsequent key release event
        Main.gui.getPnlIsland().requestFocusInWindow();
    }//GEN-LAST:event_formWindowClosing

    //The accept button is used to increase the stamina and 
    //update the kiwi count label and stamina progress bar.
    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        this.game.getPlayer().increaseStamina(this.stamina * 0.5 + this.stamina);
        this.game.decreaseKiwiCount();
        this.staminaProgress.setValue(new Double(this.game.getPlayer().getStaminaLevel()).intValue());
        this.lblKiwiCount.setText(Integer.toString(game.getKiwiCount()));
        Main.gui.setEnabled(true);
        // Get the focus after the current window is closed.
        Main.gui.requestFocus();
        // Make the pnlIsland to get the focus to listen for the subsequent key release event
        Main.gui.getPnlIsland().requestFocusInWindow();
    }//GEN-LAST:event_acceptBtnActionPerformed

    //Press cancel to not accept to increase stamina,
    //but it will display the guide how to increase stamina.
    private void cancelBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtn1ActionPerformed
        // TODO add your handling code here:
        this.jframe.setEnabled(true);
        this.dispose();
        GiveStaminaInfoDialog staminDialog = new GiveStaminaInfoDialog(Main.gui);
        staminDialog.setVisible(true);
    }//GEN-LAST:event_cancelBtn1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //When this dialog pop up, it should disable the main Frame.
        this.jframe.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton cancelBtn1;
    private javax.swing.JLabel messagelbl;
    // End of variables declaration//GEN-END:variables
}
