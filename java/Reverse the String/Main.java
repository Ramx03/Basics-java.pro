import java.util.*; 
public class Main { 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        String str= sc.nextLine(); 
        // char ch[]=str.toCharArray(); 
        // int start=0; 
        // int end=str.length()-1; 
        // while(start<end){ 
           // char temp=ch[start]; 
            //     ch[start]=ch[end]; 
            //     ch[end]=temp; 
            //         start++; 
            //         end--; 
            // reverse string using two pointer   
            //}     
           // String st= new String(ch); 
            // System.out.println(st); 
            // String sb = new StringBuilder(str).reverse().toString(); 
            StringBuilder sb = new StringBuilder(str).reverse(); 
            String st=sb.toString(); 
            System.out.print(st); 
    
    } 
}