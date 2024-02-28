package Library;

import java.util.Scanner;

public class main {
	static Scanner sc;
	static Database database;
	public static void main(String[] args) {
		
		database=new Database() ;
		System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM!!");
		int num;
//		do {
			System.out.println("0.Exit\n"+"1.Login\n2.New user");

				sc=new Scanner(System.in);
				num=sc.nextInt();
				
				switch(num) {
				  case 1:login();
				  case 2:newUser();
				}
//		}while(num!=0);
		
	}

	private static void login() {
		System.out.println("enter phone number:");
		String phoneNumber=sc.next();
		System.out.println("enter email:");
		String email=sc.next();
		int n=database.login(phoneNumber, email);
		if(n!=-1) {
			user user=database.getUser(n);
			user.menu(database,user );
		}else {
			System.out.println("user doesn't exit!");;
		}
		
	}
	private static void newUser() {
		System.out.println("enter name:");
		String name=sc.next();
		System.out.println("enter phone number:");
		String phoneNumber=sc.next();
		System.out.println("enter email:");
		String email=sc.next();
		
		System.out.println("1.Admin\n2.Normal user");
		int n2=sc.nextInt();
		user user;
		if(n2==1) {
			user =new Admin(name,email,phoneNumber);
		}else {
			user=new NormalUser(name,email,phoneNumber);
		}
		user.menu(database,user);
	}
}
