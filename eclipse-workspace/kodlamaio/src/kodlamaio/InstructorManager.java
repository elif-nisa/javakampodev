package kodlamaio;

public class InstructorManager extends UserManager{
	
	public void addNewCourse(String name) {
		System.out.println(name +" kursu eklendi");
	}
	
	public void deleteCourse(String name) {
		System.out.println(name + " kurs silindi");
	}
	
	public void addHomework() {
		System.out.println("odev eklendi");
	}
	
	public void addConsideration() {
		System.out.println("degerlendirme eklendi");
	}

}
