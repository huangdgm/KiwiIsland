/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gui;

import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gameModel.Position;

/**
 *
 * @author Administrator
 */
public class GridSquareInfoFrame extends javax.swing.JFrame {

    /**
     * Creates new form GridSquareInfoFrame
     */
    public GridSquareInfoFrame(Game game, int row, int column) {
        this.game = game;
        this.row = row;
        this.column = column;
        this.position = new Position(game.getIsland(), row, column);
        this.numOfOccupant = game.getIsland().getOccupants(position).length;
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

        buttonGroupSelectOccupant = new javax.swing.ButtonGroup();
        jPanelTitleAndImage = new javax.swing.JPanel();
        jRadioButtonOccupant1 = new javax.swing.JRadioButton();
        jRadioButtonOccupant2 = new javax.swing.JRadioButton();
        jRadioButtonOccupant3 = new javax.swing.JRadioButton();
        jPanelDescription = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonUse = new javax.swing.JButton();
        jButtonDrop = new javax.swing.JButton();
        jButtonCount = new javax.swing.JButton();
        jButtonCollect = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Occupant Information");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(400, 200));

        jPanelTitleAndImage.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Occupant"));

        buttonGroupSelectOccupant.add(jRadioButtonOccupant1);
        if(numOfOccupant >= 1) {
            jRadioButtonOccupant1.setVisible(true);
            jRadioButtonOccupant1.setText(game.getIsland().getOccupants(new Position(game.getIsland(),row,column))[0].getName());
        }else {
            jRadioButtonOccupant1.setVisible(false);
        }
        jRadioButtonOccupant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOccupant1ActionPerformed(evt);
            }
        });

        buttonGroupSelectOccupant.add(jRadioButtonOccupant2);
        if(numOfOccupant >= 2) {
            jRadioButtonOccupant2.setVisible(true);
            jRadioButtonOccupant2.setText(game.getIsland().getOccupants(new Position(game.getIsland(),row,column))[1].getName());
        } else {
            jRadioButtonOccupant2.setVisible(false);
        }
        jRadioButtonOccupant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOccupant2ActionPerformed(evt);
            }
        });

        buttonGroupSelectOccupant.add(jRadioButtonOccupant3);
        if(numOfOccupant >= 3) {
            jRadioButtonOccupant3.setVisible(true);
            jRadioButtonOccupant3.setText(game.getIsland().getOccupants(new Position(game.getIsland(),row,column))[2].getName());
        }else {
            jRadioButtonOccupant3.setVisible(false);
        }
        jRadioButtonOccupant3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOccupant3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleAndImageLayout = new javax.swing.GroupLayout(jPanelTitleAndImage);
        jPanelTitleAndImage.setLayout(jPanelTitleAndImageLayout);
        jPanelTitleAndImageLayout.setHorizontalGroup(
            jPanelTitleAndImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleAndImageLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jRadioButtonOccupant1)
                .addGap(66, 66, 66)
                .addComponent(jRadioButtonOccupant2)
                .addGap(60, 60, 60)
                .addComponent(jRadioButtonOccupant3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTitleAndImageLayout.setVerticalGroup(
            jPanelTitleAndImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleAndImageLayout.createSequentialGroup()
                .addGroup(jPanelTitleAndImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonOccupant1)
                    .addComponent(jRadioButtonOccupant2)
                    .addComponent(jRadioButtonOccupant3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDescription.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanelDescriptionLayout = new javax.swing.GroupLayout(jPanelDescription);
        jPanelDescription.setLayout(jPanelDescriptionLayout);
        jPanelDescriptionLayout.setHorizontalGroup(
            jPanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescriptionLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelDescriptionLayout.setVerticalGroup(
            jPanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        jButtonUse.setText("Use");

        jButtonDrop.setText("Drop");

        jButtonCount.setText("Count");

        jButtonCollect.setText("Collect");

        jLabelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelTitleAndImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonUse, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCount, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCollect, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(66, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCollect, jButtonCount, jButtonDrop, jButtonUse});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitleAndImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonUse)
                    .addComponent(jButtonDrop)
                    .addComponent(jButtonCount)
                    .addComponent(jButtonCollect))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonOccupant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOccupant1ActionPerformed
        String wikiDescription = game.getIsland().getOccupants(new Position(game.getIsland(),row,column))[0].getWikiDescription();
        jTextArea1.setText(wikiDescription);
    }//GEN-LAST:event_jRadioButtonOccupant1ActionPerformed

    private void jRadioButtonOccupant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOccupant2ActionPerformed
        String wikiDescription = game.getIsland().getOccupants(new Position(game.getIsland(),row,column))[1].getWikiDescription();
        jTextArea1.setText(wikiDescription);
    }//GEN-LAST:event_jRadioButtonOccupant2ActionPerformed

    private void jRadioButtonOccupant3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOccupant3ActionPerformed
        String wikiDescription = game.getIsland().getOccupants(new Position(game.getIsland(),row,column))[2].getWikiDescription();
        jTextArea1.setText(wikiDescription);
    }//GEN-LAST:event_jRadioButtonOccupant3ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GridSquareInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GridSquareInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GridSquareInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GridSquareInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GridSquareInfoFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSelectOccupant;
    private javax.swing.JButton jButtonCollect;
    private javax.swing.JButton jButtonCount;
    private javax.swing.JButton jButtonDrop;
    private javax.swing.JButton jButtonUse;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanelDescription;
    private javax.swing.JPanel jPanelTitleAndImage;
    private javax.swing.JRadioButton jRadioButtonOccupant1;
    private javax.swing.JRadioButton jRadioButtonOccupant2;
    private javax.swing.JRadioButton jRadioButtonOccupant3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    private Game game;
    private int row, column;
    private int numOfOccupant = 0;
    private Position position;
}
