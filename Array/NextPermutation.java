
public class NextPermutation {
	 
	 public static  void nextPermutation(int[] nums) {
	 
		 int size=nums.length-1;
		 int index1=-1;
		 
//		 Step 1 : Find index such that nums[index1]<nums[index1+1] 
		 for(int i=size-1;i>=0;i--) {
			 if(nums[i]<nums[i+1]) {
				 index1=i;
				 break;
			 }
		 }
		 
		 if(index1==-1) {
			 reverse(nums,0,size);
			 return;
		 }
		 
//		 Step 2 : Find a value in right side of index1 such that its value is greater than index1 
		 int index2=-1;
		 for(int i=size;i>=index1;i--) {
			 if(nums[i]>nums[index1]) {
				 index2=i;
				 break;
			 }
		 }
		 
//		 Step 3 : Swapping element at index1 and index2
		 swap(nums,index1,index2);
		 
//		 Step 4 : Reversing the array from index1+1 to end
		 reverse(nums,index1+1,size);
	 }

	 public static void swap(int array[],int i,int j) {
		 int temp=array[i];
		 array[i]=array[j];
		 array[j]=temp;
	 }

	 public static void reverse(int array[],int start,int end) {
		
		 int k=0;
		 for(int i=0;i<=(end-start)/2;i++) {
			 swap(array,i+start,end-i);
			 k++;
		 }
		 
	 }
 
	 public static void main(String[] args) {
	
		 int array[]= {1,2,3,5};

		 for(int i=0;i<24;i++) {
			 nextPermutation(array);
			 for(int j=0;j<array.length;j++) {
				 System.out.print(array[j]+" ");
			 }	 
			 System.out.println();
		 }
		 
		 
	 }

}
