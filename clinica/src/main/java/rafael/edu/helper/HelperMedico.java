package rafael.edu.helper;

import javax.persistence.EntityManager;

import rafael.edu.entity.Medico;

public class HelperMedico {

	EntityManager em;

	public HelperMedico(EntityManager em) {
		this.em = em;
	}

	// CREATE
	public String cadastrarMedico(String nome, String crm, String especialidade, String matricula) {
		try {
			Medico medico = new Medico();
			medico.setNome(nome);
			medico.setCrm(crm);
			medico.setEspecialista(especialidade);
			medico.setMatricula(matricula);
			em.getTransaction().begin();
			em.persist(medico);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return toStringMedicoCadastrado();
	}
	
	// READ
		public Medico obterPaciente(int idMedico) {
			Medico Medico = em.find(Medico.class, idMedico); 
			return Medico;
		}

	// DELETE
	public String excluirMedico(int idMedico) {
		try {
			Medico medico = em.find(Medico.class, idMedico);
			em.getTransaction().begin();
			em.remove(medico);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return toStringMedicoExcluido();
	}

	// TOSTRINGS
	private String toStringMedicoCadastrado() {
		return "Médico cadastrado.";
	}

	private String toStringMedicoExcluido() {
		return "Médico deletado com sucesso.";
	}
}
