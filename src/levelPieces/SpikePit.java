/**
 * SpikeTrap Game Piece.
 *
 * @author Cole Mutter
 * @author Van Nguyen
 *
 * Purpose: Create class Spike Trap that extends gamepiece and is Interactable.
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class SpikePit extends GamePiece {
    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public SpikePit(int location) {
        super('p', "Spike Pit - kills player if they fall into it", location);
    }

    //Define interaction behavior when spiketrap location == player location, kill
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if(playerLocation == getLocation()){
            return InteractionResult.KILL;
        }else{
            return InteractionResult.NONE;
        }
    }
}
