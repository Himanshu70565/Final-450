
public class FindMedianOfTwoArrayOfEqualSizes {

	public static int median(int a[],int b[],int start_a,int end_a,int start_b,int end_b) {
		
		if(end_a-start_a==1&&end_b-start_b==1) {
			return (Math.max(a[start_a], b[start_b])+Math.min(a[end_a], b[end_b]))/2;
		}
		
		int m1_index=(end_a+start_a)/2;
		int m2_index=(end_b+start_b)/2;
		
		int m1=a[m1_index];
		int m2=b[m2_index];
		
		if(m1==m2) {
			return m1;
		}else if(m1<m2) {
			return median(a, b, m1_index, end_a, start_b, m2_index);
		}else {
			return median(a, b, start_a, m1_index, m2_index, end_b);
		}
		
	}
	
	public static void main(String[] args) {
		int array1[]= {1,12,15};
		int array2[]= {2,13,17,30,45};
		
		int size=array1.length;
		System.out.println(median(array1 ,array2, 0, size-1, 0, size-1));
	}
}
