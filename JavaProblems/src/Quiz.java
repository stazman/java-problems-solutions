
public class Quiz {

	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5,6,7};
		
		processArray(intArr);
			
	}
	
	
	public static void processArray(int[] values){
		
		int sum = 0;         
		
		int i = 0;         
		
//		try{            
//			
			while(values[i]<7){                 
				
				i++;   
				
				sum = sum +values[i];                 
				
				          
				
			}         
			
//		} catch(Exception e){ 
//			
//			System.out.println("caught exception");
//			
//		}         
		
	
		System.out.println("sum = "+sum);     
	
	}
	
}
