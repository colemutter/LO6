/**
 * Snake Game Piece.
 *
 * @author Cole Mutter
 * @author Van Nguyen
 *
 * Purpose: Create class Snake that extends gamepiece and is Interactable and moveable.
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

import java.util.Random;

public class Snake extends GamePiece implements Moveable {
    /**
     * Constructor for the game piece
     *
     *
     * @param location initial location
     */
    public Snake( int location) {
        super('s', "Snake - moves randomly and kills player on contact", location);
    }

    //Implement snake movement where it moves rnadomly
    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        Random rand = new Random();
        int leftRightBool =  rand.nextInt(2);
        int distance = rand.nextInt(2);
        distance++;

        int tempLocation = getLocation();
        if(leftRightBool == 0){
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

    //Define interaction behavior when snake location == player location, kill
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.KILL;
        }
        return InteractionResult.NONE;
    }
}
