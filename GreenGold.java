import java.util.Scanner;
// Seth Shienbrood
// CS2100
// A program that allows the user to play a game in which they are asked for 2 integer inputs, defining a range.
// For each number in the range, if the number is divisible by 2 the program prints "Gold", if divisible by 5, "Green", and if divisible by both, "Catamount".
// Otherwise the program prints the number itself.

public class GreenGold
{

   public static void main(String[] args)
   {
      int number1;
      int number2;
      Scanner input;
      
      input = new Scanner(System.in);
      
      do
      {
         number1 = input.nextInt();
         number2 = input.nextInt();
      }
      while (number1 >= number2 || number1 <= 0 || number2 <= 0);
      
      for (int count = number1; count <= number2; count++)
      {
         if (count % 2 == 0 && !(count % 5 == 0))
            System.out.println("GOLD");
         else if (count % 5 == 0 && !(count % 2 == 0))
            System.out.println("GREEN");
         else if (count % 5 == 0 && count % 2 == 0)
            System.out.println("CATAMOUNT");
         else
            System.out.println(count);
         number1 += 1;
      }
   }
}
         
         
      
     

   