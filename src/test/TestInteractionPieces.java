package test;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import levelPieces.Chest;
import levelPieces.DartTrap;
import levelPieces.HiddenPassage;
import levelPieces.Rock;
import levelPieces.RockThrower;
import levelPieces.Snake;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestInteractionPieces {
    @Test
    public void testRockThrowerInteraction(){
        Drawable[] board = new Drawable[21];
        int thrower1initialPos = 11;
        int thrower2initialPos = 6;
        RockThrower thrower1 = new RockThrower(thrower1initialPos);
        board[thrower1initialPos] = thrower1;
        RockThrower thrower2 = new RockThrower(thrower2initialPos);
        board[thrower2initialPos] = thrower2;

        int playerPosition = 9;
        //Asserts that the thrower is in range to hit the player (distance <= 2)
        //Thrower1 will be at 6 which is 3 distance away from player so not hit
        //Thrower2 will be at 11 which is 2 distance away from player so hit
        assertEquals(InteractionResult.HIT, thrower1.interact(board,playerPosition));
        assertEquals(InteractionResult.NONE, thrower2.interact(board,playerPosition));

        System.out.println("rock thrower interaction as expected");
    }
    @Test
    public void testSnakeInteraction() {
        int playerPosition = 9;
        
        Drawable[] board = new Drawable[21];
        int snake1Pos = 9;
        int snake2Pos = 8;
        Snake snake1 = new Snake(snake1Pos);
        board[snake1Pos] = snake1;
        Snake snake2 = new Snake(snake2Pos);
        board[snake2Pos] = snake2;

        //Aserts that player interaction will only kill if snake pos is equal to player pos
        assertEquals(InteractionResult.KILL, snake1.interact(board,playerPosition));
        assertEquals(InteractionResult.NONE, snake2.interact(board,playerPosition));

        System.out.println("snake interaction as expected");
    }
    @Test 
    public void testSpikePitInteraction(){

        int playerPosition = 9;
        
        Drawable[] board = new Drawable[21];
        int spike1Pos = 9;
        int spike2Pos = 8;
        Snake spike1 = new Snake(spike1Pos);
        board[spike1Pos] = spike1;
        Snake spike2 = new Snake(spike2Pos);
        board[spike2Pos] = spike2;

        //Aserts that player interaction will only kill if spikepit pos is equal to player pos
        assertEquals(InteractionResult.KILL, spike1.interact(board,playerPosition));
        assertEquals(InteractionResult.NONE, spike2.interact(board,playerPosition));

        System.out.println("spikePit interaction as expected");
    }
    @Test
    public void testRockInteraction(){
        int playerPosition = 9;
        
        Drawable[] board = new Drawable[21];
        int rock1Pos = 9;
        int rock2Pos = 8;
        Rock rock1 = new Rock(rock1Pos);
        board[rock1Pos] = rock1;
        Rock rock2 = new Rock(rock2Pos);
        board[rock2Pos] = rock2;

        //Aserts that rock should not interact with player no matter either objects' position
        assertEquals(InteractionResult.NONE, rock1.interact(board,playerPosition));
        assertEquals(InteractionResult.NONE, rock2.interact(board,playerPosition));

        System.out.println("rock interaction as expected");
    }
    @Test
    public void testHiddenPassageInteraction(){
        int playerPosition = 9;
        
        Drawable[] board = new Drawable[21];
        int passage1Pos = 9;
        int passage2Pos = 8;
        HiddenPassage passage1 = new HiddenPassage(passage1Pos);
        board[passage1Pos] = passage1;
        HiddenPassage passage2 = new HiddenPassage(passage2Pos);
        board[passage2Pos] = passage2;

        //Aserts that player interaction will only advance if hidden passage pos is equal to player pos
        assertEquals(InteractionResult.ADVANCE, passage1.interact(board,playerPosition));
        assertEquals(InteractionResult.NONE, passage2.interact(board,playerPosition));

        System.out.println("hidden passage interaction as expected");
    }
    @Test
    public void testDartTrapInteraction(){
        int playerPosition = 10;
        
        Drawable[] board = new Drawable[21];
        int dart1Pos = 9;
        int dart2Pos = 8;
        DartTrap dart1 = new DartTrap(dart1Pos);
        board[dart1Pos] = dart1;
        DartTrap dart2 = new DartTrap(dart2Pos);
        board[dart2Pos] = dart2;

        //Aserts that player interaction will only be hit if dart trap pos is 2 away from the player pos
        assertEquals(InteractionResult.NONE, dart1.interact(board,playerPosition));
        assertEquals(InteractionResult.HIT, dart2.interact(board,playerPosition));

        System.out.println("dart trap interaction as expected");
    }
    @Test
    public void testChestInteraction(){
        int playerPosition = 9;
        
        Drawable[] board = new Drawable[21];
        int chest1Pos = 9;
        int chest2Pos = 8;
        Chest chest1 = new Chest(chest1Pos);
        board[chest1Pos] = chest1;
        Chest chest2 = new Chest(chest2Pos);
        board[chest2Pos] = chest2;

        //Aserts that player interaction will only getpoint if chest pos is equal to player pos
        assertEquals(InteractionResult.GET_POINT, chest1.interact(board,playerPosition));
        assertEquals(InteractionResult.NONE, chest2.interact(board,playerPosition));

        System.out.println("Chest interaction as expected");
    }
}
