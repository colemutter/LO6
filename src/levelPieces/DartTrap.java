/**
 * Dart Trap Game Piece.
 *
 * @author Cole Mutter
 * @author Van Nguyen
 *
 * Purpose: Create class DartTrap that extends gamepiece and is Interactable 
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class DartTrap extends GamePiece {
    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public DartTrap(int location) {
        super('d', "Dart Trap - shoots a dart exactly two spaces away torword the player", location);
    }
    //Define interaction behavior when dart trap location == player location, hit
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        //Hurts player only if they are exactly two tiles away
        if(Math.abs(playerLocation - getLocation()) == 2){
            return InteractionResult.HIT;
        }else{
            return InteractionResult.NONE;
        }
    }
}
