package rafael.edu.helper;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import rafael.edu.entity.Book;
import rafael.edu.entity.Customer;
import rafael.edu.entity.RentRegistration;

public class RentRegistrationHelper {

	private EntityManager em;

	private EntityManagerFactory emf;

	public RentRegistrationHelper(EntityManager em) {
		this.em = em;
	}

	// CREATE
	public String createRentRegistration(LocalDate rentDate, String returnDate, int idBook, int idCustomer) {
		try {
			emf = Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
			RentRegistration rentRegistration = new RentRegistration();
			Book book = em.find(Book.class, idBook);
			Customer customer = em.find(Customer.class, idCustomer);
			if (rentDate == null) {
				rentDate = LocalDate.now();
			}
			rentRegistration.setRentDate(rentDate);
			rentRegistration.setReturnDate(returnDate);
			rentRegistration.setBook(book);
			rentRegistration.setCustomer(customer);
			em.getTransaction().begin();
			em.persist(rentRegistration);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringRentRegistrationCreated();
	}

	// UPDATE

	// READ

	// DELETE

	// TOSTRING
	private String toStringRentRegistrationCreated() {
		return "Rent Registration created.";
	}

}
