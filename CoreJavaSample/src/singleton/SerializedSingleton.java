package singleton;

import java.io.Serializable;


public class SerializedSingleton  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6240062397504498022L;


	private SerializedSingleton()
	{
		
	}
	
	private static class SingletonHelper
	{
		private static final  SerializedSingleton INSTANCE = new  SerializedSingleton();
	}
	
	
	public static SerializedSingleton getInstance()
	{
		return SingletonHelper.INSTANCE;
		
	}
	
	/*
	 * So it destroys the singleton pattern, to overcome this scenario all we need
	 * to do it provide the implementation of readResolve() method.
	 * 
	 */
	protected Object readResolve() {
	    return getInstance();
	}

}



