import java.util.*; //Importing the collections
public class ParanthesisChecker {
	
	//{{}} true {{}] balanced  
	
	public static boolean ispar(String x){
		
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)=='('||x.charAt(i)=='['||x.charAt(i)=='{') {
				stack.push(x.charAt(i));
			}else if(x.charAt(i)==']'&&!stack.isEmpty()&&stack.peek()=='[') {
				stack.pop();
			}else if(x.charAt(i)==')'&&!stack.isEmpty()&&stack.peek()=='(') {
				stack.pop();
			}else if(x.charAt(i)=='}'&&!stack.isEmpty()&&stack.peek()=='{') {
				stack.pop();
			}else {
				return false;
			}
		}
		
        return stack.isEmpty();
    }
	
}
