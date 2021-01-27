
public class PalindromeString {
	int isPlaindrome(String S) {
        
		int ans=1;
		
		int start=0,end=S.length()-1;
		
		while(start<=end) {
			if(S.charAt(start)!=S.charAt(end)) {
				ans=0;
				break;
			}
			start++;
			end--;
		}
		
		return ans;
    }
}
