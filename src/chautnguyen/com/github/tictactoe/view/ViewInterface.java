package chautnguyen.com.github.tictactoe.view;

import chautnguyen.com.github.tictactoe.model.Field.Symbol;

import javax.swing.JButton;

interface ViewInterface
{
    /**
     * Changes a field to a user symbol.
     * 
     * @param symbol    the symbol of the current player.
     * @param button    the button that was clicked.
     */
    public void setFieldOwner(Symbol owner, JButton button);
    
    /**
     * Informs the user who won.
     * 
     * @param symbol    the symbol of the current player (=> winner).
     */
    public void informWin(Symbol userSymbol);
    
    /**
     * Informs the user of the tie.
     */
    public void informTie();
}