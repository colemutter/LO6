/**
 * Chest Game Piece.
 *
 * @author Cole Mutter
 * @author Van Nguyen
 *
 * Purpose: Create Chest class that extends GamePiece, non moveable object but interactable
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Chest extends GamePiece {
    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public Chest( int location) {
        super('c', "Chest - gives player a point", location);
    }
    //Interaction get Point once player location == chest location
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if(playerLocation == getLocation()){
            return InteractionResult.GET_POINT;
        }else{
            return InteractionResult.NONE;
        }
    }
}
