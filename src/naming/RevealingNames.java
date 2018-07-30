package naming;

import java.util.ArrayList;
import java.util.List;

public class RevealingNames {
	
	private List <String []> studentNames = new ArrayList<String []>();
	
	
	public List<String []> getStudentsNamedAda(){
		
		List <String []> studentsNamedAna = new ArrayList<String []>();
		
		for (String [] student : studentNames) { 
			if (student[0] == "Ada")
				studentsNamedAna.add(student);
		}
		
		return studentsNamedAna; 
	}
	
	/*
	 * Re-factoring. 
	 * In order to avoid confusion with the naming. We create a class
	 * that encapsulates the String [] and create a method to check the
	 * condition "this student is called Ada". 
	 * */
	class Student {
		String name;
		String surname;
		double [] assignmentsGrades;
		double assistancePercentage;
		double finalGrade;
		
		public boolean isAda() {
			if(name == "Ada") {
				return true;
			}
			return false;
		}
	}
	
	/*Changed the List<String[]> to a List of Student*/
	private List <Student> getStudentsNamedAnaRefactored = new ArrayList<Student>();
	
	public List<Student> getNamesRefactored(){
		
		List <Student> studentsNamedAna = new ArrayList<Student>();
		
		for (Student student : getStudentsNamedAnaRefactored) { 
			if (student.isAda()) // <---- Clearer
				studentsNamedAna.add(student);
			}		
		return studentsNamedAna; 
		}
}
