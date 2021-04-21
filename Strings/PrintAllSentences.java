import java.util.ArrayList;

public class PrintAllSentences {
	 public static void printAllCombinations(ArrayList<ArrayList<String>> list,int currentListIndex,String str){

	        if(currentListIndex==list.size()){
	            System.out.println(str);
	            return;
	        }

	        ArrayList<String> currentList=list.get(currentListIndex);

	        for(int i=0;i<currentList.size();i++){
	            String currentString=currentList.get(i);
	            printAllCombinations(list,currentListIndex+1,str+currentString+" ");
	        }
	  }
	
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>();
     
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("you");
		list1.add("we");
		list.add(list1);
		
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("have");
		list2.add("are");
		list.add(list2);
		
		ArrayList<String> list3= new ArrayList<String>();
		list3.add("sleep");
		list3.add("eat");
		list3.add("drink");
		list.add(list3);
		

     printAllCombinations(list,0,"");
	}
}
