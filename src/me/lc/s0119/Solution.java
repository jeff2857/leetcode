package me.lc.s0119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
        }

        for (int i = 0; i <= rowIndex; i++) {
            int prev = row.get(0);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.set(j, 1);
                } else {
                    int temp = row.get(j);
                    row.set(j, prev + row.get(j));
                    prev = temp;
                }
            }
        }

        return row;
    }

    public void test1() {
        System.out.println(getRow(0));
    }

    public void test2() {
        System.out.println(getRow(1));
    }

    public void test3() {
        System.out.println(getRow(2));
    }

    public void test4() {
        System.out.println(getRow(3));
    }

    public void test5() {
        System.out.println(getRow(4));
    }

    public void test6() {
        System.out.println(getRow(5));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.test1();
        solution.test2();
        solution.test3();
        solution.test4();
        solution.test5();
        solution.test6();
    }
}
