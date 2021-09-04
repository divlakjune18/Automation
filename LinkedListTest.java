package linkedListTest;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		
		System.out.println(linkedList);
		
		linkedList.remove(1);
		System.out.println(linkedList);
		
		linkedList.addLast(6);
		linkedList.addFirst(0);
		System.out.println(linkedList);
		
		linkedList.remove(3);
		System.out.println(linkedList);
		
		linkedList.remove("3");
		System.out.println(linkedList);
		
		System.out.println(linkedList.getFirst()); // first value
		System.out.println(linkedList.getLast()); // last value
		
		System.out.println(linkedList.removeFirst());
		System.out.println(linkedList.removeLast());
		
		System.out.println(linkedList);
		
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		System.out.println(linkedList); // allows duplicate values
		
		//System.out.println(linkedList.removeFirstOccurrence(1));
		System.out.println(linkedList);
		
		System.out.println(linkedList.pollFirst()); // deletes the 1st value
		System.out.println(linkedList.pollLast()); // deletes the last value
		System.out.println(linkedList.poll()); // deletes the 1st value

		
 		
	}

}
