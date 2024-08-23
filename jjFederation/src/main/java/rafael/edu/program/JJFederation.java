package rafael.edu.program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JJFederation {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jjFederation");
		EntityManager  em = emf.createEntityManager();
		
	
	}
}
