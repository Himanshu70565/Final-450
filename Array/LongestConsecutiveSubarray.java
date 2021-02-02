import java.util.*;
public class LongestConsecutiveSubarray {
	
//	Approach 1 : T(O(nlogn)) 
	static int findLongestConseqSubseq(int arr[], int n)
	{
	  
	  Arrays.sort(arr);
	  
	  int answer[]=new int[n];
	  answer[0]=1;
	  
	  for(int i=1;i<n;i++){
	      answer[i]=1;
	      if(arr[i]==arr[i-1]+1){
	          answer[i]=Math.max(answer[i],answer[i-1]+1);
	      }
	      if(arr[i]==arr[i-1]){
	          answer[i]=answer[i-1];
	      }
	  }
	  
	  int max=1;
	  for(int i=0;i<n;i++){
	      max=Math.max(answer[i],max);
	  }
	  return max;
	}

	static int findLongestConseqSubseq2(int arr[],int n) {
		Set<Integer> set=new TreeSet<Integer>();
		
		for(int i=0;i<n;i++) {
			set.add(arr[i]);
		}
		
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		int max=1;
		
		for(Integer x:set) {
			if(map.containsKey(x-1)) {
				int freq=map.get(x-1);
				map.put(x, freq+1);
				max=Math.max(max, (freq+1));
			}else {
				map.put(x, 1);
			}
		}
		
		
		return max;
	}

}
