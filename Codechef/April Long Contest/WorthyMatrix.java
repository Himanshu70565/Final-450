import java.util.*;
public class WorthyMatrix {
	
	public static long countSum(long matrix[][],int n,int m,long k) {
		
		long storage[][]=new long[n+1][m+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				storage[i][j]=storage[i][j-1]+matrix[i-1][j-1];
			}
		}
		
		for(int j=1;j<=m;j++) {
			for(int i=1;i<=n;i++) {
				storage[i][j]=storage[i-1][j]+storage[i][j];
			}
		}
		
		
		long count=0;
		for(int size=1;size<=Math.min(n, m);size++) {
			for(int i=size;i<=n;i++) {
				for(int j=size;j<=m;j++) {
					
						int min_x=i-size;
						int min_y=j-size;
						
						double ans=storage[i][j]-storage[min_x][j]-storage[i][min_y]+storage[min_x][min_y];
						ans=ans/(size*size);
						
						if(ans>=k) {
							count++;
						}
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			long k=sc.nextLong();
			
			long matrix[][]=new long[n][m];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					matrix[i][j]=sc.nextLong();
				}
			}
			
			long ans=countSum(matrix, n, m, k);
			System.out.println(ans);
			
	   }	
	}
}
