
package ohtu.dao;

import java.util.List;
import ohtu.model.Book;

public interface BookDao {
    
    public void add(Book book); // add book to database
    
    public List<Book> list();   // retun list of books in database
    
}
