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
@Table(name = "maleCategory")
public class MaleCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMaleCategory;
	
	@Column
	private String name;
	
	@Column
	private String age;
	
	@Column
	private String graduation;
	
	@Column
	private String weight;
	
	@OneToMany(mappedBy = "maleCategory")
	private List<MaleFigth> maleFigth;

	public int getIdMaleCategory() {
		return idMaleCategory;
	}

	public void setIdMaleCategory(int idMaleCategory) {
		this.idMaleCategory = idMaleCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public List<MaleFigth> getMaleFigth() {
		return maleFigth;
	}

	public void setMaleFigth(List<MaleFigth> maleFigth) {
		this.maleFigth = maleFigth;
	}
	
}
