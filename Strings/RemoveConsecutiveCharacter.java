
public class RemoveConsecutiveCharacter {
	
	public String removeConsecutiveCharacter(String S){
		 if(S.length()==0) {
			 return "";
		 }
		 
		 String smallAns=removeConsecutiveCharacter(S.substring(1));
		 
		 if(smallAns.length()!=0&&smallAns.charAt(0)==S.charAt(0)){
		     return smallAns;	 
		 }
		 
		 return S.charAt(0)+smallAns;
	 }
	
}
