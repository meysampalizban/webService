package ir.spring.createapp001.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue
	private int id;
	
	private String country;
	private String city;
	private String street;
	private long zipCode;
	
	
	public Address() {
		
	}
	public Address(String country,String city,String street, long zipCode) {
		this.country=country;
		this.city=city;
		this.street=street;
		this.zipCode=zipCode;
	}
	
	
	public int getId() {
		return id;
	}
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", city=" + city + ", street=" + street + ", zipCode="
				+ zipCode + "]";
	}
	
	
}
