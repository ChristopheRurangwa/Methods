
public class backwards {
	public boolean palindrome(String s) {
		
		boolean respon=false;
        if(s.length()==0||s==null){
            respon=false;
            return false;
        }
        
        StringBuilder strbld= new StringBuilder();
        String holder="";
        
        StringBuilder wrd=new StringBuilder();
        String nw="";
        
        for(int l=0; l<=s.length()-1;l++){
           if(Character.isLetterOrDigit(s.charAt(l))){
               
            nw=wrd.append(s.charAt(l)).toString();
               
           }
            
        }
       
        
        for(int i=s.length()-1; i>=0; i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
            holder=strbld.append(s.charAt(i)).toString().toLowerCase();
            }

        }
        
        if(nw.toLowerCase().equals(holder)){
            System.out.println(holder);
            respon=true;
        }
        
        
        
       return respon;
        
	}

	public static void main(String[] args) {
		
		boolean bool= false;
		
		String str=".amama";
		StringBuilder strbld= new StringBuilder();
		 String holder="";
		
		for(int i=str.length()-1;i>=0;i--) {
			if(Character.isLetterOrDigit(str.charAt(i)))
			holder=strbld.append(str.charAt(i)).toString().toLowerCase();
		
		}
		if(str.toLowerCase().equals(holder)) {
			bool=true;
			System.out.println("Palidrome -:>"+bool);
		}
		
		else {
			bool=false;
			System.out.println("Not Palidrome -:>"+ bool);
		}
		
	}

}

