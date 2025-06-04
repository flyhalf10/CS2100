import java.io.*;
import java.util.Scanner;
// Seth Shienbrood
// CS2100
// Given a file with some numbers, opens the file and performs repeating digit, prime, and even tests and print the result of tests in a new text file.
public class NumberTester
{
public static void main(String args[]) throws IOException
{
   File f = new File("numbers.txt");
   Scanner input = new Scanner (f);
   
   PrintWriter ns = new PrintWriter("numberSummary.txt");
   
   ns.println("\tRepeat");
   ns.println("Number\t" + "Digits\t" + "Even\t" + "Prime");
   
   while (input.hasNextInt())
   {
      int num = input.nextInt();
      
      boolean prime = isPrime(num);
      boolean even = isEven(num);
      boolean repeat = isRepeatedDigits(num);
      
      ns.printf(" %d\t", num);
      
      if (repeat)
         ns.print(" +\t");
      else
         ns.print(" -\t");
      if (even)
         ns.print(" +\t");
      else
         ns.print(" -\t");
      if (prime)
         ns.print(" +\t");
      else
         ns.print(" -\t");
      ns.println();
      
   }
   input.close();
   ns.close();
   

} 
/**
   Tests if given number is prime
   @Param n The given number
   @Return true if prime, false is not
*/  
public static boolean isPrime(int n)
{
   if (n < 2)
      return false;
   if (n == 2)
      return true;
   for (int i = 2; i * i <= n; i++)
   {
      if (n % i == 0)
         return false;
   }
   return true;
}
/**
   Tests if given number is even
   @Param n The given number
   @Return true if even, false if not
*/  
public static boolean isEven(int n)
{
   if (n % 2 == 0)
      return true;
   else
      return false;
}
/**
   Tests if given number has repeating digits
   @Param n The given number
   @return true if number contains repeating digits, false if not
*/  
public static boolean isRepeatedDigits(int n)
{
    int last = n % 10;
    n = n / 10;

    while (n > 0) 
    {
        int current = n % 10;
        if (current == last) 
        {
            return true;
        }
        last = current;
        n = n / 10;
    }

    return false;
}

}
      