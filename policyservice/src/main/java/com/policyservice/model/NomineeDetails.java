package com.policyservice.model;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NomineeDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int nId;
	private String nFirstName;
	private String nLastName;
	private String nDOB;
	private String nAddress;
	private String nAadharNumber;
	private String nRelation;
	public String getnFirstName() {
		return nFirstName;
	}
	public void setnFirstName(String nFirstName) {
		this.nFirstName = nFirstName;
	}
	public String getnLastName() {
		return nLastName;
	}
	public void setnLastName(String nLastName) {
		this.nLastName = nLastName;
	}
	public String getnDOB() {
		return nDOB;
	}
	public void setnDOB(String nDOB) {
		this.nDOB = nDOB;
	}
	public String getnAddress() {
		return nAddress;
	}
	public void setnAddress(String nAddress) {
		this.nAddress = nAddress;
	}
	public String getnAadharNumber() {
		return nAadharNumber;
	}
	public void setnAadharNumber(String nAadharNumber) {
		this.nAadharNumber = nAadharNumber;
	}
	public String getnRelation() {
		return nRelation;
	}
	public void setnRelation(String nRelation) {
		this.nRelation = nRelation;
	}
	public int getnId() {
		return nId;
	}
	public void setnId(int nId) {
		this.nId = nId;
	}
	
	
}
