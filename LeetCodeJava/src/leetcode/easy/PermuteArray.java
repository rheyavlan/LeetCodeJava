package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PermuteArray {
    public int[] buildArray(int[] nums) {

        System.out.println("Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.\n" +
                "\n" +
                "A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).");

        int[] permutationArray = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            permutationArray[i] = nums[nums[i]];
        }
        return permutationArray;
    }
}