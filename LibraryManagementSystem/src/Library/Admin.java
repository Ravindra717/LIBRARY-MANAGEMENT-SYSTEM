package Library;

import java.util.Arrays;
import java.util.Scanner;

public class Admin extends user {
	
	public Admin(String name) {
		super(name);
		this.operations=new IOOperation[] {
				new ViewBooks(),
				new AddBook(),
				new DeleteBook(),
				new Search(),
				new DeleteAllData(),
				new ViewOrders(),
				new Exit()
		};
		
	}
	
	public Admin(String name,String email,String phoneNumber) {
		super(name, email, phoneNumber);
		this.operations=new IOOperation[] {
				new ViewBooks(),
				new AddBook(),
				new DeleteBook(),
				new Search(),
				new DeleteAllData(),
				new ViewOrders(),
				new Exit()
		};
	}
	
	@Override
	public void menu(Database database,user user ) {
		System.out.println("1.view books");
		System.out.println("2.Add books");
		System.out.println("3.Delete books");
		System.out.println("4.Search");
		System.out.println("5.Delete all data");
		System.out.println("6.View orders");
		System.out.println("5.Exit");
		System.out.println();
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		this.operations[n-1].oper(database, user);
		s.close();
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber +"Admin"+"]";
	}
	
}
