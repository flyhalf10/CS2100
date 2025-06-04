/**Seth Shienbrood
CS2100
A two player game in which each player flips 3 coins(a nickel, dime, and quarter) per round. If the coin lands on heads, the value of that coin is added to that players score.
After each round a player wins if their score reaches exactly 100, after which the game ends. If their score exceeds 100 it is reset.
If both players reach exactly 100 after a round it's a tie. 
*/
public class DollarGame
{
   final static String PLAYER_ONE_WINS_MSG = "Player 1 wins";
   final static String PLAYER_TWO_WINS_MSG = "Player 2 wins";
   final static String TIE_MSG = "It's a tie";
   
   public static void main(String args[])
   {
      int p1Score = 0;
      int p2Score = 0;
      int round = 1;
      final int WINNING_SCORE = 100;
      final int NICKEL = 5;
      final int DIME = 10;
      final int QUARTER = 25;
      final int RESET_SCORE = 0;
      final int STARTING_ROUND = 1;
      
      Coin p1Nickel = new Coin(NICKEL);
      Coin p1Dime = new Coin(DIME);
      Coin p1Quarter = new Coin(QUARTER);
      Coin p2Nickel = new Coin(NICKEL);
      Coin p2Dime = new Coin(DIME);
      Coin p2Quarter = new Coin(QUARTER); 
      
      while (!(p1Score == WINNING_SCORE) && !(p2Score == WINNING_SCORE))
      {
         p1Score += processOneCoin(p1Nickel);
         p1Score += processOneCoin(p1Dime);
         p1Score += processOneCoin(p1Quarter);
         p2Score += processOneCoin(p2Nickel);
         p2Score += processOneCoin(p2Dime);
         p2Score += processOneCoin(p2Quarter);
         
         System.out.printf("Round %d:Player 1: %d Player 2: %d\n", round, p1Score, p2Score);
         
         if (p1Score > WINNING_SCORE && !(p2Score == WINNING_SCORE))
         {
            System.out.println("Resetting Player 1 to 0");
            p1Score = RESET_SCORE;
         } 
         if (p2Score > WINNING_SCORE && !(p1Score == WINNING_SCORE))
         {
            System.out.println("Resetting Player 2 to 0");
            p2Score = RESET_SCORE;
         } 
         
                 round += STARTING_ROUND;
      }   
      if (p1Score == WINNING_SCORE && p2Score == WINNING_SCORE)
         System.out.println(TIE_MSG);
      else if (p1Score == WINNING_SCORE)
         System.out.println(PLAYER_ONE_WINS_MSG);   
      else
         System.out.println(PLAYER_TWO_WINS_MSG);        
   }
   /**
   processOneCoin flips a coin and returns the value of the coin if heads, otherwise 0
   @Param c the Coin object to be tossed
   @Return if heads returns value of coin, if tails returns 0
   */ 
   public static int processOneCoin(Coin c)
   {
      c.toss();
      
      if (c.isHeads())
         return c.getValue();
      else
         return 0;
   }
}
