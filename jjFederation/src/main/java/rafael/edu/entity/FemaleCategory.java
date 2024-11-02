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
@Table(name = "femaleCategory")
public class FemaleCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFemaleCategory;

	@Column
	private String name;

	@Column
	private String age;

	@Column
	private String graduation;

	@Column
	private String weight;

	@OneToMany(mappedBy = "femaleCategory")
	private List<FemaleFigth> femaleFigthsList;

	public int getIdFemaleCategory() {
		return idFemaleCategory;
	}

	public void setIdFemaleCategory(int idFemaleCategory) {
		this.idFemaleCategory = idFemaleCategory;
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

	public List<FemaleFigth> getFemaleFigthsList() {
		return femaleFigthsList;
	}

	public void setFemaleFigthsList(List<FemaleFigth> femaleFigthsList) {
		this.femaleFigthsList = femaleFigthsList;
	}

}
