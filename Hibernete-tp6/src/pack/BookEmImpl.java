package pack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookEmImpl implements BookEm {
    private EntityManagerFactory entityManagerFactory;

    public BookEmImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("Bookstore");
    }

    @Override
    public void bookAdd(Book book) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    // Implement other methods
}
