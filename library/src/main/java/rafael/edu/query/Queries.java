package rafael.edu.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import rafael.edu.entity.Book;
import rafael.edu.entity.Customer;
import rafael.edu.entity.RentRegistration;
import rafael.edu.entity.Section;

public class Queries {

	private EntityManagerFactory emf;
	private EntityManager em;

	public Queries(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}

	// BOOKS LISTS
	public void booksFullList() {
		try {
			em.getTransaction().begin();
			List<Book> bookList = em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
			em.getTransaction().commit();
			for (Book b : bookList) {
				System.out.println("Title: " + b.getTitle() + "\nAuthor: " + b.getAuthor() + "\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

	public void booksFullListBySection() {
		try {
			em.getTransaction().begin();
			List<Book> booksBySection = em
					.createQuery("SELECT b FROM Book b JOIN FETCH b.section s ORDER BY s.sectionName", Book.class)
					.getResultList();
			em.getTransaction().commit();
			for (Book b : booksBySection) {
				System.out.println("Section: " + b.getSection().getSectionName() + "\nTitle: " + b.getTitle()
						+ "\nAuthor: " + b.getAuthor() + "\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

	// CUSTOMERS LISTS
	public void customersFullList() {
		try {
			em.getTransaction().begin();
			List<Customer> customerList = em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
			em.getTransaction().commit();
			for (Customer c : customerList) {
				System.out.println("Name: " + c.getName() + "\nRegistration: " + c.getRegistration());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			em.close();
		}
	}

	// RENT REGISTRATIONs LISTS
	public void rentRegistrationsFullList() {
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			List<RentRegistration> rentRegistrationList = em
					.createQuery("SELECT r FROM RentRegistration r JOIN r.customer c JOIN r.book b",
							RentRegistration.class)
					.getResultList();
			em.getTransaction().commit();
			for (RentRegistration r : rentRegistrationList) {
				System.out.println("Customer: " + r.getCustomer().getName() + "\nBook: " + r.getBook().getTitle()
						+ "\nRent date: " + r.getRentDate() + "\nReturn date: " + r.getReturnDate() + "\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

	// SECTIONS LIST
	public void sectionsFullList() {
		try {
			em.getTransaction().begin();
			List<Section> sectionList = em.createQuery("SELECT s FROM Section s", Section.class).getResultList();
			em.getTransaction().commit();
			for (Section s : sectionList) {
				System.out.println("Name: " + s.getSectionName() + "\nRow: " + s.getNumber());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

	// BOOKS FROM CUSTOMERS

	// CUSTOMERS FROM BOOKS
}
