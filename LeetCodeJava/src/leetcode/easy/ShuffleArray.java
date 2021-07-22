package leetcode.easy;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];

        int k=0;

        for(int i=0,  j=n; i< nums.length && j<nums.length; i++, j++) {
            result[k++] = nums[i];
            result[k++] = nums[j];
        }

        return result;

    }
}