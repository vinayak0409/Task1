package src;
import java.sql.*;

public class Connection1 
{

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from stud");
			while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			con.close();
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		

	}

}
