/**
 * 
 */
package circle;

/**
 * @author Aleenah Alam
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		StringBuilder chain = new StringBuilder();

		if (o == null)
			throw new IllegalArgumentException("Object passed is null");
		
		System.out.println("Inheritance chain:");
		Class<?> classExample = o.getClass();

		while (classExample != null) {
			chain.append(classExample.getName());
			classExample = classExample.getSuperclass();
			if (classExample != null) {
				chain.append(" inherits from ");
			}
		}

		System.out.println(chain.toString());

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.println("List of methods:");
		for (Method methods : m) {
			System.out.println(methods.getName());
		}
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		String str = "test test";
		r.correspondingClass(str);
		r.inheritanceChain(str);
		r.listMethods(str);
		
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete		
		ColoredCircle coloredCircle = new ColoredCircle();
		r.correspondingClass(coloredCircle);
		r.inheritanceChain(coloredCircle);
		r.listMethods(coloredCircle);
	}

}
