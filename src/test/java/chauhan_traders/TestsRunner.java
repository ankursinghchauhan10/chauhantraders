package chauhan_traders;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestsRunner {
	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(RunAllTests.class);
		
		//Prints the current results status (Pass/Fail)
		System.out.println("Result Status "+rs.wasSuccessful());
		
		
		//Prints all cause of failures
		for ( Failure f : rs.getFailures()){
			System.out.println(f.toString());
		}
	}
}
