package singleton;

/*Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
Here is the sample code for creating Singleton class with this approach.*/

public class LazyInitializedSingleton {

    //Private constructor to restrict instantiation of the class from other classes.
	private LazyInitializedSingleton() {
		
	}

    // Private static  variable of the same class that is the only instance of the class.
	private static LazyInitializedSingleton  initializedSingleton ;

	
	public static LazyInitializedSingleton getInstance() {
		if (initializedSingleton==null) {
			initializedSingleton = new LazyInitializedSingleton();
		}
		return initializedSingleton;
	}

/*	
	
	The above implementation works fine in case of the single-threaded environment 
	but when it comes to multithreaded systems, it can cause issues
	if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern
	and both threads will get the different instances of the singleton class. 
	In next section, we will see different ways to create a thread-safe singleton class.
	*/
	
	public static void main(String[] args) {
		
		LazyInitializedSingleton initializedSingleton1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton initializedSingleton2 = LazyInitializedSingleton.getInstance();
		
		System.out.println(initializedSingleton1.hashCode());
		System.out.println(initializedSingleton2.hashCode());
	}
}
