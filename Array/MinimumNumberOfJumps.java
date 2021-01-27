
public class MinimumNumberOfJumps {
	
	public static int minJumps(int[] arr){
    
		int n=arr.length;
		int sum[]=new int[n];
		
		helperFunction(arr,sum,n-1);
		for(int i=0;i<n;i++) {
			System.out.println(sum[i]);
		}
		return sum[0];
	}

/*	Recursive Approach	
public static void helperFunction(int arr[],int sum[],int index,int size) {
	
	    if(index>size){
	        return;
	    }
	
		if(index==size) {
			sum[index]=0;
			return;
		}
		
		helperFunction(arr, sum, index+1, size);
		
		if((index+arr[index])>=size) {
			sum[index]=1;
			return;
		}
		
		if(arr[index]==0){
		    sum[index]=-1;
		    return;
		}
		
		int min=Integer.MAX_VALUE,flag=0;
		
		for(int i=index+1;i<=(index+arr[index]);i++) {
		    if(sum[i]==-1){
		        continue;
		    }
		    flag=1;
			min=Math.min(min, sum[i]);
		}
		if(flag==0){
		    sum[index]=-1;
		    return;
		}
		if(min<0){
		    sum[index]=-1;
		    return;
		}
		sum[index]=1+min;
	}
*/

	public static void helperFunction(int arr[],int sum[],int size) {
		
		sum[size]=0;
		
		int index=size-1;
		while(index>=0) {
			
			if((index+arr[index])>=size) {
				sum[index]=1;
				index--;
				continue;
			}
			
			if(arr[index]==0) {
				sum[index]=-1;
				index--;
				continue;
			}
			
			int min=Integer.MAX_VALUE,flag=0;
			
			for(int i=(index+1);i<=(index+arr[index]);i++) {
				if(i>size) {
					break;
				}
				if(sum[i]==-1) {
					continue;
				}
				flag=1;
				min=Math.min(min, sum[i]);
			}
			
			
			if(flag==0||min<0) {
				sum[index]=-1;
			    index--;
			    continue;
			}
			sum[index]=1+min;
			index--;
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2 , 1 , 0 , 3};
		
		System.out.println(minJumps(arr));
	}
}
