package singleton;

/*
 * Prior to Java 5, java memory model had a lot of issues and the above
 * approaches used to fail in certain scenarios where too many threads try to
 * get the instance of the Singleton class simultaneously. So Bill Pugh came up
 * with a different approach to create the Singleton class using an inner static
 * helper class. The Bill Pugh Singleton implementation goes like this;
 */
public class BillPughInnerStaticHelperClass {

	private BillPughInnerStaticHelperClass()
	{
		
	}
	
	private static class SingletonHelper
	{
		private static final  BillPughInnerStaticHelperClass INSTANCE = new  BillPughInnerStaticHelperClass();
	}
	
	/*
	 * Notice the private inner static class that contains the instance of the
	 * singleton class. When the BillPughInnerStaticHelperClass class is loaded, SingletonHelper class is
	 * not loaded into memory and only when someone calls the getInstance method,
	 * this class gets loaded and creates the Singleton class instance.
	 */
	
	/*
	 * This is the most widely used approach for Singleton class as it doesn’t
	 * require synchronization. I am using this approach in many of my projects and
	 * it’s easy to understand and implement also.
	 */
	public BillPughInnerStaticHelperClass getInstance()
	{
		return SingletonHelper.INSTANCE;
		
	}
}



