package leetcode.easy;

public class ConcatenationArray {
    public int[] getConcatenation(int[] nums) {

        System.out.println("Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).\n" +
                "\n" +
                "Specifically, ans is the concatenation of two nums arrays.\n" +
                "\n" +
                "Return the array ans.");

        int[] concatArray = new int[nums.length*2];

        for(int i=0; i<nums.length; i++) {

            concatArray[i] = nums[i];
            concatArray[i+nums.length] = nums[i];
        }

        return concatArray;
    }
}