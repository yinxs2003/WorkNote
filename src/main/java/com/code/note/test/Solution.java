package com.code.note.test;

public class Solution {

    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        Solution s = new Solution();

        int[] nums = {1, 2, 3, 5, 12, 33};

        int a = s.mySqrt(33);
        System.out.println(a);
    }
}
