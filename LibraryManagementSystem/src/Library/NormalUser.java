package Library;

import java.util.Arrays;
import java.util.Scanner;

public class NormalUser extends user {
	public NormalUser(String name) {
		super(name);
		this.operations=new IOOperation[] {
				new ViewBooks(),
				new Search(),
				new PlaceOrder(),
				new BorrowBook(),
				new CalculateFine(),
				new ReturnBook(),
				new Exit()
		};
	}
	
	public NormalUser(String name,String email,String phoneNumber) {
		super(name, email, phoneNumber);
		this.operations=new IOOperation[] {
				new ViewBooks(),
				new Search(),
				new PlaceOrder(),
				new BorrowBook(),
				new CalculateFine(),
				new ReturnBook(),
				new Exit()
		};
	}
	
	@Override
	public void menu(Database database,user user) {
		System.out.println("1.View Books");
		System.out.println("2.Search");
		System.out.println("3.Place order");
		System.out.println("4.Borrow Book");
		System.out.println("5.calculate Fine");
		System.out.println("6.Return Book");
		System.out.println("7.Exit");
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		this.operations[n-1].oper(database, user);
		sc.close();
	}

	@Override
	public String toString() {
		return "NormalUser [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "Normal user"+ "]";
	}
	
}
