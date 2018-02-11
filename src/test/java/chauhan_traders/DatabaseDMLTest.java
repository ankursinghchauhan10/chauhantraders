package chauhan_traders;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.Statement;

import java_codes.DatabaseAccessObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DatabaseDMLTest {

	@Test
	public void test() {
		System.out.println("Test 2");
		
		try{
            Connection con=DatabaseAccessObject.toConnect();
            Statement st=con.createStatement();
            String qry="insert into testimonials(name,mobile,email,msg,status,date) values('name','1234567890','a@gmail.com','msg',0,ADDTIME(now(),'09:30:00'))";
            int i=DatabaseAccessObject.toInsertUpdateDelete(qry, st);
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
