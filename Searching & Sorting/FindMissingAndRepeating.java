public class FindMissingAndRepeating {

	public static int[] findTwoElement(int arr[], int n) {
        
        // 1^2^3^4
        int xor_1=arr[0];
        for(int i=1;i<=n;i++){
            xor_1=xor_1^i;
        }
        
        
        // (1^2^3^4)^(1^3^3^4)=(2^3)=(x^y)
        for(int i=1;i<n;i++){
            xor_1=xor_1^arr[i];
        }
        
        
        int rightMostSetBit=xor_1&~(xor_1-1);
        
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if((arr[i]&rightMostSetBit)!=0){
                x=x^arr[i];
            }else{
                y=y^arr[i];
            }
        }
        
        for(int i=1;i<=n;i++){
            if((i&rightMostSetBit)!=0){
                x=x^i;
            }else{
                y=y^i;
            }
        }
        
        
        int ans[]={x,y};
        return ans;
        
    }

}
