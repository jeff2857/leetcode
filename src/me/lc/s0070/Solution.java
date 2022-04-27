package me.lc.s0070;

public class Solution {
    public int climbStairs(int n) {
        if (n < 3) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public int climbStairs2(int n) {
        if (n < 3) return n;

        int a = 1;
        int b = 2;
        int c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public void test1() {
        System.out.println(climbStairs2(2) == 2);
    }

    public void test2() {
        System.out.println(climbStairs2(3) == 3);
    }

    public void test3() {
        System.out.println(climbStairs2(1) == 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.test1();
        solution.test2();
        solution.test3();
    }
}
