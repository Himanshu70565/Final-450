import java.util.*;
public class arraySubsetOfAnother {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t--!=0){
	         Set<Integer> set=new HashSet<Integer>();
	         
	         int n=sc.nextInt();
	         int m=sc.nextInt();
	         
	         for(int i=0;i<n;i++){
	             set.add(sc.nextInt());
	         }
	         
	         String ans="Yes";
	         for(int j=0;j<m;j++){
	             int x=sc.nextInt();
	             if(!set.contains(x)){
	                 ans="No";
	             }
	         }
	         System.out.println(ans);
	     }	
	}
}
