package rafael.edu.helper;

import javax.persistence.EntityManager;

import rafael.edu.entity.Medico;
import rafael.edu.entity.Paciente;

public class HelperPaciente {

	EntityManager em;

	public HelperPaciente(EntityManager em) {
		this.em = em;
	}

	// CREATE
	public String cadastrarPaciente(String cpf, String idade, String matricula, String nome) {
		try {
			Paciente paciente = new Paciente();
			paciente.setMatricula(cpf);
			paciente.setNome(idade);
			paciente.setIdade(matricula);
			paciente.setCpf(nome);
			em.getTransaction().begin();
			em.persist(paciente);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return toStringPacienteCadastrado();
	}
	
	//DELETE
	public String excluirPaciente(int idPaciente) {
		try {
			Paciente paciente = em.find(Paciente.class, idPaciente);
			em.getTransaction().begin();
			em.remove(paciente);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return toStringPacienteExcluido();
	}

	// TOSTRINGS
	private String toStringPacienteCadastrado() {
		return "Paciente cadastrado.";
	}
	
	private String toStringPacienteExcluido() {
		return "Paciente excluído.";
	}
	
}
