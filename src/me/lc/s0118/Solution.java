package me.lc.s0118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> dp = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = dp.get(i - 1);
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            dp.add(row);
        }

        return dp;
    }

    public void test1() {
        System.out.println(generate(1));
    }

    public void test2() {
        System.out.println(generate(5));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.test1();
        solution.test2();
    }
}
