package DesignPatterns.Singleton;

public class ConnectionDriver {

public static void main(String[] args) {
		
		Connection c1 = Connection.getConnection();
		Connection c2 = Connection.getConnection();

		System.out.println(c1 + "     " + c2);
	}
}
