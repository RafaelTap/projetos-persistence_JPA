package rafael.edu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTeam;
	
	@Column
	private String name;
	
	@OneToOne
	private MaleAthlete teamLeader;
	
	@OneToMany(mappedBy = "team")
	private List<FemaleAthlete> femaleAthletesList;
	
	@OneToMany(mappedBy = "team")
	private List<MaleAthlete> maleAthletesList;

	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MaleAthlete getTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(MaleAthlete teamLeader) {
		this.teamLeader = teamLeader;
	}

	public List<FemaleAthlete> getFemaleAthletesList() {
		return femaleAthletesList;
	}

	public void setFemaleAthletesList(List<FemaleAthlete> femaleAthletesList) {
		this.femaleAthletesList = femaleAthletesList;
	}

	public List<MaleAthlete> getMaleAthletesList() {
		return maleAthletesList;
	}

	public void setMaleAthletesList(List<MaleAthlete> maleAthletesList) {
		this.maleAthletesList = maleAthletesList;
	}
	
}
