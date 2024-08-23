package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MaleCategoryHelper {

	private EntityManager em;
	private EntityManagerFactory emf;
	
	public MaleCategoryHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}
	
}
