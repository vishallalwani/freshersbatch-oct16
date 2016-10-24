import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CopyMain {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.20.7.1:1521:xe","system","12345");
		
		Statement st = con.createStatement();
	    int rows = st.executeUpdate("INSERT INTO emp2 SELECT * FROM emp");
	    if (rows == 0) {
	      System.out.println("Don't add any row!");
	    } else {
	      System.out.println(rows + " row(s)affected.");
	      con.close();
		
	    }
	}
}
