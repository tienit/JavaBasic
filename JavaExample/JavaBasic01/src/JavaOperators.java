
public class JavaOperators {

	public static void main(String[] args) {
		
		// Java Operators
		
		int sum1 = 100 + 50;      // 150 (100 + 50)
		int sum2 = sum1 + 250;    // 400 (150 + 250)
		int sum3 = sum2 + sum2;   // 800 (400 + 400)
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
		// Java Arithmetic Operators
		System.out.println("======== Arithmetic ========");
		int x = 10;
		int y = 3;
		// Division
		int z1 = x / y;
		System.out.println(z1);
		float z2 = (float) x / y;
		System.out.println(z2);
		double z3 = (double) x / y;
		System.out.println(z3);
		
		// Java Assignment Operators
		System.out.println("======== Assignment ========");
		int m = 8;
		int n = 5;
		m += n;
		System.out.println(m);
		
		m = 8;
		n = 5;
		m -= n;
		System.out.println(m);
		
		m = 8;
		n = 5;
		m /= n;
		System.out.println(m);
		
		m = 8;
		n = 5;
		m *= n;
		System.out.println(m);
		
		m = 8;
		n = 5;
		m %= n;
		System.out.println(m);
		
		m = 8;
		n = 5;
		m &= n;
		System.out.println(m);
		
		m = 8;
		n = 5;
		m |= n;
		System.out.println(m);
		
		m = 17;
		n = 13;
		m ^= n;
		System.out.println(m);
		
		m = 8;
		n = 5;
		m >>= n;
		System.out.println(m);
		
		m = 8;
		n = 5;
		m <<= n;
		System.out.println(m);
		
		// Java Comparison Operators
		System.out.println("======== Comparison ========");
		int a = 5;
		int b = 9;
		if (a == b) {
			System.out.println("a is equal to b");
		}
		
		if (a != b) {
			System.out.println("a is NOT equal to b");
		}
		
		if (a > b) {
			System.out.println("a is greater than b");
		}
		
		if (a < b) {
			System.out.println("a is less than b");
		}
		
		if (a >= b) {
			System.out.println("a is greater than or equal to b");
		}
		
		if (a <= b) {
			System.out.println("a is less than or equal to b");
		}
		
		// Kieu Nguyen thuy va Kieu khong nguyen thuy
		int a1 = 10;
		String s1 = "Hello World";
		
		Integer i1 = 10;
		System.out.println("Maximum value of Integer type: " + i1.MAX_VALUE);
		
		Long l1 = 10L;
		System.out.println("Maximum value of Long type: " + l1.MAX_VALUE);
	}

}
