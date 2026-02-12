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
        super('c', "gives player a point", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if(playerLocation == getLocation()){
            return InteractionResult.GET_POINT;
        }else{
            return InteractionResult.NONE;
        }
    }
}
