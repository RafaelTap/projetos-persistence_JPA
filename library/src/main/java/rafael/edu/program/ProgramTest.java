package rafael.edu.program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import rafael.edu.helper.SectionHelper;

public class ProgramTest {
	
	public static void main(String[] args) {
		
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("library");
		em = emf.createEntityManager();
		
		SectionHelper shDao = new SectionHelper(em);
		shDao.createSection("Física", 1);
		shDao.createSection("Química", 2);
		shDao.createSection("Biologia", 3);
		shDao.createSection("Matemática", 4);
		shDao.createSection("Geografia", 5);
		shDao.createSection("História", 6);
		shDao.createSection("Português", 7);
		shDao.createSection("Filosofia", 8);
		shDao.createSection("Inglês", 9);
		shDao.createSection("Artes", 10);
		
	}

}
