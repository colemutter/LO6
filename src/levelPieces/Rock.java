/**
 * Rock Game Piece.
 *
 * @author Cole Mutter
 * @author Van Nguyen
 *
 * Purpose: Create class Rock that extends gamepiece. Does nothing
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Rock extends GamePiece {

    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public Rock(int location) {
        super('r', "Rock - does nothing", location);
    }

    //No interaction w/ game
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return InteractionResult.NONE;
    }
}
