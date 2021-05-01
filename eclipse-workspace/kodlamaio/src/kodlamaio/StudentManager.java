package kodlamaio;

public class StudentManager extends UserManager {
	public void addComment(String yorum) {
		System.out.println(yorum + " -- yorumu eklendi.");
	}
	public void joinCourse(String course) {
		System.out.println( course+ " kursuna basariyla kayit oldunuz");
	}
}
