package concept;

public class User {
	
	//Fields
	private int userID;
	private String email;
	private String name;
	private String password;

	//Constructor
	public User(int userID, String email, String name, String password) {
		super();
		this.userID = userID;
		this.email = email;
		this.name = name;
		this.password = password;
	}



	//Getter and Setters
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

	

}
