package levelPieces;

import java.util.ArrayList;
import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
    private Drawable[] gameBoard;
    private ArrayList<Moveable> moveablePieces;
    private ArrayList<GamePiece> interactablePieces;
    private int playerPosition;

    public final void createLevel(int levelNumber) {
        this.gameBoard = new Drawable[21];
        this.moveablePieces = new ArrayList<>();
        this.interactablePieces = new ArrayList<>();

        System.out.println("Level " + levelNumber + "  Legend:");
        System.out.println("  P - Player (you)");

        if (levelNumber == 1) {
            playerPosition = 10;

            //Rocks that dont do anything
            gameBoard[5] = new Rock(5);
            gameBoard[11] = new Rock(11);

            //Section for Snakes
            Snake snake1 = new Snake(15);
            moveablePieces.add(snake1);
            interactablePieces.add(snake1);
            gameBoard[15] = snake1;


            //Section for pits



            //Section for Dart Traps



            //Section for Chests


            //Section for Hidden Passage



            //Section for rock Throwers


            //prints for rules of items in the level
            System.out.println("  " + new Rock(0));
            System.out.println("  " + snake1);
        } else if (levelNumber == 2) {
            playerPosition = 19;

            //Rocks that dont do anything

            //Section for Snakes
            Snake snake1 = new Snake(15);
            moveablePieces.add(snake1);
            interactablePieces.add(snake1);
            gameBoard[15] = snake1;


            //Section for pits



            //Section for Dart Traps



            //Section for Chests


            //Section for Hidden Passage



            //Section for rock Throwers


            //prints for rules of items in the level
        }

        System.out.println();
    }


    public Drawable[] getBoard() {
        return gameBoard;
    }

    public ArrayList<Moveable> getMovingPieces() {
        return moveablePieces;
    }

    public ArrayList<GamePiece> getInteractingPieces() {
        return interactablePieces;
    }

    public int getPlayerStartLoc() {
        return playerPosition;
    }
}
