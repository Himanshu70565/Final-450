
public class CyclicallyRotateArrayByOne {

	public static void rotate(int arr[], int n)
	{
	    int last_index=n-1;
	    int temp=arr[last_index];
	    
	    int i=last_index-1;
	    while(i>=0){
	        arr[i+1]=arr[i];
	        i--;
	    }
	    arr[0]=temp;
	}
	
}
