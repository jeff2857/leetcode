package me.lc.s0053;

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for (int num : nums) {
            sum = Math.max(sum + num, num);
            max = Math.max(max, sum);
        }

        return max;
    }

    public void test1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums) == 6);
    }

    public void test2() {
        int[] nums = {1};
        System.out.println(maxSubArray(nums) == 1);
    }

    public void test3() {
        int[] nums = {5, 4, -1, 7, 8};
        System.out.println(maxSubArray(nums) == 23);
    }

    public void test4() {
        int[] nums = {-2};
        System.out.println(maxSubArray(nums) == -2);
    }

    public void test5() {
        int[] nums = {1, -3, 1, 3};
        System.out.println(maxSubArray(nums) == 4);
    }

    public void test6() {
        int[] nums = {-2, -1};
        System.out.println(maxSubArray(nums) == -1);
    }

    public void test7() {
        int[] nums = {3, -2, -3, -3, 1, 3, 0};
        System.out.println(maxSubArray(nums) == 4);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.test1();
        solution.test2();
        solution.test3();
        solution.test4();
        solution.test5();
        solution.test6();
        solution.test7();
    }
}
