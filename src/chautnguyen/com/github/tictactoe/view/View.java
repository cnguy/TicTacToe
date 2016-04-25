package chautnguyen.com.github.tictactoe.view;

import chautnguyen.com.github.tictactoe.model.Field.Symbol;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class View extends JFrame {
    GridLayout grid = new GridLayout(3, 3);     // default grid-size for tic-tac-toe
    private JButton[] buttons;                  // an array containing the 9 buttons

    /**
     * Overloaded constructor.
     */
    public View() {
        super("tic-tac-toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(getContentPane());
        pack();
        setVisible(true);

        getRootPane().setDefaultButton(buttons[4]);
        buttons[4].requestFocus();
    }

    /**
     * Adds the panel along with its buttons to the pane.
     */
    public void addComponentsToPane(final Container pane) {
        final JPanel panel = new JPanel();
        panel.setLayout(grid);        
        panel.setPreferredSize(new Dimension(300, 300));

        buttons = new JButton[9];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].getPreferredSize();
            panel.add(buttons[i]);
        }

        pane.add(panel);
    }
    
    /**
     * Informs the user who won.
     */
    public void informWin(Symbol userSymbol) {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
        }
        JOptionPane.showMessageDialog(null, "Player " + userSymbol.toString() + " has won!");
    }
    
    /**
     * Informs the user of the tie.
     */
    public void informTie() {
        JOptionPane.showMessageDialog(null, "Tie!");
    }
    
    /**
     * Returns a button with a specific index.
     * 
     * @return a button with a specific index.
     */
    public JButton getButton(int index) {
        return buttons[index];
    }
    
    /**
     * Returns the size of the buttons[] array.
     * 
     * @return the size of the buttons[] array.
     */
    public int getNumberOfButtons() {
        return buttons.length;
    }
}