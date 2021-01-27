import java.util.*;
public class FindTheDuplicateNumber {

/*	
//	Approach 1 : Using HashMap
	public int findDuplicate(int[] nums) {
    
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				return nums[i];
			}else {
				map.put(nums[i], 1);
			}
		}
		
		return nums[0];
    }
*/

/*	
//	Approach 2 ; Using Sorting the Array	
	public int findDuplicate(int nums[]) {
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				return nums[i];
			}
		}
		
		return nums[nums.length-1];
	}
*/

//	Approach 3 : Using Linked list Cycle Detection Algo
	public int findDuplicate(int nums[]) {
	
		int slow=nums[0];
		int fast=nums[0];
		
		do {
			slow=nums[slow];
			fast=nums[nums[fast]];
		}while(slow!=fast);
		
		fast=nums[0];
		
		while(slow!=fast) {
			slow=nums[slow];
			fast=nums[fast];
		}
		
		return slow;
	}
	
}
