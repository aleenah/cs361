/**
 * 
 */
package mystack;

/**
 * @author Aleenah Alam 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack == null) {
			return null;
		}
		T popped = theStack.val;
		theStack = theStack.next;
		return popped;
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> newNode = new MyNode<>(v, theStack);
		theStack = newNode;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> numberPile = new MyStack<>();
		numberPile.push(1);
		numberPile.push(2);
		System.out.println(numberPile.pop());
		numberPile.push(5);

		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> humanTower = new MyStack<>();
		Person p1 = new Person("Aleenah", "Alam");
		Person p2 = new Person("Christelle", "Scharff");
		humanTower.push(p1);
		humanTower.push(p2);
	}

}
