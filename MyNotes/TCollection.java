/**
 * 
 */
package collections_package.methods;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

/**
 * @author sitaramm
 *
 */

public class TCollection {

	public static void main(String[] args) {
		
		List list = new LinkedList<Integer>();
		
		list.add(10); // This method is from Collection Interface. No ordered maintained. 
						// Element added to last and in case of removing, 
						//it removes first occurance of elements.
		
		list.add(1,20); // This method is from List Interface
						// Thats why it is called as sequential or ordered insertion. Similary other methods.
		
		list.add(2,30);
		list.add(0,0); // The order of insertion is in our hand.
		
		
		// How to iterate ? Three ways :
		
		//1 : Simple for loop or for each loop
		for(Object obj:list){
			Object genericObject = null;
			// If we dont know what type of collection is this. Use instanceof.
			if (obj instanceof Integer) { 
				Integer iRef = (Integer) obj; // Downcasting
				int i = iRef; // Unboxing	
				Integer iBox = i; // Boxing
				genericObject = iBox; // Upcasting. 
			}
			if (obj instanceof Character) {
				char c = (Character) obj; // AutoUnboxing
				genericObject = c; // Auto Boxing. 1st Boxing to Character and then upcasting to Object.
			}
			if (obj instanceof String) {
				String sRef = (String) obj;  // Downcasting
				genericObject = sRef; // Only Upcasting.
			}
		}
		
		
		
		//2 : This method is from Iterable Interface. Can be used by all collection classes which has implemented Iterable Iterface.
		Iterator<Integer> it = list.iterator();
		System.out.println("Iterating by Iterable Interface method(Iterator):");
		while(it.hasNext()){
			Object ele = it.next(); // This method return Integer referance. But if we dont know what type of collection it is. 
									// Called Upacasting
			Integer iRef = (Integer) ele; // downcasting.
			int i = iRef; // Unboxing.
			if(i == 0)it.remove();// Remove while traversing
			System.out.println(i);
		}
		
		//3 : This method is from List Interface. Can be used by all collection classes which has implemented List Iterface.
		ListIterator<Integer> lit = list.listIterator();
		System.out.println("Iterating by Collection Interface method(Iterator):");
		System.out.println("Forward : ");
		while(lit.hasNext()){
			int ele = lit.next(); // Auto Unboxing.
			System.out.println(ele); 
			// Advantages of ListIterator over Iterator : 
			if(ele == 30) lit.set(300); //A: Replace
			
		}
		//B: Can access in reverse order
		System.out.println("Reverse : ");
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
		
//  ------------------------ Vector -------------------------------
		
		Vector <Integer> vector = new Vector(); 
		vector.addAll(list);
		
		// We can Iterate this using Iterator.
		// It also implements Enumerable Interface which has Enumerator method.
		
		Enumeration<Integer> enm = vector.elements();
		System.out.println("Iterating vector elements by ENumeration");
		while(enm.hasMoreElements()){
			int i = enm.nextElement();
			
			System.out.println(i);
		}
		
// ----------------------  Stack ---------------------------------
		
		Stack stack = new Stack();
		stack.addAll(list);
		stack.push(200);int topElement = (int) stack.peek();
		System.out.println("Top Element from Stack is : "+topElement);
		stack.pop();
		
		
	}

}
