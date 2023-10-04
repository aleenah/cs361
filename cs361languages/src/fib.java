
public class fib {
	public static int fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n needs to greater than 0");
		} else {
			if (n == 0 || n == 1) {
				return 1;
			} else {
				return fib(n-1) + fib(n-2);
			}
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			System.out.println("fib(" + i + ") = " + fib(i));
		}
			
		for (int i = 0; i < 30; i++) {
			System.out.println("fact(" + i + ") = " + fact(i));
		}
	}
	
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n*fact(n-1); 
		}
	}

}
