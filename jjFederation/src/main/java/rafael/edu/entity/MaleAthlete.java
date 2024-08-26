package rafael.edu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class MaleAthlete {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMaleAthlete;

	@Column
	private String name;

	@Column
	private int age;

	@Column
	private String graduation;

	@OneToOne
	private TeamLeader teamLeader;

	@ManyToOne
	@JoinColumn(name = "team_idTeam")
	private Team team;

	@OneToOne
	private MaleFigth maleFight;

	public int getIdMaleAthlete() {
		return idMaleAthlete;
	}

	public void setIdMaleAthlete(int idMaleAthlete) {
		this.idMaleAthlete = idMaleAthlete;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public TeamLeader getTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(TeamLeader teamLeader) {
		this.teamLeader = teamLeader;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public MaleFigth getMaleFight() {
		return maleFight;
	}

	public void setMaleFight(MaleFigth maleFight) {
		this.maleFight = maleFight;
	}

}
