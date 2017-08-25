package com.nani.javastandalone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * Student student = new Student(); student.setAge("20");
		 * student.setSname("seetharam"); student.setStudent(student); //
		 * List<Student> students = new ArrayList<>(2); students.add(student);
		 * student.setStudents(students);
		 * System.out.println(student.getStudent().getStudents().get(0).getSname
		 * ());
		 */
		HashMap<Integer, Integer> intmap = new HashMap<Integer, Integer>();
		intmap.put(1, 10);
		intmap.put(2, 20);
		intmap.put(3, 30);
		System.out.println(intmap.get(1));
		System.out.println(intmap.get(3));
		intmap.remove(3);
		System.out.println(intmap);
	}

}
