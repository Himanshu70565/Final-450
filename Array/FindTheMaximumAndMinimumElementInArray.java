import java.util.*;

class Pair{
	int max,min;
	public Pair(int max,int min) {
		this.max=max;
		this.min=min;
	}
}
public class FindTheMaximumAndMinimumElementInArray {
	
//	Using Iterative Approach
	public static Pair maxAndMin1(int arr[]) {
		
		int max,min;
		if(arr[0]>arr[1]) {
			max=arr[0];
			min=arr[1];
		}else{
			min=arr[0];
			max=arr[1];
		}
		
		for(int i=2;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
				continue;
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
	
		return new Pair(max,min);
	}
	
//	Tournament Approach
	public static Pair maxAndMin2(int arr[]) {
		
		int start=0;
		int end=arr.length-1;
		
		return helper(arr, start, end);
	}
	
//	Helper method for Tournament Approach
	public static Pair helper(int arr[],int start,int end) {
		if(start==end) {
			return new Pair(arr[start], arr[end]);
		}
			
		int mid=(start+end)/2;
			
		Pair leftAns=helper(arr, start, mid);
		Pair rightAns=helper(arr, mid+1, end);
			
		Pair finalAns=new Pair(Math.max(leftAns.max, rightAns.max),Math.min(leftAns.min, rightAns.min));
		return finalAns;
	}
	
	public static void main(String[] args) {
	
		int arr[]= {1,2,0,-1,24,-11};
		Pair ans=maxAndMin2(arr);
		
		System.out.println(ans.max+" "+ans.min);
		
	}

}
