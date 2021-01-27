import java.util.Collections;
import java.util.PriorityQueue;

public class kthMaximumAndMinimumElementOfArray {

/*
 	Different Approaches that we can follow : 
 	Approach 1 : First Sort the Array and then use arr[k-1] ,arr[n-k]
 	Approach 2 : Using Min Heap or Max Heap
*/
	
//	Case 1 : If the Array is sorted
	public static Pair approach1(int arr[],int k) {
		
		int size=arr.length;
		int kthSmallest=arr[k-1];
		int kthLargest=arr[size-k];
		
		return new Pair(kthSmallest,kthLargest);
		
	}
	
//	Case 2  : If the Array is not sorted
	public static Pair approach2(int arr[],int k) {
		
		int l=0;
		int r=arr.length-1;
		return new Pair(kthSmallest(arr, l, r, k),kthLargest(arr, l, r, k));
	}
	
	public static int kthSmallest(int[] arr, int l, int r, int k) { 
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		
		for(int i=l;i<=r;i++) {
			queue.add(arr[i]);
		}
		
		int smallest=-1;
		while(k>0) {
			smallest=queue.poll();
			k--;
		}
		
		return smallest;
	} 

	public static int kthLargest(int arr[], int l, int r, int k) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=l;i<=r;i++) {
			queue.add(arr[i]);
		}
		
		int largest=-1;
		while(k>0) {
			largest=queue.poll();
			k--;
		}
		
		return largest;
	}
}	
