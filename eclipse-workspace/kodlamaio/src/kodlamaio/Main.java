package kodlamaio;

public class Main {

	public static void main(String[] args) {
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addNewCourse("java");
		instructorManager.addConsideration();
		instructorManager.addHomework();
		instructorManager.deleteCourse("java");
		
		StudentManager studentManager= new StudentManager();
		studentManager.addComment("deneme yorumu");
		studentManager.joinCourse("java");
		
		UserManager userManager = new UserManager();
		userManager.add();
		userManager.delete();
		userManager.update();
		
	}

}
