package Recursion;
/*Recursion is the process where a method calls
 *  itself repeatedly is called Recursion
 * */
public class App {
		static void display() {
			display();
		}

		public static void main(String[] args) {
			System.out.println("Recursion");
			display();
	}
}
/**it will print " Recursion " infinite time till get the 
 *error of StackOverzflowError
 */