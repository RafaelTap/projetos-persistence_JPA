package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import rafael.edu.entity.Section;

public class SectionHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public SectionHelper(EntityManager em) {
		this.em = em;
	}

	// CREATE
	public String createSection (String sectionName, int number) {
		try {
			emf = Persistence.createEntityManagerFactory("library");
			em = emf.createEntityManager();
			Section section = new Section();
			section.setSectionName(sectionName);
			section.setNumber(number);
			em.getTransaction().begin();
			em.persist(section);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			em.close();
			emf.close();
		}
		return toStringSectionCreated();
	}

	// UPDATE

	// READ

	// DELETE
	
	//TOSTRING
	public String toStringSectionCreated() {
		return "Section created";
	}

}
