package data_lab3;

import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {

	  /** Insertion-sort of an array of characters into nondecreasing order */
	  public static void insertionSort(int[] data) {
	    int n = data.length;
	    for (int k = 1; k < n; k++) {            // begin with second character
	      int cur = data[k];                    // time to insert cur=data[k]
	      int j = k;                             // find correct index j for cur
	      while (j > 0 && data[j-1] > cur) {     // thus, data[j-1] must go after cur
	        data[j] = data[j-1];                 // slide data[j-1] rightward
	        j--;                                 // and consider previous j for cur
	      }
	      data[j] = cur;                         // this is the proper place for cur
	    }
	  }
	  public static void insertionSortHL() {
		  
		  Integer[] arr = { 5, 2, 1, 8, 10 };
	        Arrays.sort(arr, Collections.reverseOrder());
	        System.out.println(arr);
		  }

	  public static void main(String[] args) {
	    int[] a = {41, 38, 48, 12, 28, 46, 33, 19, 10, 58};
	    System.out.println(java.util.Arrays.toString(a));
	    int[] B = Arrays.copyOf(a,10);
	     insertionSort(a);
	    System.out.println(java.util.Arrays.toString(a));
	    System.out.println("b="+ java.util.Arrays.toString(B));
	    System.out.println("a="+java.util.Arrays.toString(a));
	    
	    
	    for (int i = 0; i < a.length; i++) {
	    	int k=0;
	       if (a[k] == B[i]) {
	        	System.out.print("["+i+",");
	        
	                
	                
	        }
	    }
	    for (int i = 0; i < a.length; i++) {
	    	int k=1;
	       if (a[k] == B[i]) {
	        	System.out.print(i+",");
	        
	                
	                
	        }
	    }
	    for (int i = 0; i < a.length; i++) {
	    	int k=2;
	       if (a[k] == B[i]) {
	        	System.out.print(i+",");
	        
	                
	                
	        }
	    }
	    for (int i = 0; i < a.length; i++) {
	    	int k=3;
	       if (a[k] == B[i]) {
	        	System.out.print(i+",");
	        
	                
	                
	        }
	    }
	    for (int i = 0; i < a.length; i++) {
	    	int k=4;
	       if (a[k] == B[i]) {
	        	System.out.print(i+",");
	        
	                
	                
	        }
	    }
	    for (int i = 0; i < a.length; i++) {
	    	int k=5;
	       if (a[k] == B[i]) {
	        	System.out.print(i+",");
	        
	                
	                
	        }
	    }
	    for (int i = 0; i < a.length; i++) {
	    	int k=6;
	      if (a[k] == B[i]) {
	        	System.out.print(i+",");
	        
	                
	                
	        }
	    }
	    for (int i = 0; i < a.length; i++) {
	    	int k=7;
	       if (a[k] == B[i]) {
	        	System.out.print(i+",");
	        
	                
	                
	        }
	    }
	    for (int i = 0; i < a.length; i++) {
	    	int k=8;
	       if (a[k] == B[i]) {
	        	System.out.print(i+",");
	        
	                
	                
	        }
	    }
	    for (int i = 0; i < a.length; i++) {
	    	int k=9;
	       if (a[k] == B[i]) {
	        	System.out.print(i+"]");
	        
	                
	                
	        }
	    }
	    
	    
	  }
	}
