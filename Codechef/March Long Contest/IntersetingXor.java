import java.util.*;

public class IntersetingXor {
	
	public static long countBits(long n) {
		long count=0;
		while(n!=0) {
			n=n/2;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();	
		while(t--!=0) {
			long n=sc.nextLong();
			long size=countBits(n);
			
			long factor=0;
			long A=0,B=0;
			
			for(long i=size-1;i>=0;i--) {
				factor=(long)Math.pow(2, i);
				long rem=(1<<i)&(n);

				if(rem==0) {
					A+=factor;
					B+=factor;
				}else{
					
					long option1=(A+factor)*B;
					long option2=A*(B+factor);
					
					long max=Math.max(option1, option2);
					if(max==option1) {
						A=A+factor;
					}else {
						B=B+factor;
					}
				}
			}
			System.out.println(A*B);
		}
	}
}
