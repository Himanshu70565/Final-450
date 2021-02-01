import java.util.*;
public class FactorialOfLargeNumber {
	 
		public static void main (String[] args){
			long fact[]=new long[1001];
		    fact[0]=1;
		    
		    for(int i=1;i<=1000;i++){
	            fact[i]=i*fact[i-1];
	        } 
		    
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    
		    while(t--!=0){
		        int num=sc.nextInt();
		        System.out.println(fact[num]);
		    }
		 }
}
