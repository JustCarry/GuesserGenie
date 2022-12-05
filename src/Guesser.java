import java.util.ArrayList;
import java.util.Scanner;

/***
 * 
 * Note: Here is where the user going to start.
 * 
 * @author Mohammed, Daemien, Stacy
 */


public class Guesser {

	public static ArrayList<Student> studentList = new ArrayList<Student>();
	
	public static void main(String[] args) {
//		initalizeStudents();
		
		
		Student mohammedAlhamed = new Student("Mohammed Al-hamed", 1, 0, false, null, false, 0, 0, 0, false, false, 0, null, null, null);
		Question genderQuestion = new Question("Is the student a female gender?", "getGender=2");
		Scanner genie = new Scanner(System.in);
		int answer = promptAnswerReadLine(genie, genderQuestion.getContent());
		
		System.out.println(answer);
		System.out.println(genderQuestion.translateTarget(mohammedAlhamed, answer));
	}
	 
	
	public static void initalizeStudents() {
		
		// Demo
		
	}
	
	/**
	 * Allows the user to have only one answer per question 
	 * @param Scanner s the scanner that inteded to prompt the user.
	 * @param String prompt the string line to print to the user
	 * @param int max the maximum number the user can input (from 1 to the max)
	 * @return int the input of the user
	 */
	public static int promptAnswerReadLine(Scanner s, String prompt) {
		while(true) {
			System.out.print(prompt);
			System.out.println(" You can either answer yes, no or don't know");
			String temp = s.nextLine();
			int value = 0;
			if( temp.toLowerCase().equals("yes") || temp.toLowerCase().equals("y") ) {
				value = Question.ANSWER_YES;
			} else if( temp.toLowerCase().equals("no") || temp.toLowerCase().equals("n")) {
				value = Question.ANSWER_NO; 
			} else if( temp.toLowerCase().equals("don't know") || temp.toLowerCase().equals("dont know") || temp.toLowerCase().equals("dk")  || temp.toLowerCase().equals("unknown") ) {
				value = Question.ANSWER_UNKNOWN; 
			}
			// If everything good then return the value other wise print and repeat the process.
			if( value != 0 ) {
				return value;
			} else {
				System.out.println("That was not a valid answer! Please try again.");
			}
		}
	}

	public static Student[] clearAllImpossibleStudents(Student[] possibleStudentsLeft, Question currentQuestion, int currentAnswer) {
		
		return new Student[] {};
	}
	
}
