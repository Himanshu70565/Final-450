
public class RearrangingArrayInAlternatingPositiveAndNegative {
	
	public static void solve(int arr[]) {
		rerrange(arr);
		
//		Initialize the negative starting
		int neg_start=1;
		if(arr[neg_start]>=0) {
			return;
		}
		
//		Initializing the positive starting
		int pos_start=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				pos_start=i;
				break;
			}
		}
		
		if(pos_start==-1) {
			return;
		}
		
		while(neg_start<pos_start&&neg_start<arr.length&&pos_start<arr.length) {
			swap(arr,neg_start,pos_start);
			neg_start+=2;
			pos_start+=1;
		}
		
	}
	
	public static void rerrange(int arr[]) {
		int size=arr.length-1;
		int start=0,end=size;
		int i=0;
		
		while(start<end) {
			
			if(arr[i]<0) {
				swap(arr,i,start);
				start++;
				i++;
			}else {
				swap(arr,i,end);
				end--;
			}
		}
	}
	
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {-5,-2,5,2,4,7,1,8,0,-8};
		solve(arr);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
