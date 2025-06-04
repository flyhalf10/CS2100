import java.util.Random;
/**
Seth Shienbrood
CS2100
Simulates a coin flip
*/

public class Coin
{
   private boolean heads;
   private int value;
   private static Random rand = new Random();
   
   /**
   This constructor sets the value of the coin
   @Param Value value of coin
   */
   
   public Coin(int value)
   {
      this.value = value;
      toss();
   }
   
   /**
   Randomly determines if the flip lands on heads or tails
   */
   public void toss()
   {
      heads = rand.nextBoolean();
   }
   
   /**
   see if heads is true or false
   @Return heads
   */
   public boolean isHeads()
   {
      return heads;
   }
   
   /**
   Get the value of the coin
   @Return value
   */
   public int getValue()
   {
      return value;
   }
}   