package org.example.entity;

import java.util.List;

/**
 * Represents a customer dto.
 */
public class Customer {

	private Integer id;
	private String firstName;
	private String lastName;
	private int age;
	private Double spendingLimit;
	private String mobileNumber;
	private List<Address> address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getSpendingLimit() {
		return spendingLimit;
	}

	public void setSpendingLimit(Double spendingLimit) {
		this.spendingLimit = spendingLimit;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
}
