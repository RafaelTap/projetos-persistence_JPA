package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
			emf = Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
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

	// READ

	// DELETE

	// TOSTRING
	public String tostringCustomerCreated() {
		return "Customer created.";
	}

}
