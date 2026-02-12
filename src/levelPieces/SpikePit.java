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
        super('p', "kills player if they fall into it", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return null;
    }
}
