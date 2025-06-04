/**
Seth Shienbrood
CS2100
Class that represents a Book. Takes isbn, title, publisher, numPages, and author with copy constructor, toString, equals, getters, and setters methods.
*/
public class Book
{
   String isbn;
   String title;
   String publisher;
   int numPages;
   Author a;
   
   /**
   This constructor gathers data on a books isbn, title, author, publisher, and number of pages.
   @Param isbn, title, author, publisher, numPages Books data 
   */
   public Book(String isbn, String title, Author a, String publisher, int numPages)
   {
      this.isbn = isbn;
      this.title = title;
      this.a = new Author(a);
      this.publisher = publisher;
      this.numPages = numPages;
   }
   
   /**
   Creates a deep copy of the Book object
   @param other instance variable of  Book object
   */
   public Book(Book other)
   {
      this.isbn = other.isbn;
      this.title = other.title;
      this.a = new Author(other.a);
      this.publisher = other.publisher;
      this.numPages = other.numPages; 
   }
   
   /** 
   toString of Book data
   @return books isbn, title, author, publisher, and number of pages
   */
   public String toString()
   {
      String str = String.format("%s, %s (ISBN-10 #%s, %d pages)", title, a, isbn, numPages);
      
      return str;
   }
   
   /**
   determine if data in two objects is equal
   @return true if equal, false otherwise
   */
   @Override
   public boolean equals(Object other)
   {
      Book cOther = (Book)other;
      
      boolean status;
      
      if (title.equals(cOther.title) && 
         a.equals(cOther.a) &&
         isbn.equals(cOther.isbn))
         status = true;
      else
         status = false;
     
      return status;
   }
   
   /**
   Isbn setter
   @param isbn Books isbn
   */
   public void setIsbn(String isbn)
   {
      this.isbn = isbn;
   }
   /**
   Isbn getter
   @return Books isbn
   */
   public String getIsbn()
   {
      return isbn;
   }
   
   /**
   Title setter
   @param title Books title
   */
   public void setTitle(String title)
   {
      this.title = title;
   }
   /**
   Title getter
   @return Books title
   */
   public String getTitle()
   {
      return title;
   }
   
   /**
   Publisher setter
   @param publisher Books publisher
   */
   public void setPublisher(String publisher)
   {
      this.publisher = publisher;
   }
   /**
   Publisher getter
   @return Books publisher
   */
   public String getPublisher()
   {
      return publisher;
   }
   
   /**
   numPages setter
   @param numPages Number of pages in book
   */
   public void setNumPages(int numPages)
   {
      this.numPages = numPages;
   }
   /**
   numPages getter
   @return number of pages in book
   */
   public int getNumPages()
   {
      return numPages;
   }
   
   /**
   Author setter
   @param a Books Author
   */
   public void setAuthor(Author a)
   {
      this.a = new Author(a);
   }
   /**
   Author getter
   @return Author 
   */
   public Author getAuthor()
   {
      return new Author(a);
   }

}
   
      