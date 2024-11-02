package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import rafael.edu.entity.FemaleCategory;

public class FemaleCategoryHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public FemaleCategoryHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}

	// CREATE
	public void createFemaleCategory(String name, String age, String graduation, String weigth) {
		try {
			FemaleCategory femaleCategory = new FemaleCategory();
			femaleCategory.setName(name);
			femaleCategory.setAge(age);
			femaleCategory.setGraduation(graduation);
			femaleCategory.setWeight(weigth);
			em.getTransaction().begin();
			em.persist(femaleCategory);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();

		}
	}

	// READ
	public void getFemaleCategory(int idFemaleCategory) {
		try {
			FemaleCategory femaleCategory = em.find(FemaleCategory.class, idFemaleCategory);
			System.out.println("Category: " + femaleCategory.getName() + "\nWeight: " + femaleCategory.getWeight()
					+ "\nAge: " + femaleCategory.getAge() + "\nGaduation: " + femaleCategory.getGraduation());

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}
	}

	// UPDATE
	public void upDateCategory(String name, String age, String graduation, String weigth) {
		try {
			FemaleCategory femaleCategory = new FemaleCategory();
			femaleCategory.setName(name);
			femaleCategory.setAge(age);
			femaleCategory.setGraduation(graduation);
			femaleCategory.setWeight(weigth);
			em.getTransaction().begin();
			em.merge(femaleCategory);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();

		}
	}

	// DELETE
	public void deleteFemaleCategory(int idFemaleCategory) {
		try {
			FemaleCategory femaleCategory = em.find(FemaleCategory.class, idFemaleCategory);
			em.getTransaction().begin();
			em.remove(femaleCategory);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}
	}

}
