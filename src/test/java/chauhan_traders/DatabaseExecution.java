package chauhan_traders;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

import java_codes.DatabaseAccessObject;
import java_codes.LoggerClass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DatabaseExecution {
	Logger log = LoggerClass.getLocalLogger(DatabaseExecution.class.getName());

	@Test(timeout = 1000)
	public void fetchData() {

		log.info("Executing Test fetchData");
		try {
			Connection con = DatabaseAccessObject.toConnect();
			Statement st = con.createStatement();
			String qry = "select * from testimonials";
			ResultSet rs = DatabaseAccessObject.toSelect(qry, st);
			while (rs.next()) {
				// Prints name and mobile of the user
				log.info("Column 2 " + rs.getString(2) + " ,Column 3 "
						+ rs.getString(3));
			}
		} catch (Exception e) {
			// will execute only if there is some problem in query
			assertTrue(false);
			e.printStackTrace();
		}

		// will execute only if all above lines passed without any error
		assertTrue(true);
	}

	@Before
	public void befor() {

	}

	@After
	public void after() {

	}

}
