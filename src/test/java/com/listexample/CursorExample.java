package com.listexample;

import java.util.*;

public class CursorExample {

	public static void main(String[] args) {
		//         Sample data for demonstration
		List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));
		Vector<String> vector = new Vector<>(Arrays.asList("Lion", "Tiger", "Elephant", "Leopard"));

		//         1. Iterator example
		System.out.println("=== Using Iterator ===");
		//         Iterator works for all types of collections (List, Set, etc.)
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.println("Item: " + item);
			//         Example of removing an item during iteration
			if (item.equals("Banana")) {
				iterator.remove();
			}
		}
		System.out.println("List after Iterator: " + list);





		//         2. ListIterator example
		System.out.println("\n=== Using ListIterator ===");
		//         ListIterator works only with List and supports bidirectional traversal
		ListIterator<String> listIterator = list.listIterator();
		listIterator.add("newELement");
		while (listIterator.hasNext()) {
			String item = listIterator.next();
			System.out.println("Next Item: " + item);

			//         Example of modifying an item
			if (item.equals("Cherry")) {
				listIterator.set("Cranberry");
			}
		}

		//         Backward traversal
		System.out.println("Traversing backward using ListIterator:");
		while (listIterator.hasPrevious()) {
			System.out.println("Previous Item: " + listIterator.previous());
		}
		System.out.println("List after ListIterator: " + list);




		//         3. Enumeration example
		System.out.println("\n=== Using Enumeration ===");
		//         Enumeration works with legacy collections like Vector
		Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			String item = enumeration.nextElement();
			System.out.println("Item: " + item);
		}
	}
}



//        Key Explanation in Comments
//        
//        Iterator:
//          Purpose: Universal cursor for all collections in Java.
//          Supports: Forward-only traversal.
//          Key Method: remove() allows deletion of the current element during iteration.
//          Limitation: Cannot traverse backward or add/modify elements during iteration.
//        
//        ListIterator:
//          Purpose: Specialized cursor for List collections.
//          Supports:
//          Forward traversal using hasNext() and next().
//          Backward traversal using hasPrevious() and previous().
//          Key Methods:
//          set(E e): Modify the current element.
//          add(E e): Insert new elements during iteration.
//          Limitation: Works only with List collections (e.g., ArrayList, LinkedList).
//        
//        Enumeration:
//          Purpose: Legacy cursor for older collections like Vector and Hashtable.
//          Supports: Forward-only traversal.
//          Key Methods: hasMoreElements() and nextElement().
//          Limitation: Does not allow modification of the collection during traversal.
//                      It is less preferred in modern applications.


