package Library;

public class ViewBooks implements IOOperation{

	@Override
	public void oper(Database database,user user ) {
		System.out.println("View Books");
	}
}
