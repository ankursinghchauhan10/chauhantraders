package chauhan_traders;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java_codes.DatabaseAccessObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DatabaseExecution {

	@Test(timeout = 1000)
	public void test1() {

		System.out.println("Test 1");
		try{
            Connection con=DatabaseAccessObject.toConnect();
            Statement st=con.createStatement();
            String qry="select * from testimonials";
            ResultSet rs=DatabaseAccessObject.toSelect(qry, st);
         while(rs.next()){
        	 //Prints name of the user
        	 System.out.println(rs.getString(2));
         }
        }catch(Exception e){
        	//will execute only if there is some problem in query
        	assertTrue(false);
        	e.printStackTrace();
        }
		
		//will execute only if all above lines passed without any error
		assertTrue(true);
		
	}
	

	@Before
	public void befor(){
		System.out.println("before method");
	}
	
	@After
	public void after(){
		System.out.println("after method");
	}

}
