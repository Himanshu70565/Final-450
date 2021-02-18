import java.util.*;
public class MinimumSwapAndKPair {
	
	public static int minSwap (int arr[], int n, int k) {
		int good=0,bad=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<=k)
				good++;
		}
		bad=n-good;
	
		
		int start=0,end=good-1;
		int ans=0;
		for(int i=start;i<=end;i++) {
			if(arr[i]>k)ans++;
		}
		
		while(start<n&&end<n) {
			if(end==n-1) {
				break;
			}
			int newAns=find(arr,n,k,start+1,end+1);
			start++;
			end++;
			ans=Math.min(ans, newAns);
		}
		return ans;
	}
	
	public static int find(int arr[],int n,int k,int start,int end) {
		int ans=0;
		for(int i=start;i<=end;i++) {
			if(arr[i]>k)ans++;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[]= {10,12,20,20,5,19,19,12,1,20,1};
		System.out.println(minSwap(arr, arr.length, 1));
	}
	
}
