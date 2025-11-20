import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        TreeSet<Integer> ts= new TreeSet<>();
        for(int i=1;i<arr.length-1;i++){
            ts.add(i);
        }
        for(int i:ts){
        System.out.print(i);
        }
    }
}