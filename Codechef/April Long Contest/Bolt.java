import java.util.*;
public class Bolt {
	
	static String roundOffTo2DecPlaces(float val)
	{
	    return String.format("%.2f", val);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t--!=0) {
			float k1=sc.nextFloat();
			float k2=sc.nextFloat();
			float k3=sc.nextFloat();
			float v=sc.nextFloat();
			
			v=v*k1*k2*k3;
			v=100/v;
			
			String ans=roundOffTo2DecPlaces(v);
			float finalVal=Float.valueOf(ans);
//			System.out.println(finalVal);
			if(finalVal<=9.57) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
	}
}
