package pack;
import java.util.List;
public interface BookEm {
    void bookAdd(BookBean book);
    void updateBook(BookBean book);
    void deleteBook(Long book_id);
    List<BookBean> bookDisplayAll();
    List<BookBean> bookFindByKw(String kw);
}
