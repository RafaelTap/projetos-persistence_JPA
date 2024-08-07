package rafael.edu.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import rafael.edu.entity.Book;
import rafael.edu.entity.Customer;

public class Queries {

	private EntityManagerFactory emf;
	private EntityManager em;

	//BOOKS LISTS
	public void bookFullList() {
		try {
			Persistence.createEntityManagerFactory("library");
			emf.createEntityManager();
			em.getTransaction().begin();
			List<Book> bookList = em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
			em.getTransaction().commit();
			for(Book b : bookList) {
				System.out.println("Title: " + b.getTitle() + "\nAuthor: " + b.getAuthor());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}

	}
	
	//CUSTOMERS LISTS
	public void customerFullList() {
		try {
			Persistence.createEntityManagerFactory("library");
			emf.createEntityManager();
			em.getTransaction().begin();
			List<Customer> customerList = em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
			em.getTransaction().commit();
			for(Customer c : customerList) {
				System.out.println("Name: " + c.getName() + "\nRegistration: " + c.getRegistration());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
