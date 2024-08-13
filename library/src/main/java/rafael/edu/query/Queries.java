package rafael.edu.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import rafael.edu.entity.Book;
import rafael.edu.entity.Customer;
import rafael.edu.entity.RentRegistration;
import rafael.edu.entity.Section;

public class Queries {

	private EntityManagerFactory emf;
	private EntityManager em;

	// BOOKS LISTS
	public void bookFullList() {
		try {
			Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			List<Book> bookList = em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
			em.getTransaction().commit();
			for (Book b : bookList) {
				System.out.println("Title: " + b.getTitle() + "\nAuthor: " + b.getAuthor());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}
	
	/*
	 * check query: select book list from one section.
	 */

	// CUSTOMERS LISTS
	public void customerFullList() {
		try {
			Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
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
	public void rentRegistrationFullList() {
		try {
			Persistence.createEntityManagerFactory("library");
			emf.createEntityManager();
			em = emf.createEntityManager();
			em.getTransaction().begin();
			List<RentRegistration> rentRegistrationList = em
					.createQuery("SELECT r FROM RentRegistration r", RentRegistration.class).getResultList();
			em.getTransaction().commit();
			for (RentRegistration r : rentRegistrationList) {
				System.out.println("Customer: " + r.getCustomer() + "\nBook: " + r.getBook() + "\nRent date: "
						+ r.getRentDate() + "\nReturn date: " + r.getReturnDate());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

	// SECTIONS LIST
	public void sectionFullList() {
		try {
			Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			List<Section> sectionList = em.createQuery("SELECT s FROM Section s", Section.class).getResultList();
			em.getTransaction().commit();
			for (Section s : sectionList) {
				System.out.println("Name: " + s.getSectionName() + "\nRoW: " + s.getNumber());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}
}
