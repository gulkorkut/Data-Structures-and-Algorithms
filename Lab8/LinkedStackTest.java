package data_lab8;
import java.util.*;

public class LinkedStackTest {
public static void transfer(Stack<Integer> S, Stack<Integer> T) {
	
	while(!S.isEmpty()) {
		
		int temporary = S.pop();
		T.push(temporary);
	}
}
//public static transfer(Stack<E> S, Stack<E> T) {
//	while (!S.isEmpty())
//		T.push(S.pop());
//}
public static void main(String[] args) {
	 Stack<Integer> S = new ArrayStack<>();  
	    S.push(5);                             
	    S.push(3);
	    
	    System.out.println("S : " + S);
	    Stack<Integer> T = new ArrayStack<>();
	    // We are transfering S to T
	    transfer(S, T);
	    System.out.println("T : " + T);
}
	
}
