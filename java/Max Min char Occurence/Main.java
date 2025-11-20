import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String str= sc.nextLine();
	   // HashMap<Character,Integer> hs= new HashMap<>();
	   // for(int i=0;i<str.length();i++){
	   //     char ch= str.charAt(i);
	   //     hs.put(ch,hs.getOrDefault(ch,0)+1);
	   // }
	   // char min=str.charAt(0);
	   // char max=str.charAt(0);
	   // int minfr= Integer.MAX_VALUE;
	   // int maxfr=Integer.MIN_VALUE;
	   // for(HashMap.Entry<Character,Integer> entry:hs.entrySet()){
	   //     char charc=entry.getKey();
	   //     int freq=entry.getValue();
	   //     if(freq>maxfr){
	   //         maxfr=freq;
	   //         max=charc;
	            
	   //     }
	   //     if(freq<minfr){
	   //         minfr=freq;
	   //         min=charc;
	            
	   //     }
	   // }
	   int fre[]= new int[256];
	   for(int i=0;i<str.length();i++){
	       fre[str.charAt(i)]++;
	   }
	   char min=str.charAt(0);
	   char max=str.charAt(0);
	   int minfr= Integer.MAX_VALUE;
	   int maxfr=Integer.MIN_VALUE;
	   for(int i=0;i<256;i++){
	       if(fre[i]>0){
	       if(fre[i]>maxfr){
	           maxfr=fre[i];
	           max=(char)i;
	       }
	       if(fre[i]<minfr){
	           minfr=fre[i];
	           min=(char)i;
	       }
	   }
	   }

		 System.out.println("Min Occurrence: " + min + " - " + minfr);
        System.out.println("Max Occurrence: " + max+ " - " + maxfr);
	}
}
