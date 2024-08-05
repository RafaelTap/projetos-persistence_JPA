package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import rafael.edu.entity.Book;

public class BookHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public BookHelper(EntityManager em) {
		this.em = em;
	}

	// CREATE
	public String createBook(String title, String author) {
		try {
			emf = Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
			Book book = new Book();
			book.setTitle(title);
			book.setAuthor(author);
			em.getTransaction().begin();
			em.persist(book);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return tostringBookCreated();
	}

	// UPDATE

	// READ

	// DELETE

	// TOSTRING

	private String tostringBookCreated() {
		return "Book created.";
	}

}
