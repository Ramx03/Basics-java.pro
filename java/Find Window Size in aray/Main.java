import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n =sc.nextInt(), arr[]= new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]= sc.nextInt();
	    }
	    int k =sc.nextInt();
	    ArrayList<Integer> Al= windowcount(arr,k);
	    for(int ele:Al){
		System.out.print(ele+" ");
     	}
	}
	public static ArrayList<Integer> windowcount(int arr[],int k){
	    int m=arr.length;
	    ArrayList<Integer> res= new ArrayList<>();
	    for(int i=0;i<=m-k;i++){
	        HashSet<Integer> hs= new HashSet<>();
	        for(int j=i;j<i+k;j++){
	            hs.add(arr[j]);
	        }
	        res.add(hs.size());
	    }
	    return res;
	}
	
}
