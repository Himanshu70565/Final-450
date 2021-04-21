import java.util.*;
public class BinaryString {
	
	public static void findSubstrings(String str,String ans,int start,HashMap<Integer,Integer> list){
		if(start==str.length()) {
			if(ans=="") {
				return;
			}
			list.put(Integer.parseInt(ans, 2),0);
			return;
		}
		
		findSubstrings(str, ans+str.charAt(start), start+1,list);
		findSubstrings(str, ans, start+1,list);
	}
	
	public static String binaryValue(int num) {
		if(num==0) {
			return "0";
		}
		String ans="";
		while(num!=0) {
			int rem=num%2;
			ans=rem+ans;
			num=num/2;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t--!=0) {
		
			String str=sc.next();
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			findSubstrings(str, "", 0,map);
			
			for(int i=0;i<=1023;i++) {
				if(!map.containsKey(i)) {
					String ans=binaryValue(i);
					System.out.println(ans);
					break;
				}
			}
			
		}
	}
}
