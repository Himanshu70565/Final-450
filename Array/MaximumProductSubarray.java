
public class MaximumProductSubarray {
	
//	Approach 1 : Using 2 loops : T(O(n2))
	 long maxProduct(int[] arr, int n) {
	        
	        long max_pro=arr[0];
	        for(int i=0;i<n;i++){
	            long pro=1;
	            for(int j=i;j<n;i++){
	                pro=pro*arr[j];
	                if(pro>max_pro){
	                    max_pro=pro;
	                }
	            }
	        }
	    
	        return max_pro;
	    }
	
//	 Approach 2 : Using maxProduct and minProduct
	 long maxProduct2(int arr[],int n) {
		 
		 long maxVal,minVal,maxProduct;
		 
		 maxVal=minVal=maxProduct=arr[0];
		 
		 for(int i=1;i<n;i++) {
			 
			 if(arr[i]<0) {
				 long temp=maxVal;
				 maxVal=Math.max(arr[i], minVal*arr[i]);
				 minVal=Math.min(arr[i], temp*arr[i]);
			 }else {
				 maxVal=Math.max(arr[i], maxVal*arr[i]);
				 minVal=Math.min(arr[i], minVal*arr[i]);
			 }
			 
			 maxProduct=Math.max(maxProduct, maxVal);
		 }
		 return maxProduct;
		 
	 }
	 
}
