package grades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Student {
	private String name;
	private ArrayList<Integer> grades = new ArrayList<>();
	private HashMap<String, String> attendance = new HashMap<>();

	public Student(String name) {
		this.name = name;
	}

	// returns the student's name
	public String getName() {
		return this.name;
	}

	// adds the given grade to the grades property
	public void addGrade(int grade) {
		this.grades.add(grade);
	}

	public void addGrade(int grade1, int grade2, int grade3) {
		this.grades.add(grade1);
		this.grades.add(grade2);
		this.grades.add(grade3);
	}

	// adds the given attendance to the attendance property
	public void recordAttendance(int year, int month, int day, String attendance) {
		if (attendance.equalsIgnoreCase("P") || attendance.equalsIgnoreCase("A")) {
			String date = year + "-" + month + "-" + day;
			this.attendance.put(date, attendance);
		} else {
			System.out.println("Invalid attendance code. Please enter P or A.");
		}
	}

	//instance method to calculate a student's attendance percentage -- (Total Days - Absences) / Total Days.
	public double getAttendancePercentage() {
		double totalDays = this.attendance.size();
		double absences = 0;
		for (String date : this.attendance.keySet()) {
			if (this.attendance.get(date).equalsIgnoreCase("A")) {
				absences++;
			}
		}
		return (totalDays - absences) / totalDays;
	}
	//method to find the specific days a student was absent
	public ArrayList<String> getAbsences() {
		ArrayList<String> absences = new ArrayList<>();
		for (String date : this.attendance.keySet()) {
			if (this.attendance.get(date).equalsIgnoreCase("A")) {
				absences.add(date);
			}
		}
		absences.sort(Comparator.comparing(String::toString));
		return absences;
	}

	// returns the average of the students grades
	public double getGradeAverage() {
		double sum = 0;
		for (int grade : this.grades) {
			sum += grade;
		}
		return sum / this.grades.size();
	}

	// Returns all the grades of the student
	public ArrayList<Integer> getGrades() {
		return this.grades;
	}

	public void addGrades (ArrayList<Integer> grades) {
		this.grades.addAll(grades);
	}


}
