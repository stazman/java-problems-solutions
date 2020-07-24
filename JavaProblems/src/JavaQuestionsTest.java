public class JavaQuestionsTest {

	public static void main(String[] args) {
		
		//4
		
		System.out.println(getScrabbleScore("day"));
		
		
	}
	

//4
	

	public static int getScrabbleScore(String string) {
	
		int total = 0;
	
		char[] word = string.toCharArray();
	
		for(int i = 0; i < word.length; i++) {
		
			if (word[i] == 'a' || 
				word[i] == 'e' || 
				word[i] == 'o'|| 
				word[i] == 'i'|| 
				word[i] == 'u'|| 
				word[i] == 'l'|| 
				word[i] == 'n'|| 
				word[i] == 'r'|| 
				word[i] == 's'|| 
				word[i] == 't') {
								
				total+=1;
				
			} else if (word[i] == 'd' || 
					
				word[i] == 'g') {
				
				total+=2;
				
			} else if (word[i] == 'b' || 
				word[i] == 'c' || 
				word[i] == 'm'|| 
				word[i] == 'p') {
				
				total+=3;
				
			} else if (word[i] == 'f' || 
				word[i] == 'h' || 
				word[i] == 'v'|| 
				word[i] == 'w' || 
				word[i] == 'y') {
					
				total+=4;
			
			} else if (word[i] == 'k') {
						
				total+=5;
				
			} else if (word[i] == 'x') {
							
				total+=8;
					
			} else if (word[i] == 'q') {
								
				total+=10;
						
			}
			
		}
	
		return total;
	
	}
}
	
	



	