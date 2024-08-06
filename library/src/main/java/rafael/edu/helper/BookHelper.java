package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import rafael.edu.entity.Book;
import rafael.edu.entity.Section;

public class BookHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public BookHelper(EntityManager em) {
		this.em = em;
	}

	// CREATE
	public String createBook(String title, String author, int idSection) {
		try {
			emf = Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
			Book book = new Book();
			Section section = em.find(Section.class, idSection);
			book.setTitle(title);
			book.setAuthor(author);
			book.setSection(section);
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
	public String upDateBook(String title, String author, int idBook) {
		try {
			emf = Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
			Book book = em.find(Book.class, idBook);
			book.setTitle(title);
			book.setAuthor(author);
			em.getTransaction().begin();
			em.merge(book);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringUpDatedBook();
	}

	// READ
	public void getBook(int idBook) {
		try {
			emf = Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
			em.find(Book.class, idBook);
			System.out.println(toStringGettingBook());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

	// DELETE
	public String removeBook(int idBook) {
		try {
			emf = Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
			Book book = em.find(Book.class, idBook);
			em.getTransaction().begin();
			em.remove(book);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return TostringRemovedBook();
	}

	// TOSTRING

	private String tostringBookCreated() {
		return "Book created.";
	}

	private String toStringUpDatedBook() {
		return "Up dated book.";
	}

	public String toStringGettingBook() {
		Book book = new Book();
		return "Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor();
	}

	private String TostringRemovedBook() {
		return "Book removed.";
	}

}
