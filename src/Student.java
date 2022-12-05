import java.lang.reflect.Method;

public class Student {
	private String name;
	private int gender;
	private int age;
	private boolean recentHighschooler;
	private String hairColor;
	private boolean children;
	private int maritalStatus; // Single, Married, Divorced, Dating
	private int height;
	private int race;
	private boolean hasGlasses;
	private boolean hasHearingAids;
	private int currentEducation;
	private String currentJob;
	private String currentCar;
	private String currentPet;
	
	
	public Student(String name, int gender, int age, boolean recentHighschooler, String hairColor, boolean children,
			int maritalStatus, int height, int race, boolean hasGlasses, boolean hasHearingAids, int currentEducation,
			String currentJob, String currentCar, String currentPet) {

		this.name = name;
		this.gender = gender;
		this.age = age;
		this.recentHighschooler = recentHighschooler;
		this.hairColor = hairColor;
		this.children = children;
		this.maritalStatus = maritalStatus;
		this.height = height;
		this.race = race;
		this.hasGlasses = hasGlasses;
		this.hasHearingAids = hasHearingAids;
		this.currentEducation = currentEducation;
		this.currentJob = currentJob;
		this.currentCar = currentCar;
		this.currentPet = currentPet;
				
	}

	
	// Reference: https://stackoverflow.com/questions/62886836/how-to-call-a-variable-of-a-class-using-a-string-in-java
	public boolean matchInformation(String information, String matchWith) {
		try {
			Method method = this.getClass().getMethod(information);
			try {
				Object result = method.invoke(this);
				if( result.toString().equals(matchWith)) {
					return true;
				}
			} catch (Exception ex) {
				return false;
			}
		} catch(Exception ex) {
			return false;
		}
		
		return false; // No Information Found;
	}
	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public boolean isRecentHighschooler() {
		return recentHighschooler;
	}

	public String getHairColor() {
		return hairColor;
	}

	public boolean hasChildren() {
		return children;
	}

	public int getMaritalStatus() {
		return maritalStatus;
	}

	public int getHeight() {
		return height;
	}

	public int getRace() {
		return race;
	}

	public boolean hasGlasses() {
		return hasGlasses;
	}

	public boolean hasHearingAids() {
		return hasHearingAids;
	}

	public int getCurrentEducation() {
		return currentEducation;
	}

	public String getCurrentJob() {
		return currentJob;
	}

	public String getCurrentCar() {
		return currentCar;
	}

	public String getCurrentPet() {
		return currentPet;
	}
	
	
	
}
