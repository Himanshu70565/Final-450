import java.util.*;
public class FindDuplicatesCharacterInString {
	
	public static void printDuplicatesAndCount(String input) {
	
		int frequency[]=new int[26];
		
		for(int i=0;i<input.length();i++) {
			int index=input.charAt(i)-'a';
			if(index>=0&&index<=25) {
				frequency[index]+=1;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(frequency[i]>1) {
				int ascii=i+'a';
				char ch=(char) ascii;
				System.out.println(ch+" "+frequency[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		String str="geeks for geeks";
		printDuplicatesAndCount(str);
	}
}
