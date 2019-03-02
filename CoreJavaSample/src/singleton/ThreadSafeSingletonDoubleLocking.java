package singleton;

/*
 * ThreadSafeSingleton- Above implementation works fine and provides thread-safety but it reduces the performance 
 * because of the cost associated with the synchronized method, although we need it only for the first few threads
 *  who might create the separate instances (Read: Java Synchronization). To avoid this extra overhead every time,
double checked locking principle is used. In this approach, the synchronized block is used inside the if condition 
with an additional check to ensure that only one instance of a singleton class is created.

Below code snippet provides the double-checked locking implementation.
*/
public class ThreadSafeSingletonDoubleLocking {

	// Private constructor to restrict instantiation of the class from other
	// classes.
	private ThreadSafeSingletonDoubleLocking() {

	}

	// Private static variable of the same class that is the only instance of the
	// class.
	private static ThreadSafeSingletonDoubleLocking safeSingleton;

	/*
	 * The easier way to create a thread-safe singleton class is to make the global
	 * access method synchronized, so that only one thread can execute this method
	 * at a time. General implementation of this approach is like the below class.
	 * 
	 */
	public static ThreadSafeSingletonDoubleLocking getSafeSingleton() {

		if (safeSingleton == null) {

			synchronized (ThreadSafeSingletonDoubleLocking.class) {
				safeSingleton = new ThreadSafeSingletonDoubleLocking();
			}
		}
		return safeSingleton;
	}

	public static void main(String[] args) {

		ThreadSafeSingletonDoubleLocking threadSafeSingleton1 = ThreadSafeSingletonDoubleLocking.getSafeSingleton();
		ThreadSafeSingletonDoubleLocking threadSafeSingleton2 = ThreadSafeSingletonDoubleLocking.getSafeSingleton();

		System.out.println(threadSafeSingleton1.hashCode());
		System.out.println(threadSafeSingleton2.hashCode());

	}

	/*
	 * Prior to Java 5, java memory model had a lot of issues and the above
	 * approaches used to fail in certain scenarios where too many threads try to
	 * get the instance of the Singleton class simultaneously. So Bill Pugh came up
	 * with a different approach to create the Singleton class using an inner static
	 * helper class. The Bill Pugh Singleton implementation goes like this;
	 */

}
