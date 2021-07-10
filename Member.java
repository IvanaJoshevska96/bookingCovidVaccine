
public class Member {

//define the properties 
	private String firstname,lastname,idNum,age,address,email,mobile,municipality;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public Member(String firstname, String lastname, String idNum, String age, String address, String email,
			String mobile, String municipality) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.idNum = idNum;
		this.age = age;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.municipality = municipality;
	}

	//constructor for delete 
	public Member(String idNum) {
		super();
		this.idNum = idNum;
	}

	//default constructor
	public Member() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
