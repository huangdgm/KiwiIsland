package nz.ac.aut.ense701.gui;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gameModel.Island;
import nz.ac.aut.ense701.gameModel.Position;
import nz.ac.aut.ense701.gameModel.Terrain;

/*
 * Panel for representing a single GridSquare of the island on the GUI.
 * 
 * @author AS
 * @version 1.0 - created
 */
public class GridSquarePanel extends javax.swing.JPanel {

    /**
     * Creates new GridSquarePanel.
     *
     * @param game the game to represent
     * @param row the row to represent
     * @param column the column to represent
     */
//    public GridSquarePanel(Game game, int row, int column, ImageIcon ii) {
//        this.game = game;
//        this.row = row;
//        this.column = column;
//        this.lblText.setIcon(ii);
//        initComponents();
//        //this.ii = ii;
//    }
    public GridSquarePanel(Game game, int row, int column) {
        this.game = game;
        this.row = row;
        this.column = column;
        initComponents();
        //this.ii = ii;
    }

    //default constructor
    GridSquarePanel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Updates the representation of the grid square panel.
     */
    public void update() {
        // get the GridSquare object from the world
        Terrain terrain = game.getTerrain(row, column);
        boolean squareVisible = game.isVisible(row, column);
        boolean squareExplored = game.isExplored(row, column);

        Color color;

        switch (terrain) {
            case SAND:
                color = Color.YELLOW;
                break;
            case FOREST:
                color = Color.GREEN;
                break;
            case WETLAND:
                color = Color.BLUE;
                break;
            case SCRUB:
                color = Color.DARK_GRAY;
                break;
            case WATER:
                color = Color.CYAN;
                break;
            default:
                color = Color.LIGHT_GRAY;
                break;
        }

        if (squareExplored || squareVisible) {
            // Set the text of the JLabel according to the occupant
            lblText.setText(game.getOccupantStringRepresentation(row, column));
            // Set the tool tip text for the GridSquarePanel
            if (game.getIsland().getOccupants(new Position(game.getIsland(), row, column)).length != 0) {
                lblText.setToolTipText(Arrays.toString(game.getIsland().getOccupants(new Position(game.getIsland(), row, column))));
            }

            // Set the colour. 
            if (squareVisible && !squareExplored) {
                // When explored the colour is brighter
                color = new Color(Math.min(255, color.getRed() + 128),
                        Math.min(255, color.getGreen() + 128),
                        Math.min(255, color.getBlue() + 128));
            }
            lblText.setBackground(color);
            // set border colour according to 
            // whether the player is in the grid square or not
            setBorder(game.hasPlayer(row, column) ? activeBorder : normalBorder);
            if (!game.hasPlayer(row, column)) {
                setBorder(game.hasPlayer(row, column) ? activeBorder : normalBorder);
            }

            if (game.hasPlayer(row, column)) {

                lblText.setHorizontalTextPosition(JLabel.CENTER);

                boolean isIconSet = true;
                if (isIconSet) {
                    //CharacterSelectFrame cs = new CharacterSelectFrame();
                    //cs.setVisible(true);

                    if (CharacterSelectFrame.clicked1) {
                        isIconSet = false;

                        lblText.setIcon(new ImageIcon(getClass().getResource("/icon_2.png")));
                        //cs.setVisible(false);
                        //cs.dispose();

                    } else if (CharacterSelectFrame.clicked2) {
                        isIconSet = false;

                        lblText.setIcon(new ImageIcon(getClass().getResource("/icon_3.png")));
                        //cs.setVisible(false);
                        //cs.dispose();
                    } else if (CharacterSelectFrame.clicked3) {
                        isIconSet = false;

                        lblText.setIcon(new ImageIcon(getClass().getResource("/icon.png")));
                        //cs.setVisible(false);
                        //cs.dispose();
                    }

                }// end if

            } else {
                lblText.setIcon(null);
            }
        } else {
            lblText.setText("");
            lblText.setBackground(null);
            setBorder(normalBorder);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblText = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.BorderLayout());

        lblText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText.setText("content");
        lblText.setOpaque(true);
        lblText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTextMouseClicked(evt);
            }
        });
        add(lblText, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lblTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTextMouseClicked
        // If the grid is visible or has the player inside, and there are one or more occupants in the grid, then this grid is clickable and a new GridSquareInfoFrame will pop up once the grid is clicked.
        Island island = game.getIsland();
        Position position = new Position(island, row, column);

        if ((game.isVisible(row, column) || game.hasPlayer(row, column)) && island.getOccupants(position).length != 0) {
            GridSquareInfoFrame gridSquareInfoFrame = new GridSquareInfoFrame(game, row, column);
            gridSquareInfoFrame.setVisible(true);

            // Disable the main gui window once the GridSquareInfoFrame is opened
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.setEnabled(false);
        }
    }//GEN-LAST:event_lblTextMouseClicked

    public JLabel getLblText() {
        return lblText;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables

    private Game game;
    private int row, column;
    //private ImageIcon ii;

    private static final Border normalBorder = new LineBorder(Color.BLACK, 1);
    private static final Border activeBorder = new LineBorder(Color.RED, 3);
}
