
public class Prepared {
	
	
	
	public static void piramids(int numb) {
		
		for(int i=0; i<numb; i++) {//Rows
			
			
			for(int j=numb-i;j>1; j--) {
				
				System.out.print(" ");
			}
			
				for(int j=0;j<=i; j++) {
				
				System.out.print("* ");
			}
				System.out.println();
			
		}
	}
	
	
	public static void main(String [] args) {
		
		piramids(15);
		
		
		for(int i=1; i<=10; i++) {//Rows
			
			System.out.println(" ");
			
			for(int j=1; j<=i; j++) {//columns
			
			
			System.out.print(i*j+" ");
			
			
			
			
		}
			
			System.out.println();
			
		
		}
		
	}
	

}
