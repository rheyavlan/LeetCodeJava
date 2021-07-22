package leetcode.easy;

public class SmallNumThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        System.out.println("Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].\n" +
                "\n" +
                "Return the answer in an array.");

        int[] resultSet = new int[nums.length];

        for(int i=0; i < nums.length; i++) {
            int count = 0;
            for(int j=0; j< nums.length; j++) {
                if(nums[i] > nums[j]) {
                    resultSet[i] = ++count;
                }
            }

        }

        return resultSet;
    }
}