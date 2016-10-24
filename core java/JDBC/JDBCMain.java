import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMain {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","lalwani");
		Statement stmt=con.createStatement();
		
		int updates=stmt.executeUpdate("update dept set name='research' where id=3");
		System.out.println("number of update"+updates);
		

		int deletes=stmt.executeUpdate("delete from dept where id=6");
		System.out.println("number of update"+deletes);
		
		ResultSet rs=stmt.executeQuery("select * from dept");
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+"-"+rs.getString("name"));
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
}
