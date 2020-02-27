package com.hcmc.hcmc.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patients")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="patientnumber")
	private String patientNumber;
	@Column(name="isanoutpatient")
	private boolean isAnOutPatient;
	@Column(name="fullname")
	private String fullName;
	@Column(name="emailaddress")
	private String emailAddress;
	@Column(name="contact")
	private String contactPhoneNumber;
	@Column(name="dob")
	private Date dateOfBirth;
	public Patient() {}
	public int getId() {
		return id;
	}
	public void setPatientId(int patientId) {
		this.id = patientId;
	}
	public String getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}
	public boolean getIsAnOutPatient() {
		return isAnOutPatient;
	}
	public void setAnOutPatient(boolean isAnOutPatient) {
		this.isAnOutPatient = isAnOutPatient;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
