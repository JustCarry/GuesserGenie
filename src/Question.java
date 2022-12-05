public class Question {

	private String content;
	private String target;

	public final static int ANSWER_YES = 1;
	public final static int ANSWER_NO = 2;
	public final static int ANSWER_UNKNOWN = 3;
	
	public Question(String content, String target) {
		super();
		this.content = content;
		this.target = target;
	}
	
	// Example of a question: new Question( "Is the student from a male gender?", "gender=1" )
	// User answers with Yes, Which means that the question is true and 
	// we should look for student that has a gender variable set to one
	public boolean translateTarget(Student student, int answer) {
		String[] targetedVariables = this.target.split("=");
		if( answer == Question.ANSWER_YES ) {			
			if( student.matchInformation(targetedVariables[0], targetedVariables[1])) {
				return true;
			} else {
				return false;
			}
		} else if ( answer == Question.ANSWER_NO ) {
			if( !student.matchInformation(targetedVariables[0], targetedVariables[1])) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	public String getContent() {
		return this.content;
	}


}
