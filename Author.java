/**
Seth Shienbrood
CS2100
Class that represents an Author. Takes first name, last name, and email with copy constructor, toString, equals, getters, and setters methods. 
*/
public class Author
{
   private String firstName;
   private String lastName;
   private String email;
   
   /**
   This constructor gathers data on an authors first and last name, aswell as email
   @Param firstName, lastName, email Authors data
   */
   public Author(String firstName, String lastName, String email)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
   }
   
   /**
   Creates a copy of the Author object
   @param object2 instance variable of Author object
   */
   public Author(Author object2)
   {
      firstName = object2.firstName;
      lastName = object2.lastName;
      email = object2.email;
   }
   
   /** 
   toString of Authors data
   @return Authors first name, last name, and email
   */
   public String toString()
   {
      String str = String.format("%s %s <%s>", getFirstName(), getLastName(), getEmail());
      
      return str;
   }
   
   /**
   Determine if data in two objects is equal
   @return True if equal, false otherwise
   */
   @Override
   public boolean equals(Object other)
   {
      Author cOther = (Author)other;
      
      boolean status;
      
      if (firstName.equals(cOther.firstName) && 
         lastName.equals(cOther.lastName))
         status = true;
      else
         status = false;
         
      return status;
   }
   
   /**
   First name setter
   @param author Author first name
   */
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   /**
   First name getter
   @return Author first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
   Last name setter
   @param author Author Last name
   */
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   } 
   /**
   Last name getter
   @return author Author Last name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
   Email setter
   @param email Author email
   */
   public void setEmail(String email)
   {
      this.email = email;
   }
   /**
   Email getter
   @return Author email
   */
   public String getEmail()
   {
      return email;
   }
   
   
}