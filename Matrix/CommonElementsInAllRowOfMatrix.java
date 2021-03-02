import java.util.*;
public class CommonElementsInAllRowOfMatrix {
	
	public static Set<Integer> commonElements(int matrix[][],int m,int n) {
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		int row=0;
		for(int col=0;col<n;col++) {
			map.put(matrix[row][col], 1);
		}
		
		for(row=1;row<m-1;row++) {
			for(int col=0;col<n;col++) {
				if(map.containsKey(matrix[row][col])) {
					int freq=map.get(matrix[row][col]);
					if(freq!=(row+1)) {
						map.put(matrix[row][col], freq+1);
					}
				}
			}
		}
		
		
		
		Set<Integer> set=new HashSet<Integer>();
		for(int col=0;col<n;col++) {
			if(map.containsKey(matrix[row][col])) {
				int freq=map.get(matrix[row][col]);
				if(freq==(m-1)) {
					set.add(matrix[row][col]);
				}
			}
		}
		
		return set;
	}
	
	public static void main(String[] args) {
	
		int matrix[][]={{1, 2, 1, 4, 8},
	             		{2, 7, 8, 5, 1},
	             		{8, 7, 7, 3, 2},
	             		{8, 3, 2, 7, 9},
	            		};
		
		Set<Integer> set=commonElements(matrix, 4, 5);
		System.out.println(set);
	}
}
