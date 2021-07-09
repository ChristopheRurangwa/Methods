
public class DuplicatesDetected {
	
	public static void duplicate() {
		
		String str= "TTTUUEEHGHGGkkkkkJJJJ";
		int val=0;
		
		for(int i=0; i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
				val++;
				System.out.print(str.charAt(i)+" ");
				break;
				
				
					
				}
				
				
			}

			}
		
		
		
	}
	
	public static void main(String[] args) {
		
		duplicate();

	}

}
