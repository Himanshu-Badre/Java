package AccessModifiers;

// protected access modifier is accessible outside the package only when there
//is a parent child relationship.
// and we must call it with child object
public class Dog {
	protected void sleep() {
		System.out.println("Dog Is Sleeping");
	}
}
