package lab9_data;


public class ReverseStackTest {
public static void main(String[] args) {
//	while (!S.isEmpty())
//	T.push(S.pop());
//}
	
	   Stack<Integer> S = new ArrayStack<>();  // contents: ()
	    S.push(5);                              
	    S.push(3);                              
	    S.push(7);                              
	    S.push(9);                           
	    Stack<Integer> Q = new ArrayStack<>();
	    Q.push(S.pop());
	    Q.push(S.pop());
	    Q.push(S.pop());
	    Q.push(S.pop());
	    System.out.println(Q);
}
}
