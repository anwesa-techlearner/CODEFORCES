import java.util.Scanner;
public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of soldiers
        int[] heights = new int[n];
        int maxVal = -1;
        int minVal = 101; 
        int maxIdx = -1;
        int minIdx = -1;
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
            if (heights[i] > maxVal) {
                maxVal = heights[i];
                maxIdx = i;
            }
            if (heights[i] <= minVal) { 
                minVal = heights[i];
                minIdx = i;
            }
        }
        int swaps = 0;
        swaps += maxIdx;
        if (minIdx < maxIdx) {
            swaps += (n - 1 - minIdx) - 1; // Subtract 1 because the max element is already moved
        } else {
            swaps += (n - 1 - minIdx);
        }
        System.out.println(swaps);
    }
}
