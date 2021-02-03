import java.util.*;
public class TripletSumInArray {
	 public static int find3Numbers(int arr[], int n, int X) { 
		    
	        Arrays.sort(arr);
	        
	        for(int i=0;i<n-2;i++){
	            boolean ans=isExist(arr,i+1,n-1,X-arr[i]);
	            if(ans){
	                return 1;
	            }
	        }
	        
	        return 0;
	    }
	    
	    public static boolean isExist(int arr[],int start,int end,int sum){
	        
	        while(start<end){
	            
	            if((arr[start]+arr[end])==sum){
	                return true;
	            }else if((arr[start]+arr[end])>sum){
	                end--;
	            }else{
	                start++;
	            }
	        }
	        return false;
	    }
	    
}
