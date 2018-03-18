package java_codes;

import java.util.logging.Logger;

public class LoggerClass {

	public static Logger getLocalLogger(Object classname) {

		return Logger.getLogger(classname.getClass().getName());
	}
}
