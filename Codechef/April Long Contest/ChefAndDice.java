import java.util.*;
public class ChefAndDice {
	
	public static long forLessThanFour(long n) {
		if(n==1) {
			return 20; //21-1=20
		}
		if(n==2) {
			return 36; //(21*2)-(1+1)-(2+2)=42-6=36
		}
		if(n==3) {
			return 51; //(21*3)-(1+1+1)-(2+2)-(2+3)=63-3-4-5=51
		}
		if(n==4) {
			return 60; //(21)*4-(1+1+1+1)-(2+3)-(2+3)-(2+3)-(2+3)=84-4-20=60
		}
		return 0; //for handling greater than 4 
	}
	
	public static long forGreaterThanFour(long no_of_dices) {	
		long remaining=no_of_dices%4;
		return (4-remaining)*4+forLessThanFour(remaining);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
		
			long no_of_dices=sc.nextLong();
			
			if(no_of_dices<=4) {
				long ans=forLessThanFour(no_of_dices);
				System.out.println(ans);
				continue;
			}
			
			long total_floor=no_of_dices/4;
			long ans=total_floor*(44); // 5 and 6 ko bahaar
			long remainingFactor=forGreaterThanFour(no_of_dices);
			System.out.println(ans+remainingFactor);
		}
	}
}	
