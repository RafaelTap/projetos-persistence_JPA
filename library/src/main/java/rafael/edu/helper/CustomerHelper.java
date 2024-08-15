package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import rafael.edu.entity.Customer;

public class CustomerHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public CustomerHelper(EntityManager em) {
		this.em = em;
	}

	// CREATE
	public String createCustomer(String name, int registration) {
		try {
			Customer customer = new Customer();
			customer.setName(name);
			customer.setRegistration(registration);
			em.getTransaction().begin();
			em.persist(customer);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return tostringCustomerCreated();
	}

	// UPDATE
	public String UpDateCustomer(String name, int registration, int idCustomer) {
		try {
			Customer customer = em.find(Customer.class, idCustomer);
			customer.setName(name);
			customer.setRegistration(registration);
			em.getTransaction().begin();
			em.merge(customer);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringUpdatedCustomer();
	}

	// READ
	public String getCustomer(int idCustomer) {
		try {
			em.find(Customer.class, idCustomer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringGettingCustomer();
	}

	// DELETE
	public String removeCustomer(int idCustomer) {
		try {
			em.find(Customer.class, idCustomer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringRemovedCustomer();
	}

	// TOSTRING
	private String tostringCustomerCreated() {
		return "Customer created.";
	}

	private String toStringUpdatedCustomer() {
		return "Up dated customer.";
	}

	private String toStringGettingCustomer() {
		Customer customer = new Customer();
		return "Name: " + customer.getName() + "\nRegistration: " + customer.getRegistration();
	}

	private String toStringRemovedCustomer() {
		return "Customer removed.";
	}

}
