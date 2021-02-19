import java.util.*;
public class ValueEqualToIndexValue {
	ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
	    
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            if(arr[i]==(i+1)){
                list.add(arr[i]);
            }
        }
        return list;
    }
}	
