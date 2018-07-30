package naming;

import java.util.ArrayList;
import java.util.List;

import naming.RevealingNames.Student;

public class SearchableNames {
	private List <Student> studentsList = new ArrayList<Student>();
	
	public double getFinalGrade() {
		int finalGrade = 0;
		for (Student student : studentsList) {			
			for (double grade : student.assignmentsGrades) {
				if (grade < 40 && student.assistancePercentage > 50) {
					finalGrade += grade + 0.5;
				}
				else {
					finalGrade += grade;
				}
			}	
		}
		
		return finalGrade;
	}
	
	/*REFACTORED*/
	
	public double getFinalGradeRefactored() {
		double finalGrade = 0;
		double FailedGrade = 40;
		double minAssistance = 50;
		double extraPoints = 0.5;
		
		for (Student student : studentsList) {			
			for (double grade : student.assignmentsGrades) {
				if (grade < FailedGrade && student.assistancePercentage > minAssistance) {
					finalGrade += grade + extraPoints;
				}
				else {
					finalGrade += grade;
				}
			}	
		}
		return finalGrade;
	}
	
	/*Even better
	 */
		
	private boolean studentCanRecieveExtraPoints(double grade, double assistance) {
		double FailedGrade = 40;
		double minAssistance = 50;
		return grade < FailedGrade && assistance > minAssistance;
	}
	
	public double studentFinalGrade(Student student) {
		double finalGrade = 0;
		double extraPoints = 0.5;		
		for (double grade : student.assignmentsGrades) {
			if(studentCanRecieveExtraPoints(grade, student.assistancePercentage))
				finalGrade += grade + extraPoints;
			else {
				finalGrade += grade;
			}
		}		
		return finalGrade;
	}
	
	public void finalgrading() { //<--- longer but readable and clearer
		for (Student student : studentsList) {
			student.finalGrade =  studentFinalGrade(student);
		}
	}
	
}
