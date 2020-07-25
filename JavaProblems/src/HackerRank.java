import java.util.ArrayList;
import java.util.List;

public class HackerRank {

	public static void main(String[] args) {

		System.out.println(divisor_sum(6));
		
	}
	
//	Java Interface
	    
	  public static  int divisor_sum(int n){
	        
	        int counter = 0;
	        
	        int result = 0;
	        
//	        List<Integer> divisorList = new ArrayList<>(); 
	        
	        while(counter <= n){
	            
	            counter++;
	            
	            if (6 % counter == 0){
	            	
	            	result+=counter;
	                
//	                divisorList.add(counter);
	               
	            }
	               
	        }
	        
//	        int result = divisorList
//	        		  .stream()
//	        		  .reduce(0, (subtotal, element) -> subtotal + element);
	        
	        
	        return result;
	             
	    }
	    
	}
