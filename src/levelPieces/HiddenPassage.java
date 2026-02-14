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

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if(playerLocation == getLocation()){
            return InteractionResult.ADVANCE;
        }else{
            return InteractionResult.NONE;
        }
    }
}
