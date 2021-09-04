package arrayListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Collection (I) - List, Set, Hash
		// List (I) - ArrayList, Linked List, Stack, Vector
		// Array List - Inserted Order, best suited for searching, Insertion and deletion is possible but tough and time consumption
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("HDFC");
		arrList.add("ICICI");
		arrList.add("SBI");
		arrList.add("RBI");
		arrList.add("IOB");
		//arrList.add(null); // array list accept null values
		arrList.add("RBI"); // accept duplicate values
		
		System.out.println(arrList);
		System.out.println(arrList.get(0));
		System.out.println(arrList.indexOf("SBI"));
		System.out.println(arrList.indexOf("RBI"));
		System.out.println(arrList.lastIndexOf("RBI"));
		
		List<String> anotherArrList = new ArrayList<String>();
		anotherArrList.addAll(arrList);
		System.out.println(anotherArrList);
		anotherArrList.clear();
		System.out.println(anotherArrList);
		
		arrList.remove("RBI"); // removes from 1st occurance
		System.out.println(arrList);
		
		arrList.add(1,"BOI"); // add a new index
		System.out.println(arrList);
		
		arrList.set(1, "KVB"); // update or replace the excisting value
		System.out.println(arrList);
		
		System.out.println(arrList.isEmpty());
		
		// using for Loop
		for (int i=0; i<arrList.size(); i++) {
			
			System.out.println(arrList.get(i));
			
		}
		System.out.println("---------------");
		
		// using Iterator
		Iterator<String> iterator = arrList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println("---------------");
		
		// using List Iterator
		ListIterator<String> listIterator = arrList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			
		}
		System.out.println("---------------");
		
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
