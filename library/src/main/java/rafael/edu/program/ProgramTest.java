package rafael.edu.program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProgramTest {
	
	public static void main(String[] args) {
		
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("library");
		em = emf.createEntityManager();
		
		//SectionHelper shDao = new SectionHelper(em);
		//shDao.createSection("Física", 1);
		//shDao.createSection("Química", 2);
		//shDao.createSection("Biologia", 3);
		//shDao.createSection("Matemática", 4);
		//shDao.createSection("Geografia", 5);
		//shDao.createSection("História", 6);
		//shDao.createSection("Português", 7);
		//shDao.createSection("Filosofia", 8);
		//shDao.createSection("Inglês", 9);
		//shDao.createSection("Artes", 10);
		
		//Queries q = new Queries(em, emf);
		//q.sectionsFullList();
		
		//BookHelper bhDao = new BookHelper(em, emf);
		//bhDao.createBook("Fundamentals of Physics", "David Halliday, Robert Resnick, Jearl Walker", 1);
		//bhDao.createBook("Classical Mechanics", "Herbert Goldstein", 1);
		//bhDao.createBook("Thermal Physics", "Charles Kittel e Herbert Kroemer", 1);
		//bhDao.createBook("Introduction to Electrodynamics", "David J. Griffiths", 1);
		//bhDao.createBook("Quantum Mechanics: Concepts and Applications", "Nouredine Zettili", 1);
		
		//Queries q = new Queries(em, emf);
		//q.booksFullList();
		//q.booksBySectionList();
		
		//CustomerHelper chDao = new CustomerHelper(em, emf);
		//chDao.createCustomer("Rafael Nunes Braga", 1001);
		//chDao.createCustomer("Giulia Mendes", 1002);
		//chDao.createCustomer("Rosana Mendonça Martins", 1003);
		//chDao.createCustomer("Rodrigo Pereira Nunes", 1004);
		//chDao.createCustomer("Márcia Ana Andrade", 1005);
		//chDao.createCustomer("Péricles Baltazar Pinto", 1006);
		//chDao.createCustomer("Márcio Braga Andare", 1007);
		//chDao.createCustomer("Rosilene Da Silva Petro", 1008);
		//chDao.createCustomer("Janaína Borges Bento", 1009);
		//chDao.createCustomer("Gilmar Antunes Rodrigues", 1010);
		
		//Queries q = new Queries(em, emf);
		//q.customersFullList();
	}

}
