package data_lab3;
import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		int[] A= {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		System.out.println(A[9]);
		System.out.println(Arrays.toString(A));
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		 int[] B = Arrays.copyOf(A,10);
		 System.out.println(Arrays.toString(B));
		 if (Arrays.equals(A, B))   
			 System.out.println("Arrays are equal.");   
			 else  
			 System.out.println("Arrays are not equal.");  
		 System.out.println(Arrays.toString(A));
		 System.out.println(Arrays.binarySearch(A, 5));
		
	}
}
