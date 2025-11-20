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
		HashMap<Integer,Integer> hs= new HashMap<>();
		for(int i=0;i<arr.length;i++){
		    if(hs.containsKey(arr[i])){
		        hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
		    }
		    else{
		        hs.put(arr[i],1);
		    }
		}for(Map.Entry<Integer,Integer>hl:hs.entrySet()){
		System.out.println(hl+" ");
		}
	}
}