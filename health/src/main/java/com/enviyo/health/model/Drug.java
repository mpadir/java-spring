package com.enviyo.health.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="drug")
public class Drug  {
	
	@Id
	private int id;
	@Column(name="drug_name")
	private String drugName;
	@Column(name="company")
	private String company;
	
	public Drug() {
		
	}
	public Drug (Integer id, String drugName,String company) {
		this.id=id;
		this.drugName=drugName;
		this.company=company;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

		@Override
		public String toString() {
			return id+" "+drugName+" "+company;
		}
			
}
