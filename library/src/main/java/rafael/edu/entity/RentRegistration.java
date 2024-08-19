package rafael.edu.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rentRegistration")
public class RentRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRentRegistration;

	@Column
	private LocalDate rentDate;

	@Column
	private String returnDate;

	@ManyToOne
	@JoinColumn(name = "book_idBook")
	private Book book;

	@ManyToOne
	@JoinColumn(name = "customer_idCustomer")
	private Customer customer;

	public int getIdRentRegistration() {
		return idRentRegistration;
	}

	public void setIdRentRegistration(int idRentRegistration) {
		this.idRentRegistration = idRentRegistration;
	}

	public LocalDate getRentDate() {
		return rentDate;
	}

	public void setRentDate(LocalDate rentDate) {
		this.rentDate = rentDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
