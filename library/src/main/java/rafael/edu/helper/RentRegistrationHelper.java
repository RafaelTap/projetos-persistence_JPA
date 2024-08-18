package rafael.edu.helper;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import rafael.edu.entity.Book;
import rafael.edu.entity.Customer;
import rafael.edu.entity.RentRegistration;

public class RentRegistrationHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public RentRegistrationHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}

	// CREATE
	public String createRentRegistration(LocalDate rentDate, String returnDate, int idBook, int idCustomer) {
		try {
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
	public String upDateRentRegistration(int idRent, String returnDate) {
		try {
			RentRegistration rentRegistration = em.find(RentRegistration.class, idRent);
			rentRegistration.setReturnDate(returnDate);
			em.getTransaction().begin();
			em.merge(rentRegistration);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringUpDatedRentRegistration();
	}

	// READ
	public String getRentRegistration(int idRent) {
		try {
			em.find(RentRegistration.class, idRent);
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringGettingRentRegistration();
	}

	// DELETE
	public String removeRentRegistration(int idRent) {
		try {
			RentRegistration rentRegistration = em.find(RentRegistration.class, idRent);
			em.getTransaction().begin();
			em.remove(rentRegistration);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringRemovedRentRegistration();
	}

	// TOSTRING
	private String toStringRentRegistrationCreated() {
		return "Rent Registration created.";
	}

	private String toStringUpDatedRentRegistration() {
		return "Up dated rent registration.";
	}

	private String toStringRemovedRentRegistration() {
		return "Rent registration removed.";
	}

	private String toStringGettingRentRegistration() {
		RentRegistration rentRegistration = new RentRegistration();
		return "Rent date: " + rentRegistration.getRentDate() + "\nReturn date: "
				+ rentRegistration.getReturnDate().toString() + "\nCustomer: " + rentRegistration.getCustomer()
				+ "\nBook: " + rentRegistration.getBook();
	}

}
