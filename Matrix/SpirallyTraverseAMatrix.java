import java.util.*;
public class SpirallyTraverseAMatrix {

	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
       
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		int row_start=0,row_end=r-1;
		int col_start=0,col_end=c-1;
		
		while(row_start<=row_end&&col_start<=col_end) {
			
			for(int j=col_start;j<=col_end;j++) {
				list.add(matrix[row_start][j]);
			}
			row_start++;
			
			if(row_start>row_end||col_start>col_end){
			    break;
			}
			
			for(int i=row_start;i<=row_end;i++) {
				list.add(matrix[i][col_end]);
			}
			col_end--;
			
			if(row_start>row_end||col_start>col_end){
			    break;
			}
			for(int j=col_end;j>=col_start;j--) {
				list.add(matrix[row_end][j]);
			}
			row_end--;
			
			if(row_start>row_end||col_start>col_end){
			    break;
			}
			for(int i=row_end;i>=row_start;i--) {
				list.add(matrix[i][col_start]);
			}
			col_start++;
		}
		
		
		return list;
    }
	
}
