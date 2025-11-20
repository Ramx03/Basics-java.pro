import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> freqMap = new HashMap<>(); 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        int minFrequency = Integer.MAX_VALUE;
        for (int freq : freqMap.values()) {
            if (freq < minFrequency) {
                minFrequency = freq;
            }
        }
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) == minFrequency) {
                System.out.println(key);
                break; 
            }
        }
    }
}

