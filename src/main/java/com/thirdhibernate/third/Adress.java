package com.thirdhibernate.third;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class Adress {
      String city;
      String country;
      String pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Adress() {
		// TODO Auto-generated constructor stub
	}

}
