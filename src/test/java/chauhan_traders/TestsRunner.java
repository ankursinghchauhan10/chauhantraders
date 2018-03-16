package chauhan_traders;

import java.util.logging.Logger;

import java_codes.LoggerClass;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestsRunner {
	public static void main(String[] args) {
		Logger log = LoggerClass.getLocalLogger(TestsRunner.class.getName());
		Result rs = JUnitCore.runClasses(RunAllTests.class);

		// Prints the current results status (Pass/Fail)
		log.info("Result Status " + rs.wasSuccessful());

		// Prints all cause of failures
		for (Failure f : rs.getFailures()) {
			log.severe(f.toString());
		}
	}
}
