
public class exercise {

	public static void main(String[] args) {
		System.out.println("Solution\n");
		
		int numb=31282359;
		String str=String.valueOf(numb);
		
		for(int i=0;i<str.length(); i++) {
			
			switch(str.charAt(i)) {
			
			case '1':{
				 
				
				System.out.print(1+" one ");
				break;
			}
			
			case '2':{
				
				System.out.print(2+" two ");
				break;
			}
			
			case '3':{
				
				System.out.print(3+" three ");
				break;
			}
			
			case '4':{
				
				System.out.print(4+" four ");
				break;
			}
			
			case '5':{
				
				System.out.print(5+" five ");
				break;
			}
			
			case '6':{
				
				System.out.print(6+" six ");
				break;
			}
			case '7':{
				
				System.out.print(7+" seven ");
				break;
			}
			case '8':{
				
				System.out.print(8+" eight ");
				break;
			}
			case '9':{
				
				System.out.print(9+" nine ");
				break;
			}

default:{
	
	System.out.println("character was not identified!");
}
			
			
			}
			
			
		}
		

	}

}
