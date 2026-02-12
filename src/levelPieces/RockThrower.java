package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class RockThrower extends GamePiece implements Moveable {
    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public RockThrower( int location) {
        super('T', "moves toward player and throws rocks two spaces away from it", location);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {

    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return null;
    }
}
