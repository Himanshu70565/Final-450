import java.util.*;
public class CommonElementInThreeArrays {
/*	
	//Approach 1  : Using HashMap T(o(n1+n2+n3)) Space=O(n1)
	ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3){
	    ArrayList<Integer> list=new ArrayList<Integer>();
		
			HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
			
			for(int i=0;i<n1;i++) {
				map.put(A[i], 1);
			}
			
			for(int i=0;i<n2;i++) {
				if(map.containsKey(B[i])) {
					map.put(B[i], 2);
				}
			}
			
			for(int i=0;i<n3;i++) {
				if(map.containsKey(C[i])) {
					int freq=map.get(C[i]);
					map.put(C[i],3);
					if(freq==2){
					    list.add(C[i]);
					}
				}
			}
			
			return list;
	        	
	}
*/
	
	public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
            int i=0,j=0,k=0;
            n1--;n2--;n3--;
            ArrayList<Integer> list=new ArrayList<Integer>();
            
            while(i<=n1&&j<=n2&&k<=n3){
            	
                    int top=Math.max(A[i],Math.max(B[j],C[k]));
                    
                    while(i<n1&&A[i+1]<=top){
                        i++;
                    }
                    
                    while(j<n2&&B[j+1]<=top){
                        j++;
                    }
                    
                    while(k<n3&&C[k+1]<=top){
                        k++;
                    }
                    
                    if(A[i]==B[j]&&B[j]==C[k]){
                        list.add(A[i]);
                    }
                    i++;j++;k++;
                
            }
        return list;
    }

	public static void main(String[] args) {
		
		int A[]= {1, 5, 10, 20, 40, 80};
		int B[]={6, 7, 20, 80, 100};
		int C[]={3, 4, 15, 20, 30, 70, 80, 120};
		
	    ArrayList<Integer> list=commonElements(A, B, C, A.length, B.length, C.length);	
		System.out.println("The answer is "+list.size());
		
	}
	
}
