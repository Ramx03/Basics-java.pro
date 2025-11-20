import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    int arr[]= new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int k=sc.nextInt();
	    k=k%10;
	    int start=0;
	    int end=arr.length-1;
	   // while (start < end) {             //reverse array 
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
	   // }
	    start=0;                          //right rotation 
	     end=arr.length-1; 
	    while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
	    }
	   //  start=k;
	   //  end=arr.length-1;
	   // while (start < end) {
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
	   // }
        System.out.println(Arrays.toString(arr)); 
 }
}
