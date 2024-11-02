package rafael.edu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class FemaleFigth {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFemaleFigth;

	@Column
	private String time;

	@Column
	private String name;

	@ManyToOne
	@JoinColumn(name = "femaleCategory_idFemaleCategory")
	private FemaleCategory femaleCategory;

	@ManyToMany(mappedBy = "femaleFigthList")
	private List<FemaleAthlete> femaleAthleteList;

	@ManyToOne
	@JoinColumn(name = "arena_idArena")
	private Arena arena;

	public int getIdFemaleFigth() {
		return idFemaleFigth;
	}

	public void setIdFemaleFigth(int idFemaleFigth) {
		this.idFemaleFigth = idFemaleFigth;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FemaleCategory getFemaleCategory() {
		return femaleCategory;
	}

	public void setFemaleCategory(FemaleCategory femaleCategory) {
		this.femaleCategory = femaleCategory;
	}

	public List<FemaleAthlete> getFemaleAthleteList() {
		return femaleAthleteList;
	}

	public void setFemaleAthleteList(List<FemaleAthlete> femaleAthleteList) {
		this.femaleAthleteList = femaleAthleteList;
	}

	public Arena getArena() {
		return arena;
	}

	public void setArena(Arena arena) {
		this.arena = arena;
	}

}
