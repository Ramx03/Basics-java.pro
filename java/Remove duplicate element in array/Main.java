import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n =sc.nextInt();
	    int arr[]= new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int m=sc.nextInt();
	    //HashSet<Integer> hs= new HashSet<>();
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]!=m){
		        System.out.print(arr[i]+" ");
	          //  hs.remove(m);
	        }
	    }
	   // for(int i:hs){
	  //  }
	}
}