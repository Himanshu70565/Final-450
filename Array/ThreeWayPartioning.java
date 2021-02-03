
public class ThreeWayPartioning {
	 public void threeWayPartition(int array[], int a, int b)
	    {
	        int n=array.length;
	        int start=0,end=n-1;
	        
	        int i=0;
	        
	        while(i<=end){
	            
	            if(array[i]<a){
	                swap(array,i,start);
	                start++;
	            }else if(array[i]>b){
	                swap(array,i,end);
	                end--;
	                i--;
	            }
	            i++;
	        }

	    }
	    
	    public static void swap(int array[],int i,int j){
	        int temp=array[i];
	        array[i]=array[j];
	        array[j]=temp;
	    }
}
