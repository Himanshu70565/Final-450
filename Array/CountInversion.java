import java.util.*;
public class CountInversion {
	
	 public static int inversionCount(int arr[], int N){
	        return merge(arr, 0, N-1);
	 }
	 
	 public static int merge(int arr[],int start,int end) {
		 
		 int ans=0;
		 if(start<end) {
			
			int mid=(start+end)/2;
		
			ans+=merge(arr, start, mid);
			ans+=merge(arr, mid+1, end); 
			ans+=mergeSort(arr,start,end); 
		 
		 }
		 return ans;
	 }
	 
	 public static int mergeSort(int arr[],int start,int end) {
		
		 int count=0;
		 int mid=(start+end)/2;
		 int i=start,j=mid+1,k=0;
		 
		 int newArray[]=new int[end-start+1];
		 
		 while(i<=mid&&j<=end) {
			 if(arr[i]<=arr[j]) {
				 newArray[k++]=arr[i++];
			 }else {
				 newArray[k++]=arr[j++];
				 count+=mid-i+1;
			 }
		 }
		 
		 while(i<=mid) {
			 newArray[k++]=arr[i++];
		 }
		 
		 while(j<=end) {
			 newArray[k++]=arr[j++];
		 }
		 
		 for(i=0;i<newArray.length;i++) {
			 arr[i+start]=newArray[i];
		 }
		 
		 return count;
	 }

	 public static void main(String[] args) {
		int arr[]= {2,4,1,3,5};
		
		System.out.println(inversionCount(arr, arr.length));
	}	
}
