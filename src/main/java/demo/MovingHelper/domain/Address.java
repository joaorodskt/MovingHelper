package demo.MovingHelper.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADDRESSES")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String street;
	private int number;
	private String city;
	private String district;
	private String country;
	private String postcode;
	
	public Address() {
		super();
	}

	public Address(long id, String street, int number, String city, String district, String country, String postcode) {
		this.id = id;
		this.street = street;
		this.number = number;
		this.city = city;
		this.district = district;
		this.country = country;
		this.postcode = postcode;
	}

	
}
