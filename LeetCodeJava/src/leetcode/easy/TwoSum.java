package leetcode.easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        System.out.println("Given an array of integers nums and an integer target, " +
                "return indices of the two numbers such that they add up to target.");
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}