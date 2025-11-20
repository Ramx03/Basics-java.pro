import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(count++ + " ");
                }
            } else { 
                int temp = count + n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.print(temp-- + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
