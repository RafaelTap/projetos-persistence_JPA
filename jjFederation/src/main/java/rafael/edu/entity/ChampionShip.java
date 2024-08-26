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
@Table(name = "championShip")
public class ChampionShip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idChampionShip;

	@Column
	private String name;

	@Column
	private String date;

	@Column
	private String time;

	@OneToMany
	private List<Arena> arenasList;

	public int getIdChampionShip() {
		return idChampionShip;
	}

	public void setIdChampionShip(int idChampionShip) {
		this.idChampionShip = idChampionShip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<Arena> getArenasList() {
		return arenasList;
	}

	public void setArenasList(List<Arena> arenasList) {
		this.arenasList = arenasList;
	}

}
