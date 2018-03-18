package chauhan_traders;

import java.util.logging.Logger;

import java_codes.LoggerClass;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestsRunner {
	
	Logger log = LoggerClass.getLocalLogger(this);
	public static void main(String[] args) {
		TestsRunner ob = new TestsRunner();
		Result rs = JUnitCore.runClasses(RunAllTests.class);

		// Prints the current results status (Pass/Fail)
		ob.log.info("Result Status " + rs.wasSuccessful());

		// Prints all cause of failures
		for (Failure f : rs.getFailures()) {
			ob.log.severe(f.toString());
		}
	}
}
