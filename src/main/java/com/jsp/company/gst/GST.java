package com.jsp.company.gst;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GST {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private int gst_number;
	
	@OneToOne
	private Company company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGst_number() {
		return gst_number;
	}

	public void setGst_number(int gst_number) {
		this.gst_number = gst_number;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	
}
