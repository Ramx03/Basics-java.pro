import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str= sc.nextLine();
	    String str1= sc.nextLine();
	    char ch1[]=str.toCharArray();
	    char ch2[]= str1.toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    int n =ch1.length;
	    int m=ch2.length;
	    if(n!=m){
	        System.out.print("Not Anagram");
	    }
	    else if(!Arrays.equals(ch1,ch2)){
		System.out.print("Not Anagram");
	    }
	    else{
	        System.out.print("Anagram");
	    }
    }
	
}