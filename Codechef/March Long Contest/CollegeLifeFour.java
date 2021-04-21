import java.util.Scanner;

public class CollegeLifeFour {
	
	public static int solution(int N,int E,int H,int A,int B,int C) {
		if(N<=0) {
			return 0;
		}
		
		int option1,option2,option3;
		
		int min=Integer.MAX_VALUE;
		if(E>=2) {
			option1=A+solution(N-1, E-2, H, A, B, C);
			min=Math.min(option1, min);
		}
		
		if(H>=3) {
			option2=B+solution(N-1, E, H-3, A, B, C);
			min=Math.min(option2, min);
		}
		
		if(E>=1&&H>=2) {
			option3=C+solution(N-1, E-1, H-1, A, B, C);
			min=Math.min(option3, min);
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int N=sc.nextInt();
			int E=sc.nextInt();
			int H=sc.nextInt();
			int A=sc.nextInt();
			int B=sc.nextInt();
			int C=sc.nextInt();
			int ans=solution(N ,E ,H ,A ,B ,C);
			if(ans<0) {
				System.out.println("-1");
			}else {
				System.out.println(ans);
			}
		}
		
	}
}	
