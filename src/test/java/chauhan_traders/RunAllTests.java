package chauhan_traders;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DatabaseExecution.class, DatabaseDMLTest.class ,TestValidationMethods.class })
public class RunAllTests {

}
