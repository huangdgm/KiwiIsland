package nz.ac.aut.ense701.gui;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import nz.ac.aut.ense701.gameModel.ActionType;
import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gameModel.GameEventListener;
import nz.ac.aut.ense701.gameModel.GameState;
import nz.ac.aut.ense701.gameModel.MoveDirection;
import nz.ac.aut.ense701.gameModel.Occupant;
import nz.ac.aut.ense701.main.Main;

/*
 * User interface form for Kiwi Island.
 * 
 * @author AS
 * @version July 2011
 */
public class KiwiCountUI extends javax.swing.JFrame implements GameEventListener {

    /**
     * Creates a GUI for the KiwiIsland game.
     *
     * @param game the game object to represent with this GUI.
     */
    public KiwiCountUI(Game game) {
        assert game != null : "Make sure game object is created before UI";
        this.game = game;
        setAsGameListener();

        initComponents();
        initIslandGrid();

        update();
    }

    /**
     * This method is called by the game model every time something changes.
     * Trigger an update.
     */
    @Override
    public void gameStateChanged() {
        update();

        // check for "game over" or "game won"
        if (game.getState() == GameState.LOST) {
            JOptionPane.showMessageDialog(this, game.getLoseMessage(), "Game over!", JOptionPane.INFORMATION_MESSAGE);
            game.createNewGame();
        } else if (game.getState() == GameState.WON) {
            JOptionPane.showMessageDialog(this, game.getWinMessage(), "Well Done!", JOptionPane.INFORMATION_MESSAGE);
            game.createNewGame();
        } else if (game.messageForPlayer()) {
            JOptionPane.showMessageDialog(this, game.getPlayerMessage(), "Important Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void setAsGameListener() {
        game.addGameEventListener(this);
    }

    /**
     * Updates the state of the UI based on the state of the game.
     */
    public void update() {
        // update the grid square panels
        Component[] components = getPnlIsland().getComponents();
        for (Component c : components) {
            // all components in the panel are GridSquarePanels,
            // so we can safely cast
            GridSquarePanel gsp = (GridSquarePanel) c;
            gsp.update();
        }

        // update player information
        int[] playerValues = game.getPlayerValues();
        txtPlayerName.setText(game.getPlayerName());
        progPlayerStamina.setMaximum(playerValues[Game.MAXSTAMINA_INDEX]);
        progPlayerStamina.setValue(playerValues[Game.STAMINA_INDEX]);
        progBackpackWeight.setMaximum(playerValues[Game.MAXWEIGHT_INDEX]);
        progBackpackWeight.setValue(playerValues[Game.WEIGHT_INDEX]);
        progBackpackSize.setMaximum(playerValues[Game.MAXSIZE_INDEX]);
        progBackpackSize.setValue(playerValues[Game.SIZE_INDEX]);

        // Update Kiwi and Predator information
        txtKiwisCounted.setText(Integer.toString(game.getKiwiCount()));
        txtPredatorsLeft.setText(Integer.toString(game.getPredatorsRemaining()));

        // update inventory list
        listInventory.setListData(game.getPlayerInventory());
        listInventory.clearSelection();
        listInventory.setToolTipText(null);
        btnUse.setEnabled(false);
        btnDrop.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JPanel pnlContent = new javax.swing.JPanel();
        pnlIsland = new javax.swing.JPanel();
        javax.swing.JPanel pnlControls = new javax.swing.JPanel();
        javax.swing.JPanel pnlPlayer = new javax.swing.JPanel();
        javax.swing.JPanel pnlPlayerData = new javax.swing.JPanel();
        javax.swing.JLabel lblPlayerName = new javax.swing.JLabel();
        txtPlayerName = new javax.swing.JLabel();
        javax.swing.JLabel lblPlayerStamina = new javax.swing.JLabel();
        progPlayerStamina = new javax.swing.JProgressBar();
        javax.swing.JLabel lblBackpackWeight = new javax.swing.JLabel();
        progBackpackWeight = new javax.swing.JProgressBar();
        javax.swing.JLabel lblBackpackSize = new javax.swing.JLabel();
        progBackpackSize = new javax.swing.JProgressBar();
        lblPredators = new javax.swing.JLabel();
        lblKiwisCounted = new javax.swing.JLabel();
        txtKiwisCounted = new javax.swing.JLabel();
        txtPredatorsLeft = new javax.swing.JLabel();
        staminaRecoveryBtn = new javax.swing.JButton();
        javax.swing.JPanel pnlInventory = new javax.swing.JPanel();
        javax.swing.JScrollPane scrlInventory = new javax.swing.JScrollPane();
        listInventory = new javax.swing.JList();
        btnDrop = new javax.swing.JButton();
        btnUse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kiwi Count");
        setAlwaysOnTop(true);

        pnlContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlContent.setLayout(new java.awt.BorderLayout(10, 0));

        pnlIsland.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnlIslandKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlIslandLayout = new javax.swing.GroupLayout(pnlIsland);
        pnlIsland.setLayout(pnlIslandLayout);
        pnlIslandLayout.setHorizontalGroup(
            pnlIslandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        pnlIslandLayout.setVerticalGroup(
            pnlIslandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        pnlContent.add(pnlIsland, java.awt.BorderLayout.CENTER);

        pnlControls.setLayout(new java.awt.GridBagLayout());

        pnlPlayer.setBorder(javax.swing.BorderFactory.createTitledBorder("Player"));

        pnlPlayerData.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        lblPlayerName.setText("Name:");

        txtPlayerName.setText("Player Name");

        lblPlayerStamina.setText("Stamina:");

        progPlayerStamina.setStringPainted(true);

        lblBackpackWeight.setText("Backpack Weight:");

        progBackpackWeight.setStringPainted(true);

        lblBackpackSize.setText("Backpack Size:");

        progBackpackSize.setStringPainted(true);

        lblPredators.setText("Predators Left:");

        lblKiwisCounted.setText("Kiwis Counted :");

        txtKiwisCounted.setText("0");

        txtPredatorsLeft.setText("P");

        staminaRecoveryBtn.setText("Increase Stamina");
        staminaRecoveryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staminaRecoveryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPlayerDataLayout = new javax.swing.GroupLayout(pnlPlayerData);
        pnlPlayerData.setLayout(pnlPlayerDataLayout);
        pnlPlayerDataLayout.setHorizontalGroup(
            pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayerDataLayout.createSequentialGroup()
                .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlayerDataLayout.createSequentialGroup()
                        .addComponent(lblBackpackSize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progBackpackSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPlayerDataLayout.createSequentialGroup()
                        .addComponent(lblBackpackWeight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progBackpackWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPlayerDataLayout.createSequentialGroup()
                        .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlayerStamina)
                            .addComponent(lblPlayerName)
                            .addComponent(lblPredators)
                            .addComponent(lblKiwisCounted))
                        .addGap(27, 27, 27)
                        .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPlayerDataLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlayerName)
                                    .addComponent(progPlayerStamina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPlayerDataLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtKiwisCounted)
                                    .addComponent(txtPredatorsLeft))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(staminaRecoveryBtn)))))
                .addContainerGap())
        );
        pnlPlayerDataLayout.setVerticalGroup(
            pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayerDataLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayerName)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPlayerDataLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtPlayerName)))
                .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlayerDataLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblPlayerStamina))
                    .addGroup(pnlPlayerDataLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(progPlayerStamina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBackpackWeight)
                    .addComponent(progBackpackWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progBackpackSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBackpackSize))
                .addGap(26, 26, 26)
                .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPredators)
                    .addComponent(txtPredatorsLeft))
                .addGap(23, 23, 23)
                .addGroup(pnlPlayerDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKiwisCounted)
                    .addComponent(txtKiwisCounted)
                    .addComponent(staminaRecoveryBtn)))
        );

        javax.swing.GroupLayout pnlPlayerLayout = new javax.swing.GroupLayout(pnlPlayer);
        pnlPlayer.setLayout(pnlPlayerLayout);
        pnlPlayerLayout.setHorizontalGroup(
            pnlPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPlayerData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPlayerLayout.setVerticalGroup(
            pnlPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayerLayout.createSequentialGroup()
                .addComponent(pnlPlayerData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        pnlControls.add(pnlPlayer, gridBagConstraints);

        pnlInventory.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventory"));

        listInventory.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1 ", "Item 2 ", "Item 3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listInventory.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listInventory.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        listInventory.setVisibleRowCount(3);
        listInventory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listInventoryKeyReleased(evt);
            }
        });
        listInventory.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listInventoryValueChanged(evt);
            }
        });
        scrlInventory.setViewportView(listInventory);

        btnDrop.setText("Drop");
        btnDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropActionPerformed(evt);
            }
        });

        btnUse.setText("Use");
        btnUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInventoryLayout = new javax.swing.GroupLayout(pnlInventory);
        pnlInventory.setLayout(pnlInventoryLayout);
        pnlInventoryLayout.setHorizontalGroup(
            pnlInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventoryLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrlInventory)
                    .addGroup(pnlInventoryLayout.createSequentialGroup()
                        .addComponent(btnUse, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlInventoryLayout.setVerticalGroup(
            pnlInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventoryLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(scrlInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUse)
                    .addComponent(btnDrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnlControls.add(pnlInventory, gridBagConstraints);

        pnlContent.add(pnlControls, java.awt.BorderLayout.EAST);

        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlIslandKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlIslandKeyReleased
        movePlayerPosition(evt);
    }//GEN-LAST:event_pnlIslandKeyReleased

    private void listInventoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listInventoryKeyReleased
        // If the player wants to continue moving, he/she can use the arrow button which can re-gain the focus on the pnlIsland
        Main.gui.getPnlIsland().requestFocusInWindow();

        // According to the key pressed, move the position accordingly
        movePlayerPosition(evt);
    }//GEN-LAST:event_listInventoryKeyReleased

    /**
     * This method updates the player's stamina number and the related GUI
     * components.
     *
     * @param evt
     */
    private void staminaRecoveryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staminaRecoveryBtnActionPerformed
        if (this.game.getKiwiCount() >= 5) {//If the kiwi is counted about 5 or more,
            //it will increase the stamina by 50%
            PromptIncreaseStaminaDialog promptstamina = new PromptIncreaseStaminaDialog();
            promptstamina.setNumKiwi(Integer.parseInt(this.txtKiwisCounted.getText()));
            promptstamina.setGame(game);
            promptstamina.setStamina(progPlayerStamina.getValue());
            promptstamina.setJframe(this);
            promptstamina.setLblKiwiCount(txtKiwisCounted);
            promptstamina.setStaminaProgress(progPlayerStamina);
            promptstamina.setVisible(true);

            txtKiwisCounted.setText(Integer.toString(game.getKiwiCount()));
            progPlayerStamina.setValue(new Double(game.getPlayer().getStaminaLevel()).intValue());
        } else if (this.game.getKiwiCount() < 5 || this.game.getKiwiCount() == 0) {
            //Otherwise, it should display the message where the num of kiwi is not enough.
            NotEnoughCountedKiwiDialog notenough = new NotEnoughCountedKiwiDialog(this);
            notenough.setVisible(true);
        }
    }//GEN-LAST:event_staminaRecoveryBtnActionPerformed

    /**
     * Drop the selected item in the list inventory.
     *
     * @param evt
     */
    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDropActionPerformed
        ActivityPopupFrame actPop = new ActivityPopupFrame((Occupant) listInventory.getSelectedValue(), this);
        actPop.setIconForJLableImage();
        actPop.setActivityTextArea(ActionType.DROP);
        actPop.setVisible(true);
        game.dropItem(listInventory.getSelectedValue());
    }// GEN-LAST:event_btnDropActionPerformed

    /**
     * Use the selected item in the list inventory.
     *
     * @param evt
     */
    private void btnUseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUseActionPerformed
        ActivityPopupFrame actPop = new ActivityPopupFrame((Occupant) listInventory.getSelectedValue(), this);
        actPop.setIconForJLableImage();
        actPop.setActivityTextArea(ActionType.USE);
        actPop.setVisible(true);
        game.useItem(listInventory.getSelectedValue());
    }// GEN-LAST:event_btnUseActionPerformed

    private void listInventoryValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_listInventoryValueChanged
        Object item = listInventory.getSelectedValue();
        btnDrop.setEnabled(true);
        if (item != null) {
            btnUse.setEnabled(game.canUse(item));
            listInventory.setToolTipText(game.getOccupantDescription(item));
        }
    }// GEN-LAST:event_listInventoryValueChanged

    /**
     * Creates and initialises the island grid.
     */
    private void initIslandGrid() {
        // Add the grid
        int rows = game.getNumRows();
        int columns = game.getNumColumns();
        // set up the layout manager for the island grid panel
        getPnlIsland().setLayout(new GridLayout(rows, columns));
        // create all the grid square panels and add them to the panel
        // the layout manager of the panel takes care of assigning them to the
        // the right position
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (row == 0 && col == 2) {
                    GridSquarePanel gsp = new GridSquarePanel(game, 0, 2);
                    gsp.getLblText().setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi.png")));
                    getPnlIsland().add(gsp);
                } else {
                    getPnlIsland().add(new GridSquarePanel(game, row, col));
                }

            }
        }

        // Requests that the pnlIsland Component gets the input focus
        // so that it can capture the key release event
        getPnlIsland().requestFocusInWindow();
    }

    /**
     * @return the pnlIsland
     */
    public javax.swing.JPanel getPnlIsland() {
        return pnlIsland;
    }

    /**
     * Move the player's position by detecting the key pressed.
     *
     * @param evt
     */
    private void movePlayerPosition(KeyEvent evt) {
        switch (KeyEvent.getKeyText(evt.getKeyCode())) {
            case "Left":
                game.playerMove(MoveDirection.WEST);
                break;
            case "Up":
                game.playerMove(MoveDirection.NORTH);
                break;
            case "Right":
                game.playerMove(MoveDirection.EAST);
                break;
            case "Down":
                game.playerMove(MoveDirection.SOUTH);
                break;
        }

        update();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnUse;
    private javax.swing.JLabel lblKiwisCounted;
    private javax.swing.JLabel lblPredators;
    private javax.swing.JList listInventory;
    private javax.swing.JPanel pnlIsland;
    private javax.swing.JProgressBar progBackpackSize;
    private javax.swing.JProgressBar progBackpackWeight;
    private javax.swing.JProgressBar progPlayerStamina;
    private javax.swing.JButton staminaRecoveryBtn;
    private javax.swing.JLabel txtKiwisCounted;
    private javax.swing.JLabel txtPlayerName;
    private javax.swing.JLabel txtPredatorsLeft;
    // End of variables declaration//GEN-END:variables

    private Game game;
}
