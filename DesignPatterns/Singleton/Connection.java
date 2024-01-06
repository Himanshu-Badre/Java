package DesignPatterns.Singleton;

public class Connection {


	private static Connection connection;
	
	private Connection() {
		System.out.println("Private Constructor");
	}
	
	public static Connection getConnection() {
		if(connection == null) {
			synchronized (Connection.class) {
				if(connection == null) {
					connection = new Connection();
				}
			}
		}
		return connection;
	}
}
