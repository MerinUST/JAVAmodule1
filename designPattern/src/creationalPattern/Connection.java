package creationalPattern;

public class Connection {
	static Connection con;//instance required
	private Connection() {
		//constructor
		//only one objcet can be created
	}

	public static Connection getConnection() {
		if(con!=null) 
			return con; 
			else
				con=new Connection();
				return con;
				
//return the instance only once		
		//return new Connection();
	}
}
