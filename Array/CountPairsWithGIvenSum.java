import java.util.*;
public class CountPairsWithGIvenSum {
	 
	public static int getPairsCount(int[] arr, int n, int k) {
	
		int count=0;
		Arrays.sort(arr);
		int start=0,end=n-1;
		
		while(start<end) {
			
			if((arr[start]+arr[end])==k) {

				int first=0,second=0;
				int i=start,j=end;
				
				while(i<end&&arr[i]==arr[start]) {
					first++;
					i++;
				}
				
				while(j>start&&arr[j]==arr[end]) {
					second++;
					j--;
				}
				
				count+=first*second;
				start=i;
				end=j;
				
			}else if((arr[start]+arr[end])<k) {
				start++;
			}else {
				end--;
			}
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,5,1,7,1};
		
		System.out.println(getPairsCount(arr, arr.length, 6));
		
	}
}
