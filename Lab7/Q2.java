package data_lab7;

import java.util.Scanner;

public class Q2 {

	 public static void reverse(String myinput)
	    {
	        if ((myinput==null)||(myinput.length() <= 1))
	           System.out.println(myinput);
	        else
	        {
	            System.out.print(myinput.charAt(myinput.length()-1));
	            reverse(myinput.substring(0,myinput.length()-1));
	        }
	    }
	     
	    
	    public static void main(String[] args)
	    {
	    	
	    	System.out.println("Reverse of Is it cake? = ");
	    	reverse("Is it cake?");
	        String myinput = "pots&pans";
	        
	        Q2 obj = new Q2();
	        System.out.println("Reverse of pots&pans = ");
	        obj.reverse(myinput);
	        Scanner sc = new Scanner(System.in);
			System.out.println("please write the string to make reverse");
			String g= sc.nextLine();
			System.out.println("Reverse of your string = ");
			reverse(g);
	    }  
}
