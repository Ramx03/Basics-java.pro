import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    //String str=sc.nextLine();
	  //  String sr[]=str.split(" ");
	   // int ar[]=new int[sr.length];
	   // for(int i=0;i<ar.length;i++){
	   //     int a=Integer.parseInt(sr[i]);
	   //     ar[i]=a;
	   // } 
	   // int count =0;
	   // for(int i=0;i<ar.length;i++){
	   //     count=0;
	   //     for(int j=0;j<ar.length;j++){
	   //         if(ar[i]==ar[j]){
	   //             count++;
	   //         }
	   //     }
	   //     if(count==1){
	   //        	System.out.println(ar[i]); 
	   //     }
	   //
// 	int xor=0;
// 	for(int i=0;i<sr.length;i++){
// 	    xor^=Integer.parseInt(sr[i]);
// 	}
// 	System.out.print(xor);
 List<Integer> numbers = new ArrayList<>();
        
        while (sc.hasNextInt()) { // Read integers directly
            numbers.add(sc.nextInt());
        }

        int xor = 0;
        for (int num : numbers) {
            xor ^= num; // Perform XOR operation
        }
        System.out.print(xor);
	}
}
