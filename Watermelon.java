import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubmissionIsAllYouNeed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] s = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                s[i] = scanner.nextInt();
                sum += s[i];
            }

            Set<Integer> set = new HashSet<>();
            for (int val : s) {
                set.add(val);
            }

            int mex = 0;
            while (set.contains(mex)) {
                mex++;
            }

            System.out.println(sum + mex);
        }
        scanner.close();
    }
}