package com.icloud.sclubber;

public class Student extends Human {
	private String specialization;
	private int level;

	public Student(String surname, String name, boolean sex, int age, String specialization, int level) {
		super(surname, name, sex, age);
		this.specialization = specialization;
		this.level = level;
	}

	public Student(String surname, String name, boolean sex, int age) {
		super(surname, name, sex, age);
	}

	public Student() {
	};

	@Override
	public void getInfo() {
		String sexPrint;
		if (isSex()) {
			sexPrint = "Male";
		} else {
			sexPrint = "Female";
		}
		System.out.println(getSurname() + " " + getName() + " " + sexPrint + " " + getAge() + " " + specialization
				+ " Level: " + level);
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		String sexPrint;
		if (isSex()) {
			sexPrint = "Male";
		} else {
			sexPrint = "Female";
		}
		return (getSurname() + " " + getName() + " " + sexPrint + " " + getAge() + " " + specialization + " Level: "
				+ level);
	}

}
