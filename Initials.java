/**
* Seth Shienbrood
* CS 2100
* User enters first, middle, and last name, program returns the intials of the user.
*/

import java.util.Scanner;
public class Initials {
   public static void main(String [] Args) {
      Scanner input;
      input = new Scanner(System.in);
      
      System.out.print("First name: ");
      String firstName = input.nextLine();
      
      System.out.print("Middle name: ");
      String middleName = input.nextLine();
     
      System.out.print("Last name: ");
      String lastName = input.nextLine();
      
      char firstInitial = firstName.charAt(0);
      char middleInitial = middleName.charAt(0);
      char lastInitial = lastName.charAt(0);
      
      String initials = "" + firstInitial + middleInitial + lastInitial;
      
      initials = initials.toUpperCase();
      
      System.out.println("Your initials are " + initials);
   }
}
