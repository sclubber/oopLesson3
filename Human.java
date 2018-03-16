package com.icloud.sclubber;

public class Human {
	private String surname;
	private String name;
	private boolean sex;
	private int age;

	public Human(String surname, String name, boolean sex, int age) {
		super();
		this.surname = surname;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Human() {
		super();
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		 if (sex!=other.sex)
			return false;
		if (age!=other.age)
			return false;
		return super.equals(obj);
	}

	public void getInfo() {
		String sexPrint;
		if (sex) {
			sexPrint = "Male";
		} else {
			sexPrint = "Female";
		}
		System.out.println(getSurname() + " " + getName() + " " + sexPrint + " " + getAge());
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return surname + " " + name + " " + sex + " " + age;
	}

}
