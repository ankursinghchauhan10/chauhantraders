package chauhan_traders;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Logger;

import java_codes.DatabaseAccessObject;
import java_codes.LoggerClass;
import java_codes.ValidationMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DatabaseDMLTest {

	Logger log = LoggerClass.getLocalLogger(DatabaseDMLTest.class.getName());

	/**
	 * Test case is to check that with all valid data test is getting PASS.
	 */
	@Test
	public void insertData() {
		log.info("Executing Test inserData");

		String name = "TestName";
		String mobile = "1234567890";
		String email = "test@gmail.com";
		String msg = "message";
		if (ValidationMethods.isAlphabet(name)
				&& ValidationMethods.isMobileNumber(mobile)
				&& ValidationMethods.emailValidator(email)) {
			try {
				Connection con = DatabaseAccessObject.toConnect();
				Statement st = con.createStatement();
				String qry = "insert into testimonials(name,mobile,email,msg,status,date) values('"
						+ name
						+ "','"
						+ mobile
						+ "','"
						+ email
						+ "','"
						+ msg
						+ "',0,now())";
				int i = DatabaseAccessObject.toInsertUpdateDelete(qry, st);
			} catch (Exception e) {
				// will execute only if there is some problem in query
				assertTrue(
						"Error While Executing DB Query : " + e.getMessage(),
						false);
				e.printStackTrace();
			}

		}
		// will execute only if all above lines passed without any error
		assertTrue(true);
	}

	/**
	 * Test case is to check that with some/all invalid data test is failing.
	 */
	@Test
	public void insertInvalidData() {
		log.info("Executing Test inserInvalidData");

		String name = "TestName";
		String mobile = "1234567890"; // invalid mobile number
		String email = "test@gmail.c"; // invalid email ID
		String msg = "message";

		if (ValidationMethods.isAlphabet(name)
				&& ValidationMethods.isMobileNumber(mobile)
				&& ValidationMethods.emailValidator(email)) {
			try {
				Connection con = DatabaseAccessObject.toConnect();
				Statement st = con.createStatement();
				String qry = "insert into testimonials(name,mobile,email,msg,status,date) values('"
						+ name
						+ "','"
						+ mobile
						+ "','"
						+ email
						+ "','"
						+ msg
						+ "',0,now())";
				int i = DatabaseAccessObject.toInsertUpdateDelete(qry, st);

				// will execute only if all above lines passed without any error
				assertTrue(true);
			} catch (Exception e) {
				// will execute only if there is some problem in query
				assertTrue(false);
				e.printStackTrace();
			}

		} else {
			assertTrue("Invalid Data Entry", false);
		}

	}

	@Before
	public void befor() {

	}

	@After
	public void after() {

	}
}
