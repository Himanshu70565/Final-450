
public class SmallestSubarrayWithGreaterThanX {
	
    public static long sb(long arr[], int n, long x) {

    	int i=0,j=0;
    	int minElement=n;
    	
    	long sum=0;
    	while(i<n&&j<n) {
    		sum+=arr[j];
    		if(sum>x) {
    			
    			while(i<=j&&(sum-arr[i])>x) {
    				sum=sum-arr[i];
    				i++;
    			}
    			minElement=Math.min(minElement, j-i+1);
    		}
    		j++;
    	}
    	return minElement;
    }

}
