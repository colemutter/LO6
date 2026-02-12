package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Snake extends GamePiece implements Moveable {
    /**
     * Constructor for the game piece
     *
     *
     * @param location initial location
     */
    public Snake( int location) {
        super('s', "moves randomly and kills player on contact", location);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {

    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return null;
    }
}
