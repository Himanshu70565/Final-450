/*
	Question : Reversing a String
	Question Category:Easy
	Question Code:344
*/
public class ReverseAString {
	
	public void reverseString(char[] s) {
     
		int length=s.length;
		
		for(int i=0;i<length/2;i++) {
			
			int start=i,end=length-1-i;
			
			char temp=s[i];
			s[start]=s[end];
			s[end]=temp;
		
		}
		
    }
}
