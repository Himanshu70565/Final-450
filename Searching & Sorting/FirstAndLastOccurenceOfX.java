import java.util.*;
public class FirstAndLastOccurenceOfX {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t--!=0){
	         
	         int size=sc.nextInt();
	         int element=sc.nextInt();
	         
	         int first=-1,last=-1;
	         
	         
	         for(int i=0;i<size;i++){
	             int num=sc.nextInt();
   	             if(num==element){
       	                 if(first==-1){
       	                        first=last=i;
       	                 }else{
       	                         last=i;
       	                 }
   	             }
	         }
	         if(first==-1){
	             System.out.println("-1");
	         }else{
	            System.out.println(first+" "+last);
	         }
	     }   
	}
}
