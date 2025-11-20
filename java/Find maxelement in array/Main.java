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
		int maxfre=0;
		int maxele=-1;
		for(int i=0;i<arr.length;i++){
		    if(hs.containsKey(arr[i])){
		        hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
		    }
		    else{
		        hs.put(arr[i],1);
		    }
		    if(hs.get(arr[i])>maxfre){
		        maxfre=hs.get(arr[i]);
		        maxele=arr[i];
		    }
		}
		/*
	   n=8;
	   arr= 1 2 3 4 4 3 2 3 3
	   op=3 =4

		*/
	//	for(Map.Entry<Integer,Integer>hl:hs.entrySet())
		System.out.println(maxele+" "+maxfre+" ");
	
	}
}
