
public class FindMajorityElement {

	static int majorityElement(int arr[], int size){
        int count=0,majority=0;
        
        for(int i=0;i<size;i++){
            if(count==0){
                majority=arr[i];
            }
            if(majority==arr[i]){
                count++;
            }else{
                count--;
            }
        }
        if(count<=0){
                return -1;
        }
        return majority;
    }

}
