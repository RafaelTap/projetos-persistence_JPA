package rafael.edu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "arena")
public class Arena {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idArena;

	@Column
	private int arenaNumber;

	@OneToMany(mappedBy = "arena")
	private List<FemaleFigth> femaleFigthsList;

	@OneToMany(mappedBy = "arena")
	private List<MaleFigth> maleFigthsList;

	public int getIdArena() {
		return idArena;
	}

	public void setIdArena(int idArena) {
		this.idArena = idArena;
	}

	public int getArenaNumber() {
		return arenaNumber;
	}

	public void setArenaNumber(int arenaNumber) {
		this.arenaNumber = arenaNumber;
	}

	public List<FemaleFigth> getFemaleFigthsList() {
		return femaleFigthsList;
	}

	public void setFemaleFigthsList(List<FemaleFigth> femaleFigthsList) {
		this.femaleFigthsList = femaleFigthsList;
	}

	public List<MaleFigth> getMaleFigthsList() {
		return maleFigthsList;
	}

	public void setMaleFigthsList(List<MaleFigth> maleFigthsList) {
		this.maleFigthsList = maleFigthsList;
	}

}
