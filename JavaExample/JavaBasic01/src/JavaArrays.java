public class JavaArrays {

	public static void main(String[] args) {
		
		//int i =0;
				String[] arrGiaDinh = new String[5];
						arrGiaDinh[0] = "Bố";
						arrGiaDinh[1] = "Mẹ";
						arrGiaDinh[2] = "Anh";
						arrGiaDinh[3] = "Chị";
						arrGiaDinh[4] = "Cháu trai";
						//arrGiaDinh[5] = "Cháu gái";
				for (int i=0; i<arrGiaDinh.length-1; i++)
				{
					System.out.println(arrGiaDinh[i]);
				}
		
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
