class TrieNode{
	
	char data;
	TrieNode children[];
	boolean isTerminating;
	
	public TrieNode(char data) {
		this.data=data;
		this.children=new TrieNode[26];
		this.isTerminating=false;
	}
}
class Trie{
	
	TrieNode root;
	
	public Trie() {
		this.root=new TrieNode('/');
	}
	
	public void add(String str) {
		addHelper(str,0,str.length(),root);
	}
	
	public void addHelper(String str,int start,int n,TrieNode root) {
		if(start==n) {
			root.isTerminating=true;
			return;
		}
		
		int childIndex=str.charAt(start)-'a';
		TrieNode child=root.children[childIndex];
		
		if(child==null) {
			child=new TrieNode(str.charAt(start));
			root.children[childIndex]=child;
		}
		addHelper(str, start+1, n, child);
	}
	
	public boolean search(String str) {
		return searchHelper(str,0,root);
	}
	
	public boolean searchHelper(String str,int start,TrieNode root) {
		if(start==str.length()) {
			return root.isTerminating;
		}
		
		int childIndex=str.charAt(start)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) {
			return false;
		}
		
		return searchHelper(str, start+1, child);
	}
}
public class RotationOfString {
	
	public static boolean solution(String str1,String str2) {
		int n=str1.length();
		Trie trie=new Trie();
		
		for(int i=0;i<n;i++) {
			String x=str1.substring(i);
			String y=str1.substring(0,i);
			String z=x+y;
			trie.add(z);
		}
		
		return trie.search(str2);
	}
	
	public static void main(String[] args) {
		String str1="abcd";
		String str2="cdab";
		
		boolean ans=solution(str1, str2);
		System.out.println(ans);
	}
}
