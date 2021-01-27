
public class ContigousSubarrayWithMaximumSum {
	
//	Approach 1: Using Two Loops O(n^2)
	public static int maximumSum(int arr[],int n) {
		
		int max_sum=arr[0];
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum>max_sum) {
					max_sum=sum;
				}
			}
		}
		
		return max_sum;
	}
	
	
//	Approach 2 : Using Kadanes Algo
	public static int KadanesAlgo(int arr[],int n) {
		
		int sum=0,max_sum=arr[0];
		
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(max_sum<sum) {
			   max_sum=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		return max_sum;
	}
	
}
