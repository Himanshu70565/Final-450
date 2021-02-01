public class SubarrayWithZeroSum {

	static boolean findsum(int arr[],int n){
	
//		return helper(arr,0,n-1,0,0);
	
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum==0) {
					return  true;
				}
			}
		}
		return false;
	}
	
//	When we have to find a subarray with 0 sum
	public static boolean helper(int arr[],int index,int size,int sum,int count) {
		if(index>size) {
			if(sum==0&&count!=0) {
				return true;
			}
			return false;
		}
		
		
		boolean option1=helper(arr, index+1, size,sum+arr[index],count+1);
		boolean option2=helper(arr, index+1, size, sum,count);
		
		return option1||option2;
		
	}
	
}
