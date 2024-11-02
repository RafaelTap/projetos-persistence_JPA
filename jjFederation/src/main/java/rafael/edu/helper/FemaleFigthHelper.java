package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import rafael.edu.entity.Arena;
import rafael.edu.entity.FemaleCategory;
import rafael.edu.entity.FemaleFigth;

public class FemaleFigthHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public FemaleFigthHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}

	// CREATE
	public void createFemaleFigth(String time, String name, int idFemaleCategory, int idArena) {
		try {
			FemaleFigth femaleFigth = new FemaleFigth();
			FemaleCategory femaleCategory = em.find(FemaleCategory.class, idFemaleCategory);
			Arena arena = em.find(Arena.class, idArena);
			femaleFigth.setTime(time);
			femaleFigth.setName(name);
			femaleFigth.setFemaleCategory(femaleCategory);
			femaleFigth.setArena(arena);

			if (name == null) {
				name = "eliminatória";
			}

			em.getTransaction().begin();
			em.persist(femaleFigth);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}

		// READ

	}

}
