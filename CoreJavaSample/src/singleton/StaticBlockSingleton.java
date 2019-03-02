package singleton;


/*Static block initialization implementation is similar to eager initialization, 
except that instance of class is created in the static block that provides option for exception handling.*/

/*Both eager initialization and static block initialization creates the instance even before it’s being used and
that is not the best practice to use. So in further sections, we will learn how to create a Singleton class that supports lazy initialization.
*/

public class StaticBlockSingleton {

    //Private constructor to restrict instantiation of the class from other classes.
	private StaticBlockSingleton() {

	}

	 // Private static  variable of the same class that is the only instance of the class.
	private  static StaticBlockSingleton instance;

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	
	public static void main(String[] args) {
		
		StaticBlockSingleton blockSingleton = StaticBlockSingleton.instance;
		System.out.println(blockSingleton.hashCode());
		StaticBlockSingleton blockSingleton1 = StaticBlockSingleton.instance;
		System.out.println(blockSingleton1.hashCode());
	}
}