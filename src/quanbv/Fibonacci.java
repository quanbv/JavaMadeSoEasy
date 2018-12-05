package quanbv.algorithms;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(fibonacci1(n));
		System.out.println(fibonacci2(n));
//		Long fibo = Fibo(100);
//		System.out.println(fibo);
	}
	private static long fibonacci1(int n) {
		long f[] = new long[n+2];
		int i;
		
		f[0] = 0;
		f[1] = 1;
		for (i = 2; i <= n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
	
	private static long fibonacci2(int n) {
		long a = 0, b = 1, c;
		if (n == 0) {
			return a;
		}
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
}

