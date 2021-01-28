import java.util.*;
class Pair{
	int start,end;
	public Pair(int start,int end) {
		this.start=start;
		this.end=end;
	}
}
public class MergingOfIntervals {
	
	public static int[][] merger(int [][]intervals){
		
		int n=intervals.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(intervals[j][0]>intervals[j+1][0]) {
					
					int temp1=intervals[j][0];
					intervals[j][0]=intervals[j+1][0];
					intervals[j+1][0]=temp1;
					
					int temp2=intervals[j][1];
					intervals[j][1]=intervals[j+1][1];
					intervals[j+1][1]=temp2;
					
					
				}
			}
		}
		
		ArrayList<Pair> list=mergeHelper(intervals);
		
		int matrix[][]=new int[list.size()][2];
		
		for(int i=0;i<list.size();i++) {
			Pair p=list.get(i);
			matrix[i][0]=p.start;
			matrix[i][1]=p.end;
		}
		
		return matrix;
	}
	
	public static ArrayList<Pair> mergeHelper(int[][] intervals) {
	 
		ArrayList<Pair> list=new ArrayList<Pair>();
		
		int start=intervals[0][0];
		int end=intervals[0][1];
		
		for(int i=1;i<intervals.length;i++) {
			if(intervals[i][0]<=end) {
				end=Math.max(end, intervals[i][1]);
			}else {
				Pair p=new Pair(start,end);
				list.add(p);
				start=intervals[i][0];
				end=intervals[i][1];
			}
		}
		Pair p=new Pair(start,end);
		list.add(p);
		
		return list;
	}
	
	public static void main(String[] args) {
	
		int intervals[][]= {{1,4},{4,5}};
		
	}
}
