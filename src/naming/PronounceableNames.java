package naming;

import java.util.ArrayList;
import java.util.List;

import naming.RevealingNames.Student;

public class PronounceableNames {
	private List <Student> studentsList = new ArrayList<Student>();
	
	/*
	 * Use pronounceable names
	 * */
	public void astl(Student studentToRegister) {
		studentsList.add(studentToRegister);
	}
	
	//Better re-factored
	public void addStudentToList(Student studentToRegister) {
		studentsList.add(studentToRegister);
	}
	
}
