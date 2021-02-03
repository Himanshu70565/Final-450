import java.util.*;
public class TrappingRainWaterProblem {
	
	static int trappingWater(int arr[], int n) { 
        
		int right[]=rightMax(arr,n);
		int left[]=leftMax(arr,n);
		
		int sum=0;
		
		for(int i=1;i<n-1;i++) {
			
			int leftMax=left[i];
			int rightMax=right[i];
			
			if(leftMax==-1||rightMax==-1) {
				continue;
			}
			
			sum+=Math.min(leftMax, rightMax)-arr[i];
			
		}
		
		return sum;
    } 
	
	static int[] rightMax(int arr[],int n) {
		
		Stack<Integer> stack=new Stack<Integer>();
		int right[]=new int[n];
		right[n-1]=arr[n-1];
		
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		
		return right;
	}
	
	static int[] leftMax(int arr[],int n) {
		
		int left[]=new int[n];
		left[0]=arr[0];
		
		for(int i=1;i<n;i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		
	
		return left;
	
	}
	
	public static void main(String[] args) {
		
		int arr[]= {3,0,0,2,0,4};
		System.out.println(trappingWater(arr, arr.length));
		
	}
}
