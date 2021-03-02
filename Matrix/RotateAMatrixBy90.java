
public class RotateAMatrixBy90 {

//	Given a square matrxi and we have to rotate it by 90
	public static void rotate(int matrix[][],int n,int m) {
		
		transpose(matrix,n,m);
		
		for(int i=0;i<n;i++) {
			rotateRow(matrix,i,m);
		}
		
	}
	
	public static void rotateRow(int matrix[][],int row,int m) {
		
		
		for(int i=0;i<=m/2;i++) {
			int temp=matrix[row][i];
			matrix[row][i]=matrix[row][m-i-1];
			matrix[row][m-i-1]=temp;
		}
		
	}
	
	public static void transpose(int matrix[][],int n,int m) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<m;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}

	public static void main(String[] args) {
		int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int n=matrix.length;
		int m=matrix[0].length;
		rotate(matrix, n, m);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
