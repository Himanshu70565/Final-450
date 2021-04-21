import java.util.*;
public class StrongLanguage {
	
	public static int maxContinousSameCharacter(String str,int n) {
		int max=0;
		
		int i=0;
		while(i<n) {
			if(str.charAt(i)=='*') {
				int count=0;
				while(i<n&&str.charAt(i)=='*') {
					count++;
					i++;
				}
				max=Math.max(max, count);
			}
			i++;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t--!=0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			String str=sc.next();
			int maxCount=maxContinousSameCharacter(str, n);
			if(maxCount>=k) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
