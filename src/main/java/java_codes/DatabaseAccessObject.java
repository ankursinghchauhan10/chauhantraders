package java_codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseAccessObject {

    
    
    public static Connection toConnect() throws Exception{
    
        Connection con=null;
            
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://IPAddress:3306/chauhantraders", "username", "password");
                return con;
            }
        

    
    
    /**
     * 
     * @String query
     * @return
     * @throws Exception 
     */
    public static ResultSet toSelect(String query,Statement st)throws Exception{
        
        ResultSet rs=st.executeQuery(query);
        return rs;
        
    }
    
    /**
     * 
     * @param query
     * @return
     * @throws Exception 
     */
    public static int toInsertUpdateDelete(String query,Statement st)throws Exception{
        
        int i=st.executeUpdate(query);
        return i;
        
    }
}
