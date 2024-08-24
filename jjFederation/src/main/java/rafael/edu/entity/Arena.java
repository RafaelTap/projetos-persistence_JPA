package rafael.edu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Arena {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idArena;
	
	@Column
	private int arenaNumber;
	
	private List<FemaleFigth> femaleFigthsList;
		
	private List<MaleFigth> maleFigthsList;

}
