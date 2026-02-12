package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

import java.util.Random;

public class RockThrower extends GamePiece implements Moveable {
    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public RockThrower( int location) {
        super('T', "Rock Thrower - moves toward player and throws rocks two spaces away from it", location);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        boolean isPlayerToLeft =  playerLocation < getLocation();
        int distance = 1;

        int tempLocation = getLocation();
        if(isPlayerToLeft) {
            tempLocation -= distance;
        }
        else {
            tempLocation += distance;
        }



        if (gameBoard[tempLocation] == null) {
            gameBoard[tempLocation] = this;
            gameBoard[getLocation()] = null;
            setLocation(tempLocation);
        }
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (Math.abs(playerLocation - getLocation()) <= 2) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
}
