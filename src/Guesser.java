import java.util.ArrayList;

/***
 * 
 * Note: Here is where the user going to start.
 * 
 * @author Mohammed, Daemien, Stacy
 */


public class Guesser {

	public static ArrayList<Student> studentList = new ArrayList<Student>();
	
	public static void main(String[] args) {
		initalizeStudents();
	}
	 
	
	public static void initalizeStudents() {
		
		// Demo
		Student mohammedAlhamed = new Student(null, 2, 0, false, null, false, 0, 0, 0, false, false, 0, null, null, null);
		Question genderQuestion = new Question("Is the student a male gender?", "getGender=1");
		
		System.out.println(genderQuestion.translateTarget(mohammedAlhamed, Question.ANSWER_NO));
		
		studentList.add(mohammedAlhamed);
	}
	
}
