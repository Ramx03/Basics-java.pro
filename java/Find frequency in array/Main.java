import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[]= new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int frequencyarray[]= new int[1001];
	    for(int i=0;i<n;i++){
	       frequencyarray[arr[i]]++;
	    }
	    for(int i=0;i<frequencyarray.length;i++){
	       if(frequencyarray[i]!=0){
		     System.out.println(i+"  "+frequencyarray[i]+" "); 
	       } 
	    }
	}
}
