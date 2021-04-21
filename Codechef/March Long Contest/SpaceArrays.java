import java.util.PriorityQueue;
import java.util.Scanner;

public class SpaceArrays {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
			int n=sc.nextInt();
			int array[]=new int[n+1];
			PriorityQueue<Integer> pq=new PriorityQueue<Integer>();	
			
			for(int i=0;i<n;i++) {
				int num=sc.nextInt();
				int freq=array[num];
				if(freq>0) {
//					Add this element to the Priority Queue
					pq.add(num);
				}
				array[num]++;
			}
			
			int count=0;
			for(int i=1;i<=n;i++) {
				if(array[i]==0) {
					int num=pq.poll();
					if(num<i) {
						count+=(i-num);
					}else {
						count=0;
						break;
					}
				}
			}
			
			if(count%2==0) {
				System.out.println("Second");
			}else {
				System.out.println("First");
			}

			
		}
	}
}
