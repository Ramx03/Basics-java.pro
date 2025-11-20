import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int num = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (num <= n * n) {
            for (int i = left; i <= right; i++){
                 arr[top][i] = num++;
                 top++;
            }
            for (int i = top; i <= bottom; i++){
                 arr[i][right] = num++;
                 right--;
            }
            for (int i = right; i >= left; i--) {
                 arr[bottom][i] = num++;
            }    bottom--;
            for (int i = bottom; i >= top; i--){
                 arr[i][left] = num++;
                 left++;
            }
        }

        for (int[] row : arr) {
            for (int val : row) System.out.printf("  ", val);
            System.out.println();
        }
        sc.close();
    }
}