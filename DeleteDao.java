import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDao {
	private String dbUrl="jdbc:mysql://localhost:3306/vaccines";
	private String dbUsername="root";
	private String dbPass="ivana12345";
	private String dbDriver="com.mysql.jdbc.Driver";


	//method for driver
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}


	//method to get a connection
	public Connection getConnection() {

		Connection con=null;
	    try {
			con=DriverManager.getConnection(dbUrl,dbUsername,dbPass);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;	
	}



	public String delete(Member member) {
		
		loadDriver(dbDriver);
		Connection con=getConnection();
		//to delete a data
		String sql="delete from vaccines.patients where idNum=?";
		String res = "Your Booking is successfully canceled";
		PreparedStatement state;
		String len=member.getIdNum();
		int y=len.length();
		
			try {
		state =con.prepareStatement(sql);
		state.setString(1, member.getIdNum());
		
		
		if(y == 0) {
			res="Enter your ID number!";
		}
		
		
		state.executeUpdate();
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				res="Your Booking is not successfully canceled";
			}
		return res;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
