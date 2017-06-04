/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nz.ac.aut.ense701.gameModel.ActionType;
import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gameModel.Kiwi;
import nz.ac.aut.ense701.gameModel.Occupant;
import nz.ac.aut.ense701.gameModel.Position;
import nz.ac.aut.ense701.main.Main;

/**
 * This class represents the visual frame from where the occupants can be
 * displayed and the action buttons can be performed on the occupants.
 *
 * @author Dong Huang
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
        this.occupants = game.getIsland().getOccupants(position);
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
        jTextAreaWikiDescription = new javax.swing.JTextArea();
        jLabelImage = new javax.swing.JLabel();
        jButtonCount = new javax.swing.JButton();
        jButtonCollect = new javax.swing.JButton();
        jButtonOpenWiki = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Occupant Information");
        setAlwaysOnTop(true);
        setFocusable(false);
        setLocation(new java.awt.Point(300, 200));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanelTitleAndImage.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Occupant"));

        buttonGroupSelectOccupant.add(jRadioButtonOccupant1);
        if(numOfOccupant >= 1) {
            jRadioButtonOccupant1.setVisible(true);
            jRadioButtonOccupant1.setText(game.getIsland().getOccupants(position)[0].getName());
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
            jRadioButtonOccupant2.setText(game.getIsland().getOccupants(position)[1].getName());
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
            jRadioButtonOccupant3.setText(game.getIsland().getOccupants(position)[2].getName());
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
            .addGroup(jPanelTitleAndImageLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jRadioButtonOccupant1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jRadioButtonOccupant2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jRadioButtonOccupant3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTitleAndImageLayout.setVerticalGroup(
            jPanelTitleAndImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleAndImageLayout.createSequentialGroup()
                .addGroup(jPanelTitleAndImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonOccupant2)
                    .addComponent(jRadioButtonOccupant3)
                    .addComponent(jRadioButtonOccupant1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDescription.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));

        jTextAreaWikiDescription.setEditable(false);
        jTextAreaWikiDescription.setColumns(20);
        jTextAreaWikiDescription.setLineWrap(true);
        jTextAreaWikiDescription.setRows(5);
        jTextAreaWikiDescription.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaWikiDescription);

        jLabelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonCount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonCount.setText("Count");
        if(!game.getIsland().hasPlayer(position)) {
            jButtonCount.setEnabled(false);
        }
        jButtonCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCountActionPerformed(evt);
            }
        });

        jButtonCollect.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonCollect.setText("Collect");
        if(!game.getIsland().hasPlayer(position)) {
            jButtonCollect.setEnabled(false);
        }
        jButtonCollect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCollectActionPerformed(evt);
            }
        });

        jButtonOpenWiki.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonOpenWiki.setText("Open wiki webpage");
        jButtonOpenWiki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenWikiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDescriptionLayout = new javax.swing.GroupLayout(jPanelDescription);
        jPanelDescription.setLayout(jPanelDescriptionLayout);
        jPanelDescriptionLayout.setHorizontalGroup(
            jPanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDescriptionLayout.createSequentialGroup()
                        .addComponent(jButtonCount, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCollect, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDescriptionLayout.createSequentialGroup()
                        .addComponent(jButtonOpenWiki)
                        .addGap(0, 243, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );

        jPanelDescriptionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCollect, jButtonCount});

        jPanelDescriptionLayout.setVerticalGroup(
            jPanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCount)
                        .addComponent(jButtonCollect))
                    .addComponent(jButtonOpenWiki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelTitleAndImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitleAndImage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonOccupant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOccupant1ActionPerformed
        Occupant occupant;
        String wikiDescription;

        occupant = occupants[0];
        wikiDescription = occupant.getWikiDescription();

        // Set the icon for the jLabel according to the occupant type
        setIconForJLableImage(occupant);
        // Set the text are for the jTextArea according to the occupant type
        jTextAreaWikiDescription.setText(wikiDescription);

        // Disable or enable the 'collect' and the 'count' buttons.
        updateTheButtonStatus(occupant);
    }//GEN-LAST:event_jRadioButtonOccupant1ActionPerformed

    private void jRadioButtonOccupant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOccupant2ActionPerformed
        Occupant occupant = game.getIsland().getOccupants(position)[1];
        String wikiDescription = occupant.getWikiDescription();

        // Set the icon for the jLabel according to the occupant type
        setIconForJLableImage(occupant);
        // Set the text are for the jTextArea according to the occupant type
        jTextAreaWikiDescription.setText(wikiDescription);

        // Disable or enable the 'collect' and the 'count' buttons.
        updateTheButtonStatus(occupant);
    }//GEN-LAST:event_jRadioButtonOccupant2ActionPerformed

    private void jRadioButtonOccupant3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOccupant3ActionPerformed
        Occupant occupant = game.getIsland().getOccupants(position)[2];
        String wikiDescription = occupant.getWikiDescription();

        // Set the icon for the jLabel according to the occupant type
        setIconForJLableImage(occupant);
        // Set the text are for the jTextArea according to the occupant type
        jTextAreaWikiDescription.setText(wikiDescription);

        // Disable or enable the 'collect' and the 'count' buttons.
        updateTheButtonStatus(occupant);
    }//GEN-LAST:event_jRadioButtonOccupant3ActionPerformed

    /**
     * This method is invoked after the collect button is pressed. In this
     * method, the selected occupant will be collected and then the button will
     * be disabled.
     *
     * @param evt The button click event
     * @return void
     */
    private void jButtonCollectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCollectActionPerformed
        switch (numOfOccupant) {
            case 1:
                if (jRadioButtonOccupant1.isSelected()) {
                    if (game.collectItem(occupants[0])) {
                        // After collecting the occupant, disable the collect button
                        ActivityPopupFrame actPop = new ActivityPopupFrame(occupants[0], this);
                        actPop.setIconForJLableImage();
                        actPop.setActivityTextArea(ActionType.COLLECT);
                        actPop.setVisible(true);

                        jButtonCollect.setEnabled(false);
                    }
                }

                break;
            case 2:
                if (jRadioButtonOccupant1.isSelected()) {
                    if (game.collectItem(occupants[0])) {

                        ActivityPopupFrame actPop = new ActivityPopupFrame(occupants[0], this);
                        actPop.setIconForJLableImage();
                        actPop.setActivityTextArea(ActionType.COLLECT);
                        actPop.setVisible(true);

                        jButtonCollect.setEnabled(false);
                    }
                } else if (jRadioButtonOccupant2.isSelected()) {
                    if (game.collectItem(occupants[1])) {

                        ActivityPopupFrame actPop = new ActivityPopupFrame(occupants[1], this);
                        actPop.setIconForJLableImage();
                        actPop.setActivityTextArea(ActionType.COLLECT);
                        actPop.setVisible(true);

                        jButtonCollect.setEnabled(false);
                    }
                }

                break;
            case 3:
                if (jRadioButtonOccupant1.isSelected()) {
                    if (game.collectItem(occupants[0])) {

                        ActivityPopupFrame actPop = new ActivityPopupFrame(occupants[0], this);
                        actPop.setIconForJLableImage();
                        actPop.setActivityTextArea(ActionType.COLLECT);
                        actPop.setVisible(true);

                        jButtonCollect.setEnabled(false);
                    }
                } else if (jRadioButtonOccupant2.isSelected()) {
                    if (game.collectItem(occupants[1])) {

                        ActivityPopupFrame actPop = new ActivityPopupFrame(occupants[1], this);
                        actPop.setIconForJLableImage();
                        actPop.setActivityTextArea(ActionType.COLLECT);
                        actPop.setVisible(true);

                        jButtonCollect.setEnabled(false);
                    }
                } else if (jRadioButtonOccupant3.isSelected()) {
                    if (game.collectItem(occupants[2])) {

                        ActivityPopupFrame actPop = new ActivityPopupFrame(occupants[2], this);
                        actPop.setIconForJLableImage();
                        actPop.setActivityTextArea(ActionType.COLLECT);
                        actPop.setVisible(true);

                        jButtonCollect.setEnabled(false);
                    }
                }

                break;

            default:
                break;
        }
    }//GEN-LAST:event_jButtonCollectActionPerformed

    /**
     * This method is invoked after the count button is pressed. In this method,
     * the selected occupant will be counted and then the button will be
     * disabled.
     *
     * @param evt The button click event
     * @return void
     */
    private void jButtonCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCountActionPerformed
        game.countKiwi();

        for (Occupant occupant : game.getIsland().getOccupants(position)) {
            if (occupant instanceof Kiwi) {
                Kiwi kiwi = (Kiwi) occupant;
                ActivityPopupFrame actPop = new ActivityPopupFrame(kiwi, this);
                actPop.setIconForJLableImage();
                actPop.setActivityTextArea(ActionType.COUNT);
                actPop.setVisible(true);
            }
        }

        // After the kiwi was counted, disable the count button
        jButtonCount.setEnabled(false);

    }//GEN-LAST:event_jButtonCountActionPerformed

    /**
     * This method is called when the wiki button is pressed. The method is used
     * to retrieve the occupant value and set the uri for that occupant.
     *
     * @param evt The mouse click event
     * @return void
     */
    private void jButtonOpenWikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenWikiActionPerformed
        String uri = null;

        // Set the uri value according to the occupant selected
        switch (numOfOccupant) {
            case 1:
                if (jRadioButtonOccupant1.isSelected()) {
                    uri = setURI(occupants[0]);
                }

                break;
            case 2:
                if (jRadioButtonOccupant1.isSelected()) {
                    uri = setURI(occupants[0]);
                } else if (jRadioButtonOccupant2.isSelected()) {
                    uri = setURI(occupants[1]);
                }

                break;
            case 3:
                if (jRadioButtonOccupant1.isSelected()) {
                    uri = setURI(occupants[0]);
                } else if (jRadioButtonOccupant2.isSelected()) {
                    uri = setURI(occupants[1]);
                } else if (jRadioButtonOccupant3.isSelected()) {
                    uri = setURI(occupants[2]);
                }

                break;
            default:
                break;
        }

        // Open the uri in the browser
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(uri));
        } catch (IOException ex) {
            Logger.getLogger(GridSquareInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonOpenWikiActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Re-enable the main gui window after the current window is closed
        Main.gui.setEnabled(true);
        // Get the focus after the current window is closed.
        Main.gui.requestFocus();
        // Make the pnlIsland to get the focus to listen for the subsequent key release event
        Main.gui.getPnlIsland().requestFocusInWindow();
    }//GEN-LAST:event_formWindowClosed

    /**
     * This method is used for set the icon for the jLabel, which is displayed
     * in the GridSquareInfoFrame. In this method, the jLabel is assigned with
     * the related image for the selected occupant. In the GridSquarInfoPanel,
     * when one occupant is selected, the corresponding image will be displayed
     * in the center of the window.
     *
     * @param occupant This specifies which image should be displayed.
     * @return void
     */
    private void setIconForJLableImage(Occupant occupant) {
        switch (occupant.getName()) {
            case "Kiwi":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi1.png")));
                break;
            case "Sandwich":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sandwich1.png")));
                break;
            case "Apple":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apple1.jpg")));
                break;
            case "Muesli Bar":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Muesli1.jpg")));
                break;
            case "Orange Juice":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oj1.jpg")));
                break;
            case "Trap":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap1.jpg")));
                break;
            case "Screwdriver":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/screwdriver1.jpg")));
                break;
            case "Oystercatcher":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Oystercatcher.jpg")));
                break;
            case "Crab":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crab.jpg")));
                break;
            case "Fernbird":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fernbird.jpg")));
                break;
            case "Heron":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heron.jpg")));
                break;
            case "Robin":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/robin.jpg")));
                break;
            case "Tui":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tui.jpg")));
                break;
            case "Rat":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rat.jpg")));
                break;
            case "Cat":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.jpg")));
                break;
            case "Kiore":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiore.jpg")));
                break;
            case "Stoat":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stoat.jpg")));
                break;
            case "Possum":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/possum.jpg")));
                break;
            case "Cliff":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliff.jpg")));
                break;
            case "Pond":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pond.jpg")));
                break;
            case "Rock":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rock.jpg")));
                break;
            case "Sunburn":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sunburn.jpg")));
                break;
            case "Fall":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fall.jpg")));
                break;
            case "Broken trap":
                jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brokentrap.jpg")));
                break;
            default:
                break;
        }
    }

    /**
     * This helper method helps disabling or enabling the buttons in the
     * GridSquareInfoPanel. When a specific radio button is selected, the status
     * of the buttons should reflect whether the occupants in the current grid
     * can be collected or counted.
     *
     * @param occupant Which occupant is selected.
     * @return void
     */
    private void updateTheButtonStatus(Occupant occupant) {
        if (occupant != null && game.hasPlayer(row, column)) {
            jButtonCollect.setEnabled(game.canCollect(occupant));
            jButtonCount.setEnabled(game.canCount(occupant));
        }
    }

    /**
     * This helper method sets the uri value according to the occupant type.
     *
     * @param occupant Specify the type of occupant from which the uri value can
     * be set
     * @return String The value of the URI of the occupant.
     */
    private String setURI(Occupant occupant) {
        String uri = null;

        switch (occupant.getName()) {
            case "Kiwi":
                uri = "https://en.wikipedia.org/wiki/Kiwi";
                break;
            case "Sandwich":
                uri = "https://en.wikipedia.org/wiki/Sandwich";
                break;
            case "Muesli":
                uri = "https://en.wikipedia.org/wiki/Muesli";
                break;
            case "Apple":
                uri = "https://en.wikipedia.org/wiki/Apple";
                break;
            case "Orange Juice":
                uri = "https://en.wikipedia.org/wiki/Orange_juice";
                break;
            case "Trap":
                uri = "https://en.wikipedia.org/wiki/Trapping";
                break;
            case "Screwdriver":
                uri = "https://en.wikipedia.org/wiki/Screwdriver";
                break;
            case "Oystercatcher":
                uri = "https://en.wikipedia.org/wiki/Oystercatcher";
                break;
            case "Crab":
                uri = "https://en.wikipedia.org/wiki/Crab";
                break;
            case "Fernbird":
                uri = "https://en.wikipedia.org/wiki/New_Zealand_fernbird";
                break;
            case "Heron":
                uri = "https://en.wikipedia.org/wiki/Heron";
                break;
            case "Robin":
                uri = "https://en.wikipedia.org/wiki/Robin";
                break;
            case "Tui":
                uri = "https://en.wikipedia.org/wiki/Tui";
                break;
            case "Rat":
                uri = "https://en.wikipedia.org/wiki/Rat";
                break;
            case "Cat":
                uri = "https://en.wikipedia.org/wiki/Cat";
                break;
            case "Kiore":
                uri = "https://en.wikipedia.org/wiki/Polynesian_rat";
                break;
            case "Stoat":
                uri = "https://en.wikipedia.org/wiki/Stoat";
                break;
            case "Possum":
                uri = "https://en.wikipedia.org/wiki/Possum";
                break;
            case "Cliff":
                uri = "https://en.wikipedia.org/wiki/Cliff";
                break;
            case "Pond":
                uri = "https://en.wikipedia.org/wiki/Pond";
                break;
            case "Rock":
                uri = "https://en.wikipedia.org/wiki/Rock";
                break;
            case "Sunburn":
                uri = "https://en.wikipedia.org/wiki/Sunburn";
                break;
            case "Fall":
                uri = "https://en.wikipedia.org/wiki/Autumn";
                break;
            case "Broken trap":
                uri = "https://en.wikipedia.org/wiki/Broken_trap";
                break;
            default:
                break;
        }

        return uri;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSelectOccupant;
    private javax.swing.JButton jButtonCollect;
    private javax.swing.JButton jButtonCount;
    private javax.swing.JButton jButtonOpenWiki;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanelDescription;
    private javax.swing.JPanel jPanelTitleAndImage;
    private javax.swing.JRadioButton jRadioButtonOccupant1;
    private javax.swing.JRadioButton jRadioButtonOccupant2;
    private javax.swing.JRadioButton jRadioButtonOccupant3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaWikiDescription;
    // End of variables declaration//GEN-END:variables

    private Game game;
    private int row, column;
    private int numOfOccupant = 0;
    private Position position;
    private Occupant[] occupants;
}
