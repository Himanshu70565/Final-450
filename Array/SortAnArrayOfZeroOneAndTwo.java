
public class SortAnArrayOfZeroOneAndTwo {
	
	public static void sort012(int array[], int n){
	
		int size=array.length;
		int start=0,end=size-1;
		
		for(int index=0;index<=end;index++) {
			
			if(array[index]==0) {
				swap(array, index, start);
				start++;
			}
			if(array[index]==2) {
				swap(array, index, end);
				end--;
			}
		}
	}
	
//	Swapping the element at i and jth position
	public static void swap(int array[],int i,int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
}
