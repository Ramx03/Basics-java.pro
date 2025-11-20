 import java.util.*;
public class Main
{
    public static void print(long n) {
	    if(n>100){
	        return;
	    }
		System.out.print(n+" ");
	        print(n+1);
	    
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long n =sc.nextLong();
	    print(n);
	}
}
