package singleton;

public class ThreadSafeSingleton {

	// Private constructor to restrict instantiation of the class from other
	// classes.
	private ThreadSafeSingleton() {

	}

	// Private static variable of the same class that is the only instance of the
	// class.
	private static ThreadSafeSingleton safeSingleton;

	
	/*
	 * The easier way to create a thread-safe singleton class is to make the global
	 * access method synchronized, so that only one thread can execute this method
	 * at a time. General implementation of this approach is like the below class.
	 * 
	 */
	public static synchronized ThreadSafeSingleton getSafeSingleton() {
		
		if (safeSingleton==null) {
			safeSingleton = new ThreadSafeSingleton();
		}
		return safeSingleton;
	}
	
	public static void main(String[] args) {
		
		ThreadSafeSingleton  threadSafeSingleton1 = ThreadSafeSingleton.getSafeSingleton();
		ThreadSafeSingleton  threadSafeSingleton2 = ThreadSafeSingleton.getSafeSingleton();
		
		System.out.println(threadSafeSingleton1.hashCode());
		System.out.println(threadSafeSingleton2.hashCode());
		
	}

}
