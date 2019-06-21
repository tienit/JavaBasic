
public class JavaArrays {

	public static void main(String[] args) {
		
		// Java Strings
		//String arrays
		// Syntax
		
		//type[] variable;
		
		String[] cars = {"Toyota", "Huyndai", "Honda"};
		
		int[] myNums = {1, 4, 9, 100};
		
		//index: 0 ~ length - 1
		System.out.println("Phan tu thu 2 cua cars: " + cars[1]);
		
		System.out.println("Phan tu thu 3 cua myNums: " + myNums[2]);
		
		// Thay doi gia tri cua cac phan tu
		cars[0] = "VinFast";
		System.out.println("Phan tu thu 2 cua cars: " + cars[0]);
		
		myNums[3] = 99;
		System.out.println("Phan tu thu 2 cua cars: " + myNums[3]);
		
		System.out.println("Chieu dai cua cars = " + cars.length);
		System.out.println("Chieu dai cua myNums = " + myNums.length);
		
		
		//type[][] variable = "cach khai bao phan tu trong mang";
		int[][] myMatrix = {{6, 4, 3, 9}, {5, 6, 7, 1, 2}, {11, 66, 33}};
		int x = myMatrix[2][1];
		System.out.println(x);
		
		String str1 = "Hello";
	}

}
