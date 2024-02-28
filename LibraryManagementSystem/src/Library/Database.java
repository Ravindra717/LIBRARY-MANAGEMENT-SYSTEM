package Library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Database {
	private ArrayList<user> users=new ArrayList<user>();
	private ArrayList<String> userName=new ArrayList<String>();
	private ArrayList<Book> books=new ArrayList<Book>();
	private ArrayList<String> booknames=new ArrayList<String>();
	
	private File Usersfile=new File(main.class.getClassLoader().getResource("users").getFile());
	private File bookfile=new File(main.class.getClassLoader().getResource("Books").getFile());
	
    public Database() {
    	if(!Usersfile.exists()) {
    		Usersfile.mkdir();
    	}
    	if(!bookfile.exists()) {
    		bookfile.mkdir();
    	}
    }
	public void AddUser(user s) {
		users.add(s);
		userName.add(s.getName());
	}
	
	public int login(String phoneNumber,String email) {
		int n=-1;
		for(user s:users) {
			if(s.getPhoneNumber().matches(phoneNumber)&& s.getEmail().matches(email)) {
				n=users.indexOf(s);
				break;
			}
		}
		return n;
	}
	
	public user getUser(int n) {
		return users.get(n);
	}
	
	public void AddBook(Book book) {
		books.add(book);
		booknames.add(book.getName());
	}
	
	public void getUsers() {
		String text1="";
		try {
			BufferedReader br1=new BufferedReader(new FileReader(Usersfile));
		}
		catch (Exception e) {
			System.err.println(e.toString());
		}
	}
	
	private void saveUsers() {
		String text1="";
		for(user user:users) {
//			text1=text1.Users.toString()+"<NewUser/>\n";
		}try {
			PrintWriter pw=new PrintWriter(Usersfile);
			pw.print(text1);;
			pw.close();
		}catch (Exception e) {
			System.err.println(e.toString());
		}
	}
}
