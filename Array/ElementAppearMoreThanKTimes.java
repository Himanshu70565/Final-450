import java.util.*;
public class ElementAppearMoreThanKTimes {
	
//	T : O(nlogn+n=nlogn) Space:)(1)
	public static ArrayList<Integer> approach1(int arr[],int n,int k){
		
		Arrays.sort(arr);
		ArrayList<Integer> list=new ArrayList<Integer>();
		int freq=n/k;
		
		for(int i=0;i<n;i++) {
			int j=i,count=0;
			while(j<n&&arr[j]==arr[i]) {
				count++;
				j++;
			}
			if(count>=freq) {
				list.add(arr[i]);
			}
			i=j;
			i--;
		}
		
		return list;
	}
	
//	T : o(n) Space(O(k))
	public static ArrayList<Integer> approach2(int arr[],int n,int k){
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		int req_freq=n/k;
		
		if(req_freq==1) {
//		 Return the array
		}
		
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				int freq=map.get(arr[i]);
				freq++;
				map.put(arr[i], freq);
				if(freq>=req_freq) {
					list.add(arr[i]);
				}
				
			}else {
				map.put(arr[i], 1);
			}
		}
		return list;
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {3,2,4,1,2,3,0,5};
		int k=4;
		ArrayList<Integer> list;
		
		list=approach2(arr, arr.length, k);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
	
}
