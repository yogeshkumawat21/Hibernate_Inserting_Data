package com.thirdhibernate.third;


import java.sql.Date;

import javax.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Product_id")
	int id;
	
	@Column(name = "Product_name")
	String name;
	
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	byte[] image;
	
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getDate() {
		return date;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, byte[] image, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.date = date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

	
}
