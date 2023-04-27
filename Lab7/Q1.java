package data_lab7;

import java.util.Scanner;

public class Q1 {
	public static int recursion(int k, int m) {
		
		

	    if ((k == 0) || (m == 0))
	        return 0;
	    else
	        return (k + recursion(k, m - 1));
	    // it will call yourself and we will multiply with adding with itself 
	    // for (5, 3)
	    // 5 + r(5,2)
	    // 5 + 5 + r(5,1)
	    // 5 + 5 + 5 + r(5,0)
	    // r(5,0) = 0 so 5 + 5 + 5 = 15   5.3= 15 so it is true

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please write the first number");
		int k= sc.nextInt();
		System.out.println("please write the second number");
		int m=sc.nextInt();
		int p = recursion(k, m);
		// System.out.println(recursion(90, 10)); // it works too
		System.out.println("calculation is = "+ p);
	}

}
