package com.visitorledger.app.entity;


import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Visitor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private String name;
    private String email;
    private int age;
    private String gender;
    private String contactNumber;
    private String reasonForMeeting;
    private String visitorOrganization;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Employee employ;
    //private int whomToMeet;
    private LocalDateTime inTime;
    private LocalDateTime outTime;
    //private String imgPath;
    
	public Integer getId() {
		return id;
	}
	public Visitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getReasonForMeeting() {
		return reasonForMeeting;
	}
	public void setReasonForMeeting(String reasonForMeeting) {
		this.reasonForMeeting = reasonForMeeting;
	}
	public String getVisitorOrganization() {
		return visitorOrganization;
	}
	public void setVisitorOrganization(String visitorOrganization) {
		this.visitorOrganization = visitorOrganization;
	}
	public LocalDateTime getInTime() {
		return inTime;
	}
	public void setInTime(LocalDateTime inTime) {
		this.inTime = inTime;
	}
	public LocalDateTime getOutTime() {
		return outTime;
	}
	public void setOutTime(LocalDateTime outTime) {
		this.outTime = outTime;
	}
	public Employee getEmploy() {
		return employ;
	}
	public void setEmploy(Employee employ) {
		this.employ = employ;
	}
    
	



	
    
	
    
}
