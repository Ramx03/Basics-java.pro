import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt(), arr[]= new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	   // ArrayList<Integer> Aleven= new ArrayList<>();
	   // ArrayList<Integer> Alodd= new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         if(arr[i]%2==0){
    //             Aleven.add(arr[i]);
    //         }
    //         else{
    //             Alodd.add(arr[i]);
    //         }
    //     }
        
        //// 
        
	   int odd=0, even=0;
	   // for(int i=0;i<n;i++){
	   //     if(arr[i]%2==0){
	   //         Al.add(arr[i]);
	   //     }
	   //     else{
	   //         Al.add(arr[i]);
	   //     }
	   // }
	   // for(int i:Al){
	   //     if(i%2==0){
	   //         even++;
	   //     }
	   //     else{
	   //         odd++;
	   //     }
	   // }
	   for(int i=0;i<n;i++){
	       if(arr[i]%2==0){
	           even++;
	       }
	       else{
	           odd++;
	       }
	   }
	   System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
	   //  System.out.println("Number of even numbers: " + Aleven.size());
    //     System.out.println("Number of odd numbers: " + Alodd.size());
	}
}
