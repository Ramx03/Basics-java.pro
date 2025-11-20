 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[]= new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int midelement=n/2;
	    if(n%2==1){
	        System.out.print(arr[midelement]);
	    }
	    else{
	        int average=(arr[midelement-1]+arr[midelement])/2;
		    System.out.println(average);
	        
	    }
	}
}