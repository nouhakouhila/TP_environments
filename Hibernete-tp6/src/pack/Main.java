package pack;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookEm bookEm = new BookEmImpl();

        // Afficher tous les enregistrements de la table book
        System.out.println("All books:");
        List<BookBean> allBooks = bookEm.bookDisplayAll();
        for (BookBean book : allBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", Price: " + book.getPrice());
        }

        // Insérer un nouveau book
        BookBean newBook = new BookBean();
        newBook.setTitle("New Book");
        newBook.setAuthor("New Author");
        newBook.setPrice(29.99);
        bookEm.bookAdd(newBook);

        // Afficher le nouveau book ajouté
        System.out.println("\nNewly added book:");
        List<BookBean> newBooks = bookEm.bookFindByKw("New");
        for (BookBean book : newBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", Price: " + book.getPrice());
        }

        // Modifier le prix de ce book
        if (!newBooks.isEmpty()) {
            BookBean updatedBook = newBooks.get(0);
            updatedBook.setPrice(39);
            bookEm.updateBook(updatedBook);
            System.out.println("\nUpdated book price:");
            System.out.println(updatedBook.getTitle() + " by " + updatedBook.getAuthor() + ", Updated Price: " + updatedBook.getPrice());
        }

        // Supprimer un book
        List<BookBean> booksToDelete = bookEm.bookFindByKw("New");
        if (!booksToDelete.isEmpty()) {
            BookBean bookToDelete = booksToDelete.get(0);
            bookEm.deleteBook(bookToDelete.getBook_id());
            System.out.println("\nBook deleted successfully.");
        }
    }
}
