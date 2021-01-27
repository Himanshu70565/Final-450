import java.util.*;
public class ReverseTheArray {

//	function for reversing a string
	public static String reverseWord(String str){
        
		String reverse="";
        
		for(int i=0;i<str.length();i++) {
			reverse=str.charAt(i)+reverse;
		}
        return reverse;
    }
	
//	function for reversing an array
	public static int [] reverseArray(int arr[]){
        int size=arr.length;
		for(int i=0;i<size/2;i++) {
			swap(arr,i,size-i-1);
		}
		return arr;
    }
	
//	swapping in array at index i and j
	public static void swap(int arr[],int i,int j) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
}
