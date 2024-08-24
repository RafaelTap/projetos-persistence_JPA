package rafael.edu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChampionShip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idChampionShip;
	
	@Column
	private String name;
	
	@Column
	private String time;
	
	@Column
	private String local;
	private List<FemaleFigth> femaleFigthsList;
	private List<MaleFigth> maleFigthsList;
}
