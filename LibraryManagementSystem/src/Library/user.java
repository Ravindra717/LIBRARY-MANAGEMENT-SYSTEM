package Library;

import java.util.Arrays;

public abstract class user {
	protected String name;
	protected String email;
	protected String phoneNumber;
	protected IOOperation[] operations;
	
	public user() {
		
	}
	public user(String name) {
		this.name=name;
	}

	public user(String name, String email, String phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public String toString() {
		return "user [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber+"]";
	}
	abstract public void menu(Database database,user user ) ;

}
