package com.okta.placement.MongoDbOAuth.entity;

import jakarta.persistence.*;

@Entity
                                 
public class Placement {
    public Placement(Long id, String companyName, String jobRole, String location, double packageSalary) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.jobRole = jobRole;
		this.location = location;
		this.packageSalary = packageSalary;
	}
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getPackageSalary() {
		return packageSalary;
	}
	public void setPackageSalary(double packageSalary) {
		this.packageSalary = packageSalary;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String jobRole;
    private String location;
    private double packageSalary;
}



