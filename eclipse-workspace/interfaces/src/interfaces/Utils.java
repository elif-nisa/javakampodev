package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers, String massage) {
		for(Logger logger : loggers) {
			logger.log(massage);
		}
	}

}
