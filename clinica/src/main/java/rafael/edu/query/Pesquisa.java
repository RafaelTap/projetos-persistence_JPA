package rafael.edu.query;

import java.util.List;

import javax.persistence.EntityManager;

import rafael.edu.entity.Consulta;
import rafael.edu.entity.Medico;
import rafael.edu.entity.Paciente;

public class Pesquisa {

	EntityManager em;

	public Pesquisa(EntityManager em) {
		this.em = em;
	}

	public void medicoLista() {
		try {
			em.getTransaction().begin();
			List<Medico> listaMedico = em.createQuery("SELECT m FROM Medico m", Medico.class).getResultList();
			em.getTransaction().commit();

			for (Medico m : listaMedico) {
				System.out.println("Nome: " + m.getNome() + "\nCRM: " + m.getCrm() + "\nEspecialidade: "
						+ m.getEspecialidade() + "\nMatricula: " + m.getMatricula());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void pacienteLista() {
		try {
			em.getTransaction().begin();
			List<Paciente> listaPaciente = em.createQuery("SELECT p FROM Paciente p", Paciente.class).getResultList();
			em.getTransaction().commit();

			for (Paciente p : listaPaciente) {
				System.out.println("\nNome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\n Cpf: " + p.getCpf()
						+ "\nMatrícula: " + p.getMatricula());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void consultaLista() {
		try {
			em.getTransaction().begin();
			List<Consulta> listaConsulta = em.createQuery("SELECT c FROM Consulta c", Consulta.class).getResultList();
			em.getTransaction().commit();

			for (Consulta c : listaConsulta) {
				System.out.println("Data: " + c.getData() + "\nDia da semana: " + c.getDiaSemana() + "\nHorário: "
						+ c.getHorario() + "\nPaciente: " + c.getPaciente() + "\nDoutor(a): " + c.getMedico());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
