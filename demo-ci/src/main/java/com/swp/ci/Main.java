
package com.swp.ci;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Student[] studenten = new Student[6];
		studenten[0] = new Student("Baur", "Melanie", "INF", 42);
		studenten[1] = new Student("Speiser", "Sebastian", "INF", 43);
		studenten[2] = new Student("Rausch", "Alexander", "WINF", 44);
		studenten[3] = new Student("Pado", "Ulrike", "WINF", 41);
		studenten[4] = new Student("Knauth", "Stefan", "INF", 48);
		studenten[5] = new Student( 555, "Christof", "WINF", 47);
		
		for(Student s : studenten) {
			Student.format(s)
		}
		System.out.println();

		System.out.println("Sortiert nach Nachnamen:");
		Arrays.sort(studenten);
		
		for(Student s : studenten) {
			Student.format(s);
		}
	}
}

