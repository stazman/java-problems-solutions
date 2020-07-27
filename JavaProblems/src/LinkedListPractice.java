import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
	
	
	LinkedListPractice(){};
	
	public static void main(String[] args) {
		
		
		List<String> l1 = new LinkedList<>();
		
	     
		
		 l1.add("Zara");
	     l1.add("Mahnaz");
	     l1.add("Ayan");
	     System.out.println();
	     System.out.println(" LinkedList Elements");
	    
	     System.out.print("\t" + l1.get(2));
	     
	     try {
	    	 
	    	 l1.get(5);
			 
		} catch (Exception e) {
			
			System.out.println("Not enough elements in list");
			
		}
		
	}
	
}

