import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		initalizeStudents();
		
		// Demo
//		Question genderQuestion = new Question("Is the student a female gender?", "getGender=2");
//		Scanner genie = new Scanner(System.in);
//		int answer = promptAnswerReadLine(genie, genderQuestion.getContent());
//		
//		System.out.println(answer);
//		System.out.println(genderQuestion.translateTarget(mohammedAlhamed, answer));
	}
	 
	
	public static void initalizeStudents() {
		
		Student mohammedAlhamed = new Student("Mohammed Al-hamed", 1, 0, false, null, false, 0, 0, 0, false, false, 0, null, null, null);
		
		
		studentList.add(mohammedAlhamed);
		
	}
	
	/***
	 * Allows the user to have only one answer per question (Yes, No, Don't know)
	 * @param String prompt the string line to print to the user
	 * @return int the answer of the user
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
	
	// Refernce: https://stackoverflow.com/questions/10530353/convert-string-array-to-arraylist; https://www.geeksforgeeks.org/arraylist-array-conversion-java-toarray-methods/;

	/***
	 * Clears out all the students don't correspond with the question and its answer. 
	 * @param Student[] current possible students
	 * @param Question the current question to match the student list with
	 * @param int the answer that the user provided corresponding to the question being. 
	 * @return Student[] new list with only possible student left.
	 */
	public static ArrayList<Student> clearAllImpossibleStudents(ArrayList<Student> possibleStudents, Question currentQuestion, int currentAnswer) {
		
		ArrayList<Student> possibleStudentsLeft = new ArrayList<Student>(possibleStudents);
		for( Student possibleStudent : possibleStudents ) {

			if(!currentQuestion.translateTarget(possibleStudent, currentAnswer)) {
				
				possibleStudentsLeft.remove(possibleStudent);
				
			}
			
		}

		return possibleStudentsLeft;
	}
	
}
