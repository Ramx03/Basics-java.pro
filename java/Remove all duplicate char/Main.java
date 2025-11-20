import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String  str= sc.nextLine();
	    StringBuilder SB = new StringBuilder();
	    HashSet<Character> hs= new HashSet<>();
	    for(char ch:str.toCharArray()){
	         if(!hs.contains(ch)){
	             hs.add(ch);
	             SB.append(ch);
	         }
	    }
		System.out.print(SB.toString());
	}
}
