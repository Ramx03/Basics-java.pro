import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine().toLowerCase();
		HashSet<Character> hs= new HashSet<>();
		for(int i=0;i<str.length();i++){
		    char ch= str.charAt(i);
		    if(ch>='a'&&ch<='z'){
		        hs.add(ch); // panagram string contains a to z
		    }
		}
		if(hs.size()==26){
		    System.out.println(hs+" "+"String is panagram");
		}
		else{
		    
		System.out.println(hs+" "+"String is not a panagram");
		}
	}
}
