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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCustomer;

	@Column
	private String name;

	@Column
	private int registration;

	@OneToMany(mappedBy = "customer")
	private List<RentRegistration> RentRegistrationList;

	@ManyToMany
	@JoinTable(name = "book_has_customer", joinColumns = @JoinColumn(referencedColumnName = "idCustomer"), inverseJoinColumns = @JoinColumn(referencedColumnName = "idBook"))
	private List<Book> bookList;

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public List<RentRegistration> getRentRegistrationList() {
		return RentRegistrationList;
	}

	public void setRentRegistrationList(List<RentRegistration> rentRegistrationList) {
		RentRegistrationList = rentRegistrationList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

}
