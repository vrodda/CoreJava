package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*Reflection can be used to destroy all the above singleton implementation approaches. Let’s see this with an example class.*/
public class ReflectionSingletonTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eagerInitializedSingleton2 = null;

		Constructor constructors[] = EagerInitializedSingleton.class.getDeclaredConstructors();
		
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			eagerInitializedSingleton2 = (EagerInitializedSingleton) constructor.newInstance();
			break;
			
		}
		
		System.out.println(eagerInitializedSingleton1.hashCode());
		System.out.println(eagerInitializedSingleton2.hashCode());

	}
}
