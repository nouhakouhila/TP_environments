package packDAO;
import java.sql.SQLException;
public interface Bookdao {
    void addBook(BookBean book) throws SQLException;

    void updateBook(BookBean book) throws SQLException;

    void deleteBook(Long book_id) throws SQLException;

    void displayAll() throws SQLException;

    void findBook(String kw) throws SQLException;
}
