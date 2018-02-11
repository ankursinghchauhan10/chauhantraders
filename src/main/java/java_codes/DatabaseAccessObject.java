package java_codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseAccessObject {

    
	/**
	 * 
	 * @return Connection Object
	 * @throws Exception
	 */	
    public static Connection toConnect() throws Exception{
    
        Connection con=null;
            
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://IPAddress:3306/chauhantraders", "username", "password");
                return con;
            }
        

    
    
    /**
     * 
     * @param query SQL query to fetch data from table
     * @param st Statement interface reference
     * @return returns ResultSet of that query
     * @throws Exception
     */
    public static ResultSet toSelect(String query,Statement st)throws Exception{
        
        ResultSet rs=st.executeQuery(query);
        return rs;
        
    }
    
    /**
     * 
     * @param query SQL query to fetch data from table
     * @param st Statement interface reference
     * @return returns either (1) the row count, how much rows are affected by query or (2) 0 for SQL statements that return nothing i.e. DDL 
     * @throws Exception
     */
    public static int toInsertUpdateDelete(String query,Statement st)throws Exception{
        
        int i=st.executeUpdate(query);
        return i;
        
    }
}