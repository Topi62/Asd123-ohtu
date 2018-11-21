package ohtu.model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class BookTest {

    private Book book;
    private Date today;

    @Before
    public void setUp() {
        int id = 1;
        String writer = "TestiKirjoittaja";
        String title = "TestiNimi";
        String isbn = "123456789";
        boolean isRead = true;
        today = new Date();;
        book = new Book(id, title, writer, isbn, isRead, today);
    }

    @Test
    public void constructorWorks() {
        assertNotEquals(null, book);
    }
    
    @Test
    public void getIdWorks() {
        assertEquals(1, book.getId());
    }
    
    @Test
    public void getWriterWorks() {
        assertEquals("TestiKirjoittaja", book.getWriter());
    }
    
    @Test
    public void getTitleWorks() {
        assertEquals("TestiNimi", book.getTitle());
    }
    
    @Test
    public void getISBNWorks() {
        assertEquals("123456789", book.getISBN());
    }
    
    @Test
    public void getIsReadWorks() {
        assertEquals(true, book.isIsRead());
    }
    
    @Test
    public void getDateOfReadWorks() {
        assertEquals(today, book.getDayOfRead());
    }
}
