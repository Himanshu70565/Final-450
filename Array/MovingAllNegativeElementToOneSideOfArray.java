
public class MovingAllNegativeElementToOneSideOfArray {
	
	public static void movingPosNeg(int arr[]) {
		
		int size=arr.length;
		int start=0,end=size-1;
		
		for(int i=0;i<end;i++) {
			
			if(arr[i]<0) {
				swap(arr,i,start);
				start++;
			}else{
				swap(arr,i,end);
				end--;
				i--;
			}
		}
	}
	
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {-12, 11, -13, -5, 6, -7, 5, -3, 11 };
		
		movingPosNeg(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
