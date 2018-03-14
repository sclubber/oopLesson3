package com.icloud.sclubber;

import java.util.Arrays;

public class Group {
	private Student[] studentsArray = new Student[10];

	public Group() {
		super();
	}

	public void addStudent(Student student) {
		try {
			for (int i = 0; i < studentsArray.length; i++) {
				if (studentsArray[i] == null) {
					studentsArray[i] = student;
					break;
				} else if (i == 9) {
					throw new MyException();
				}
			}
		} catch (MyException e) {
			System.out.println(e);
		}
	}

	public void delStudent(Student student) {
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] != null && studentsArray[i].equals(student)) {
				studentsArray[i] = null;
			}
		}
	}

	public String findStudent(String surname) {
		Student student = new Student();
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] != null && studentsArray[i].getSurname().equals(surname)) {
				student = studentsArray[i];
			}

		}

		return student.toString();
	}

	public Student[] getStudentsArray() {
		return studentsArray;
	}

	@Override
	public String toString() {
		Student temp;

		for (int i = 0; i < studentsArray.length; i++) {
			for (int j = i; j < studentsArray.length; j++) {
				try {
					if (studentsArray[i].getSurname().compareTo(studentsArray[j].getSurname()) > 0) {
						temp = studentsArray[i];
						studentsArray[i] = studentsArray[j];
						studentsArray[j] = temp;
					}
				} catch (NullPointerException e) {

				}
			}

		}
		String info = "";
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] != null) {
				info += "Group [" + studentsArray[i].toString() + "]" + "\n";
			}
		}
		return info;
	}

}
