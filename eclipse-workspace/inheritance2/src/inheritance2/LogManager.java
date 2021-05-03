package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("veritabaný loglandý");
		}
		else if(logType == 2) {
			System.out.println("dosya loglandý");
		} 
		else {
			System.out.println("email loglandý");
		} 
	}
}
