package com.hibernate;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
public class Address {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name="address_Id")
	private int addressId;
	
	@Column(length = 50,name="street")
	private String Street;
	
	private String City;
	
	private boolean isOpen;
	@Transient
	private double x;
	
	@Temporal(TemporalType.DATE)
	private Date openDate;
	
	@Lob
	private byte[] image;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String street, String city, boolean isOpen, double x, Date openDate, byte[] image) {
		super();
		this.addressId = addressId;
		Street = street;
		City = city;
		this.isOpen = isOpen;
		this.x = x;
		this.openDate = openDate;
		this.image = image;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + this.addressId + ", Street=" + this.Street + ", City=" +
	this.City + ", isOpen=" + this.isOpen
				+ "openDate=" + this.openDate + ", image=" + Arrays.toString(image) + "]";
	}
	

}
