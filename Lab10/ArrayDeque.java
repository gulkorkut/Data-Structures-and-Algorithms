package data_lab10;

public class ArrayDeque<E> implements Deque<E> {
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
	  public ArrayDeque() {this(CAPACITY);}         // constructs queue with default capacity

	  /**
	   * Constructs and empty queue with the given array capacity.
	   * @param capacity length of the underlying array
	   */
	  @SuppressWarnings({"unchecked"})
	  public ArrayDeque(int capacity) {             // constructs queue with given capacity
	    data = (E[]) new Object[capacity];          // safe cast; compiler may give warning
	  }

	  // methods
	  /**
	   * Returns the number of elements in the queue.
	   * @return number of elements in the queue
	   */
	  @Override
	  public int size() { return sz;} //add code here }

	  /** Tests whether the queue is empty. */
	  @Override
	  public boolean isEmpty() {return (sz==0);} //add code here }

	  /**
	   * Inserts an element at the rear of the queue.
	   * This method runs in O(1) time.
	   * @param e   new element to be inserted
	   * @throws IllegalStateException if the array storing the elements is full
	   */
	  @Override
	  public void addFirst(E e) throws IllegalStateException {
	    if (sz == data.length) throw new IllegalStateException("Queue is full");
	    //add code here 
	    // use modular arithmetic
	    int avail = (f -1 +data.length) % data.length;
	    f= (f -1 +data.length) % data.length;
	    
	    
	    data[avail] = e;
	    sz++;
	  }

	  public void addLast(E e) throws IllegalStateException {
	    if (sz == data.length) throw new IllegalStateException("Queue is full");
	  
	    int avail = (f + sz) % data.length; 
	    
	    // use modular arithmetic
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
	    //add code here
	    return data[f];

	  }

	  public E last() {
	    if (isEmpty()) return null;
	    return data[f];
	    //add code here
	  }
	  /**
	   * Removes and returns the first element of the queue.
	   * @return element removed (or null if empty)
	   */
	  @Override
	  public E removeFirst() {
	    if (isEmpty()) return null;
	    E answer = data[f];
	    data[f] = null;                             // dereference to help garbage collection
	    f = (f + 1) % data.length;
	    sz--;
	    return answer;
	  }

	  public E removeLast() {
	    if (isEmpty()) return null;
	    //add code here
	    E answer = data[(f+sz-1) %data.length];
	    data[(f+sz )%data.length] = null;                             // dereference to help garbage collection
	 
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
	  public static void main(String[] args) {
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		System.out.println("we are starting to add");
		System.out.println("add first 2");
		ad.addFirst(2);
		System.out.println(ad.toString());
		System.out.println("addfirst 1");
		ad.addFirst(1);
		System.out.println(ad.toString());
		System.out.println("add last 3");
		ad.addLast(3);
		System.out.println(ad.toString());
		System.out.println("remove first");
		ad.removeFirst();
		System.out.println(ad.toString());
		System.out.println("remove last");
		ad.removeLast();
		System.out.println(ad.toString());
		System.out.println("first element = " + ad.first());
		System.out.println("last element = " + ad.last());
		System.out.println("size=" + ad.size());
		System.out.println("is it empty = " + ad.isEmpty());
	}
	}

