
import java.util.*;
public class ChocolateDistributionProblem {
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     
	     while(t--!=0){
	         
	         int n=sc.nextInt();
	         int arr[]=new int[n];
	         for(int i=0;i<n;i++){
	             arr[i]=sc.nextInt();
	         }
	         int m=sc.nextInt();
	         
	         Arrays.sort(arr);
	         
	         int min_diff=arr[m-1]-arr[0];
	         for(int i=0;i<n;i++){
	             if(i+m-1<n){
	                    min_diff=Math.min(min_diff,arr[i+m-1]-arr[i]);
	             }
	         }
	         System.out.println(min_diff);
	         
	     }
	 }
}
