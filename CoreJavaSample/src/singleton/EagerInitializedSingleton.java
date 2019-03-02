package singleton;

/*Java Singleton
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
The singleton class must provide a global access point to get the instance of the class.
Singleton pattern is used for logging, drivers objects, caching and thread pool.
Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.*/

/*Eager initialization
Static block initialization
Lazy Initialization
Thread Safe Singleton
Bill Pugh Singleton Implementation
Using Reflection to destroy Singleton Pattern
Enum Singleton
Serialization and Singleton
*/

/*In eager initialization, the instance of Singleton Class is created at the time of class loading, 
this is the easiest method to create a singleton class 
but it has a drawback that instance is created even though client application might not be using it.*/

/*But in most of the scenarios, Singleton classes are created for resources such as File System, Database connections etc.*/ 

/*We should avoid the instantiation until unless client calls the getInstance method.*/

/*Also, this method doesn’t provide any options for exception handling.*/

public class EagerInitializedSingleton {   

    
    //Private constructor to restrict instantiation of the class from other classes.
    private EagerInitializedSingleton(){
    	
    }
    
   // Private static final variable of the same class that is the only instance of the class.
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

   //  Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
    
    public static void main(String[] args) {
	
    	
    	EagerInitializedSingleton obj1 =  EagerInitializedSingleton.getInstance();
    	EagerInitializedSingleton obj2 =  EagerInitializedSingleton.getInstance();
    	
    	System.out.println(obj1.hashCode());
    	System.out.println(obj2.hashCode());
	}
}