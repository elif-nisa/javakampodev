package kodlamaio;

public class Student extends User{
		String course;

		public Student(int id, String firstName, String lastName, String email, String password, String adress,
				String course) {
			super(id, firstName, lastName, email, password, adress);
			this.course = course;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

}
