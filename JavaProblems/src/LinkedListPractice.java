import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListPractice {
	
	
	LinkedListPractice(){};
	
	public static void main(String[] args) {
		
		
		int[] i = new int[10];
		
		int len = i.length;
		
		List<String> l3 = new ArrayList<>();
		
		 l3.add("Zara");
	     l3.add("Mahnaz");
	     l3.add("Ayan");
	     l3.add("Zara");
		
		Set<String> l1 = new HashSet<>();
		
		Set<String> l2 = new HashSet<>();
		
		 l1.add("Zara");
	     l1.add("Mahnaz");
	     l1.add("Ayan");
	     l1.add("Zara");
	     
//	     l2.add("Susan");
	     
	     System.out.println(l2.hashCode());
	     System.out.println(l2);
	     System.out.println(len);
	     System.out.println(l1);
	     System.out.println(l3);
	     
//	     try {
//	    	 
//	    	 l1.get(5);
//			 
//		} catch (Exception e) {
//			
//			System.out.println("Not enough elements in list");
//			
//		}
		
	}
	
}

