package com.swp.ci;

public class Student implements Comparable<Student> {
	private final String nachname;
	private final String vorname;
	private final String studiengang;
	private final int matNr;

	public Student(String nachname, String vorname, String studiengang, int matNr) {
		this.nachname = nachname;
		this.vorname = vorname;
		this.studiengang = studiengang;
		this.matNr = matNr;
	}

    @Override
	public String toString() {
		return "Name: " + nachname + ", " + vorname + " | Studiengang: " + studiengang + " | MatNr.: " + matNr;
	}
	@Override
	public int compareTo(Student o) {
		int ergebnis = nachname.compareTo(o.nachname);
		if (ergebnis != 0) {
			return ergebnis;
		}
		return vorname.compareTo(o.vorname);
	}
	
	public static void format(Student s) {
		System.out.printf("Name: %-9s, %-9s | Studiengang: %-5s | MatNr.: %-5d%n", s.nachname, s.vorname, s.studiengang, s.matNr);
	}
}