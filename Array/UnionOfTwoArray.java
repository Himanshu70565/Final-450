import java.util.*;
public class UnionOfTwoArray {
	
/*	
//	Approach 1 : Using HashMap T=O(n+m) Auxillary Space=(n+m)
	public static int doUnion(int a[], int n, int b[], int m) {
	    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	    
	    for(int i=0;i<n;i++) {
	    	if(!map.containsKey(a[i])) {
	    		map.put(a[i], 1);
	    	}
	    }
	    
	    for(int i=0;i<m;i++) {
	    	if(!map.containsKey(b[i])) {
	    		map.put(b[i],1);
	    	}
	    }
		
	    return map.size();
	}
	
	public static int doIntersection(int a[], int n, int b[], int m) {
	    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	    
	    for(int i=0;i<n;i++) {
	    	if(!map.containsKey(a[i])) {
	    		map.put(a[i], 1);
	    	}
	    }
	    
	    int count=0;
	    for(int i=0;i<m;i++) {
	    	if(map.containsKey(b[i])) {
	    		count++;
	    	}
	    }
		
	    return count;
	}
*/

//	Approach 2 :Suing sorting and then traversing  	
	public static int doUnion(int a[], int n, int b[], int m) {
		
//		Sort the both arrays first 
			Arrays.sort(a);
			Arrays.sort(b);
		
			int i=0,j=0,count=0;
			
			while(i<n&&j<m) {
				if(a[i]==b[j]) {
					count++;
					while(i<n-1&&a[i]==a[i+1]) {
						i++;
					}
					while(j<m-1&&b[j]==b[j+1]) {
						j++;
					}
					i++;
					j++;
				}else if(a[i]<b[j]) {
					count++;
					while(i<n-1&&a[i]==a[i+1]) {
						i++;
					}
					i++;
				}else if(a[i]>b[j]) {
					count++;
					while(j<m-1&&b[j]==b[j+1]) {
						j++;
					}
					j++;
				}
			}
			
			while(i<n) {
				count++;
				i++;
			}
			
			while(j<m) {
				count++;
				j++;
			}
		
	    	return count;
	}
	
	public static void main(String[] args) {
	
		int a[]= {85,25,1,32,54,6};
		int b[]= {2,85};
	
		System.out.println(doUnion(a, a.length, b, b.length));
//		System.out.println(doIntersection(a, a.length, b, b.length));
		
	}
	
}
