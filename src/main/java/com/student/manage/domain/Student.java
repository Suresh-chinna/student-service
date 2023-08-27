package com.student.manage.domain;

public class Student {
	private int studentId;
	private String firstName;
	private String middletName;
	private String lastName;
	private String gender;
	private int age;

	public Student() {
		super();
	}

	public Student(int studentId, String firstName, String middletName, String lastName, String gender, int age) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.middletName = middletName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddletName() {
		return middletName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddletName(String middletName) {
		this.middletName = middletName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", middletName=" + middletName
				+ ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + "]";
	}

}
