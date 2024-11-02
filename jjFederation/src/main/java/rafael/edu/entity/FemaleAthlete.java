package rafael.edu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class FemaleAthlete {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFemaleAthlete;

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

	@ManyToMany
	@JoinTable(name = "femaleFight_has_femaleAthlete", joinColumns = @JoinColumn(referencedColumnName = "idFemaleAthlete"), inverseJoinColumns = @JoinColumn(referencedColumnName = "idFemaleFigth"))
	private List<FemaleFigth> femaleFigthList;

	public int getIdFemaleAthlete() {
		return idFemaleAthlete;
	}

	public void setIdFemaleAthlete(int idFemaleAthlete) {
		this.idFemaleAthlete = idFemaleAthlete;
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

	public List<FemaleFigth> getFemaleFigthList() {
		return femaleFigthList;
	}

	public void setFemaleFigthList(List<FemaleFigth> femaleFigthList) {
		this.femaleFigthList = femaleFigthList;
	}

}
