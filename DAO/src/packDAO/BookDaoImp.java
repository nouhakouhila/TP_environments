package packDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import.pa

public class BookDaoImp implements Bookdao {
    private final Connection connection;

    public BookDaoImpl() {
        // Récupérer la connexion depuis la classe ConnectionFactory
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void addBook(BookBean book) throws SQLException {
        String sql = "INSERT INTO book (title, author, price) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setFloat(3, book.getPrice());
            statement.executeUpdate();
        }
    }

    @Override
    public void updateBook(BookBean book) throws SQLException {
        String sql = "UPDATE book SET title = ?, author = ?, price = ? WHERE book_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setFloat(3, book.getPrice());
            statement.setLong(4, book.getBook_id());
            statement.executeUpdate();
        }
    }

    @Override
    public void deleteBook(Long book_id) throws SQLException {
        String sql = "DELETE FROM book WHERE book_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, book_id);
            statement.executeUpdate();
        }
    }

    @Override
    public void displayAll() throws SQLException {
        String sql = "SELECT * FROM book";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                System.out.println("Book ID: " + resultSet.getLong("book_id"));
                System.out.println("Title: " + resultSet.getString("title"));
                System.out.println("Author: " + resultSet.getString("author"));
                System.out.println("Price: " + resultSet.getFloat("price"));
                System.out.println("-----------------------------");
            }
        }
    }

    @Override
    public void findBook(String kw) throws SQLException {
        String sql = "SELECT * FROM book WHERE title LIKE ? OR author LIKE ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "%" + kw + "%");
            statement.setString(2, "%" + kw + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println("Book ID: " + resultSet.getLong("book_id"));
                    System.out.println("Title: " + resultSet.getString("title"));
                    System.out.println("Author: " + resultSet.getString("author"));
                    System.out.println("Price: " + resultSet.getFloat("price"));
                    System.out.println("-----------------------------");
                }
            }
        }
    }
}
