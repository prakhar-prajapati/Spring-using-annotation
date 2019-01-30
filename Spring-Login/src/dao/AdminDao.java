package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDao {

	public int loginCheck(String id,String pass)
	{ 
		int x=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe_db", "root", "root");
			PreparedStatement ps = con.prepareStatement("Select * from Adminlogin where name=? and password=?");
			ps.setString(1,id);
			ps.setString(2,pass);
		    ResultSet rs=ps.executeQuery();
	      if(rs.next())
	    	  x=1;
		    con.close();	
		
		}catch (Exception e) {
			System.out.println(e);
		}
		return x;
	}
	
	// insert emp data from admin panel
	
	public int inset(String name, String add, String salary)
	{			int y = 0;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe_db", "root", "root");
				 PreparedStatement ps = con.prepareStatement(
						"insert into empdata(name,address,salary) value(?,?,?)");
			    ps.setString(1,name);
				ps.setString(2, add);
				ps.setDouble(3, Double.parseDouble(salary));

				y = ps.executeUpdate();
				con.close();
			} catch (Exception w) {
				System.out.println(w);
			}
			return y;
		}

	
}
