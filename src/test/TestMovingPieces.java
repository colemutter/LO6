package test;

import gameEngine.Drawable;
import levelPieces.RockThrower;
import levelPieces.Snake;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestMovingPieces {
    @Test
    public void testRockThrowerMovement() {
        Drawable[] board = new Drawable[21];
        int thrower1initialPos = 18;
        int thrower2initialPos = 3;
        RockThrower thrower1 = new RockThrower(thrower1initialPos);
        board[thrower1initialPos] = thrower1;
        RockThrower thrower2 = new RockThrower(thrower2initialPos);
        board[thrower2initialPos] = thrower2;

        int playerPosition = 9;
        thrower1.move(board, playerPosition);
        thrower2.move(board, playerPosition);

        //Asserts that the thrower is one space closer to the player
        assertEquals(Math.abs(thrower1initialPos-playerPosition) - 1, Math.abs(thrower1.getLocation()-playerPosition));
        assertEquals(Math.abs(thrower2initialPos-playerPosition) - 1, Math.abs(thrower2.getLocation()-playerPosition));

        System.out.println("rock thrower movement as expected");
    }

    @Test
    public void testSnakeMovement() {

        //snake moves randomly between moving left and right, and moving 1 or 2 spaces
        int initialPos = 15;
        //this number doesnt actually matter
        int playerPosition = 9;

        int[] movementCounter = new int[4];

        for (int i = 0; i < 200; i++) {
            Drawable[] board = new Drawable[21];
            Snake snake = new Snake(initialPos);
            board[initialPos] = snake;
            snake.move(board, playerPosition);
            switch (snake.getLocation()) {
                case 13:
                    movementCounter[0]++;
                    break;
                case 14:
                    movementCounter[1]++;
                    break;
                case 16:
                    movementCounter[2]++;
                    break;
                default:
                    movementCounter[3]++;
            }
        }


        assertTrue(movementCounter[0] > 10);
        assertTrue(movementCounter[1] > 10);
        assertTrue(movementCounter[2] > 10);
        assertTrue(movementCounter[3] > 10);

        System.out.println("snake movement as expected");
    }

}
