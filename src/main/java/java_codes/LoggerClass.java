package java_codes;

import java.util.logging.Logger;
public class LoggerClass {
	public static Logger getLocalLogger(String classname) {
		return Logger.getLogger(classname);
	}
}
