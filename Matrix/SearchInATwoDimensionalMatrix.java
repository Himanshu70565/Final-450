/*
	Question : Search in a 2D Matrix
	Question Category: Medium
	Question Code : 74
*/
public class SearchInATwoDimensionalMatrix {
	 
	public static boolean searchMatrix(int[][] matrix, int target) { 
		
		int row=VerticalSearch(matrix, target);
		System.out.println(row);
		if(row<0) {
			return false;
		}
		
		return HorizontalSearch(matrix, target, row);
	}

	public static int VerticalSearch(int matrix[][],int target) {
		
		int start=0;
		int end=matrix.length-1;
		
		int ans=-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(matrix[mid][0]==target) {
				return mid;
			}else if(matrix[mid][0]<target) {
				ans=mid;
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
	
		return ans;
	}
	
	public static boolean HorizontalSearch(int matrix[][],int target,int row) {
		
		int start=0;
		int end=matrix[0].length-1;
		
		
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			if(matrix[row][mid]==target) {
				return true;
			}else if(matrix[row][mid]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		int matrix[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		
		boolean ans=searchMatrix(matrix, 55);
		System.out.println(ans);
		
	}
	
}
