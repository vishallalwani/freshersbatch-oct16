import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrepareJDBCMain {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","lalwani");
		
		
		PreparedStatement stmt=con.prepareStatement("insert into dept values(?,?)");  
		stmt.setInt(1,6); 
		stmt.setString(2,"training");  
		int inst=stmt.executeUpdate();  
		System.out.println(inst+" records inserted");  
	
		
		PreparedStatement stmt1=con.prepareStatement("update dept set name=? where id=?");  
		stmt1.setString(1,"researchNdev");  
		stmt1.setInt(2,3); 
		int updates=stmt1.executeUpdate();  
		System.out.println(updates+" records updated");  
		
		
		PreparedStatement stmt2=con.prepareStatement("delete from dept where id=?"); 
		stmt2.setInt(1,3); 
		int del=stmt2.executeUpdate();  
		System.out.println(del+" record deleted");  

		
		PreparedStatement stmt3=con.prepareStatement("select * from dept"); 
		ResultSet rs=stmt3.executeQuery("select * from dept");
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+"-"+rs.getString("name"));
		}
		
		rs.close();
		stmt3.close();
		con.close();
	}
}
