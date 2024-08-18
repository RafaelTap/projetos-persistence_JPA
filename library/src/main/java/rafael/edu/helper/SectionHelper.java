package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import rafael.edu.entity.Section;

public class SectionHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public SectionHelper(EntityManager em, EntityManagerFactory emf)  {
		this.em = em;
		this.emf = emf;
	}

	// CREATE
	public String createSection(String sectionName, int number) {
		try {
			Section section = new Section();
			section.setSectionName(sectionName);
			section.setNumber(number);
			em.getTransaction().begin();
			em.persist(section);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringSectionCreated();
	}

	// UPDATE
	public String upDateSection(String sectionName, int number, int idSection) {
		try {
			Section section = em.find(Section.class, idSection);
			section.setSectionName(sectionName);
			section.setNumber(number);
			em.getTransaction().begin();
			em.merge(section);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringUpDatedSection();
	}

	// READ
	public void getSection(int idSection) {
		try {
			em.find(Section.class, idSection);
			System.out.println(toStringGettingSection());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

	// DELETE
	public String removeSection(int idSection) {
		try {
			Section section = em.find(Section.class, idSection);
			em.getTransaction().begin();
			em.remove(section);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
		return toStringRemovedSection();
	}

	// TOSTRING
	private String toStringSectionCreated() {
		return "Section created";
	}

	private String toStringUpDatedSection() {
		return "Up dated section";
	}

	private String toStringGettingSection() {
		Section section = new Section();
		return "Section: " + section.getSectionName() + "\nrow: " + section.getNumber();
	}

	private String toStringRemovedSection() {
		return "Section removed.";
	}

}
