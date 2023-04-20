package grades;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("Joe");

		student1.addGrade(95);
		student1.addGrade(85);

		System.out.println(student1.getGradeAverage());
	}
}
