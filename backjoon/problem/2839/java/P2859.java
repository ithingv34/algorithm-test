import java.util.Arrays;
import java.util.Scanner;

public class P2859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배달해야하는 킬로그램, 3 <= N <= 5000

        // dp 배열을 -1로 초기화
        int[] dp = new int[N+1];
        Arrays.fill(dp, -1);

        if (N >= 3) dp[3] = 1;
        if (N >= 5) dp[5] = 1;

        for(int i = 6; i < N + 1; i++){
           if (dp[i - 3] <= 0 && dp[i - 5] <= 0) {
               dp[i] = -1;
           }
           else if (dp[i - 3] > 0 && dp[i - 5] > 0) {
               dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
           }
           else {
               dp[i] = Math.max(dp[i - 3], dp[i - 5]) + 1;
           }
        }
        System.out.println(dp[N]);
    }
}
