/**
 * Hidden Passage Game Piece.
 *
 * @author Cole Mutter
 * @author Van Nguyen
 *
 * Purpose: Create class HiddenPassage that extends gamepiece and is Interactable.
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class HiddenPassage extends GamePiece {
    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public HiddenPassage( int location) {
        super('H', "Hidden Passage advances player to next level on contact", location);
    }

    //Define interaction behavior when hidden passage location == player location, advance
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if(playerLocation == getLocation()){
            return InteractionResult.ADVANCE;
        }else{
            return InteractionResult.NONE;
        }
    }
}
