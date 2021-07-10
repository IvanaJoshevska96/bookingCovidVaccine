import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

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



public String insert(Member member) {
	
	loadDriver(dbDriver);
	Connection con=getConnection();
	//to insert a data
	String sql="insert into vaccines.patients (firstname,lastname,idNum,age,address,municipality,mobile,email) values (?,?,?,?,?,?,?,?)";
	String res = "Your Booking is successfull";
	PreparedStatement state;
	
		try {
			state =con.prepareStatement(sql);
		state.setString(1,member.getFirstname());
		state.setString(2,member.getLastname());
		state.setString(3, member.getIdNum());
		state.setString(4, member.getAge());
		state.setString(5, member.getAddress());
		state.setString(6, member.getMunicipality());
		state.setString(7, member.getMobile());
		state.setString(8, member.getEmail());
		state.executeUpdate(); 	
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res="Your Booking is not successfully";
		}
	
	
	
	
	return res;
}	
	
}
