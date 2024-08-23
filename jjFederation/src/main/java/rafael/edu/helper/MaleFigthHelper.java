package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MaleFigthHelper {

	private EntityManager em;
	private EntityManagerFactory emf;
	
	public MaleFigthHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}
	
	
}
