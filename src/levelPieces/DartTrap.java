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
        super('d', "shoots a dart a certain direction to harm the player", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return null;
    }
}
