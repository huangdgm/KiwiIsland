package nz.ac.aut.ense701.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gui.CharacterSelectFrame;
import nz.ac.aut.ense701.gui.KiwiCountUI;

/**
 * Kiwi Count Project
 *
 * @author AS
 * @version 2011
 */
public class Main {

    // create the game object
    public static final Game game = new Game();

    // create the GUI for the game
    public static final CharacterSelectFrame csf = new CharacterSelectFrame();
    public static final KiwiCountUI gui = new KiwiCountUI(game);

    /**
     * Main method of Kiwi Count.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The thread t1 set the csf window visible and wait for the user selection
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                csf.setVisible(true);
                
                while (csf.isShowing()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        // The thread t2 checks the user selection and display the main GUI window
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                if (!csf.isShowing()) {
                    gui.setVisible(true);
                }
            }
        });
        
        t1.start();
        
        // Only after the user selection will the main GUI window appears
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t2.start();
    }
}
