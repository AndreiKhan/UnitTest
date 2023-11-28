package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    BookRepository bookRepositoryMock;
    BookService bookService;

    @BeforeEach
    void setUp() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    void findByIdTest() {
        when(bookService.findBookById("1")).thenReturn(new Book("1", "Book1", "Author1"));

        Book book = bookService.findBookById("1");

        assertEquals("1 Book1 Author1", book.toString());

        verify(bookRepositoryMock).findById("1");
    }

    @Test
    void findAllTest() {
        when(bookService.findAllBooks()).thenReturn(Arrays.asList(new Book("1", "Book1", "Author1"),
                                                                    new Book("2", "Book2", "Author2")));

        List<Book> books = bookService.findAllBooks();

        assertEquals("[1 Book1 Author1, 2 Book2 Author2]", books.toString());

        verify(bookRepositoryMock).findAll();
    }
}