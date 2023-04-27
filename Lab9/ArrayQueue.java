package lab9_data;


public class ArrayQueue<E> implements Queue<E> {
	  // instance variables
	  /** Default array capacity. */
	  public static final int CAPACITY = 1000;      // default array capacity

	  /** Generic array used for storage of queue elements. */
	  private E[] data;                             // generic array used for storage

	  /** Index of the top element of the queue in the array. */
	  private int f = 0;                            // index of the front element

	  /** Current number of elements in the queue. */
	  private int sz = 0;                           // current number of elements

	  // constructors
	  /** Constructs an empty queue using the default array capacity. */
	  public ArrayQueue() {this(CAPACITY);}         // constructs queue with default capacity

	  /**
	   * Constructs and empty queue with the given array capacity.
	   * @param capacity length of the underlying array
	   */
	  @SuppressWarnings({"unchecked"})
	  public ArrayQueue(int capacity) {             // constructs queue with given capacity
	    data = (E[]) new Object[capacity];          // safe cast; compiler may give warning
	  }

	  // methods
	  /**
	   * Returns the number of elements in the queue.
	   * @return number of elements in the queue
	   */
	  @Override
	  public int size() { return sz; }

	  /** Tests whether the queue is empty. */
	  @Override
	  public boolean isEmpty() { return (sz == 0); }

	  /**
	   * Inserts an element at the rear of the queue.
	   * This method runs in O(1) time.
	   * @param e   new element to be inserted
	   * @throws IllegalStateException if the array storing the elements is full
	   */
	  @Override
	  public void enqueue(E e) throws IllegalStateException {
	    if (sz == data.length) throw new IllegalStateException("Queue is full");
	    int avail = (f + sz) % data.length;   // use modular arithmetic
	    data[avail] = e;
	    sz++;
	  }

	  /**
	   * Returns, but does not remove, the first element of the queue.
	   * @return the first element of the queue (or null if empty)
	   */
	  @Override
	  public E first() {
	    if (isEmpty()) return null;
	    return data[f];
	  }

	  /**
	   * Removes and returns the first element of the queue.
	   * @return element removed (or null if empty)
	   */
	  @Override
	  public E dequeue() {
	    if (isEmpty()) return null;
	    E answer = data[f];
	    data[f] = null;                             // dereference to help garbage collection
	    f = (f + 1) % data.length;
	    sz--;
	    return answer;
	  }

	  /**
	   * Returns a string representation of the queue as a list of elements.
	   * This method runs in O(n) time, where n is the size of the queue.
	   * @return textual representation of the queue.
	   */
	  public String toString() {
	    StringBuilder sb = new StringBuilder("(");
	    int k = f;
	    for (int j=0; j < sz; j++) {
	      if (j > 0)
	        sb.append(", ");
	      sb.append(data[k]);
	      k = (k + 1) % data.length;
	    }
	    sb.append(")");
	    return sb.toString();
	  }
	  public void concatenate(LinkedQueue<E> Q2) {
		  SinglyLinkedList<E> list = new SinglyLinkedList<E>();
		  // I am using concatenate method from SinglyLinkedList 
		list.concatenate(Q2.list);
		  } 
	  public static void main(String[] args) {
		  // I am creating original list and other list
		  SinglyLinkedList linkedList=new SinglyLinkedList();
		  SinglyLinkedList Q2=new SinglyLinkedList();
		  //  I am adding their element
			linkedList.addLast(1);
			linkedList.addLast(2);
			linkedList.addLast(3);
			Q2.addLast(4);
			Q2.addLast(5);
			Q2.addLast(6);
			System.out.println("Original list before concatenate = " + linkedList);
			System.out.println("My Q2 list before concatenate = " + Q2);
			
			System.out.println("// I used concatenate method and elements in list Q2 will be appended to the end of the original array and my original array will become empty");
			linkedList.concatenate(Q2);
			System.out.println("Original list after concatenate = "+ linkedList);
			System.out.println("My Q2 list after concatenate= " + Q2);
	}
	}
