import java.util.*;
public class AreIsomorphic {

//	Approach 1 :Using HashMap
	public static boolean areIsomorphic(String str1,String str2){
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		int matrix1[]=new int[26];
		for(int i=0;i<26;i++)
			matrix1[i]=-1;
		
		for(int i=0;i<str1.length();i++) {
			
			int num1=str1.charAt(i)-'a';
			int num2=str2.charAt(i)-'a';
			
			if(matrix1[num1]==-1) {
					matrix1[num1]=num2;
			}else {
				if(matrix1[num1]!=num2) {
					return false;
				}
			}
		}
		
		int matrix2[]=new int[26];
		for(int i=0;i<26;i++)
			matrix2[i]=-1;
		
		for(int i=0;i<str2.length();i++) {
			
			int num1=str1.charAt(i)-'a';
			int num2=str2.charAt(i)-'a';
			
			if(matrix2[num2]==-1) {
					matrix2[num2]=num1;
			}else {
				if(matrix2[num2]!=num1) {
					return false;
				}
			}
		}
		
		return true;
	
    }

}
