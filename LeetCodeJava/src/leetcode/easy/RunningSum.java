package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class RunningSum {
    public int[] runningSum(int[] nums) {

        System.out.println("Given an array nums. We define a running sum of an array as runningSum[i] = " +
                "sum(nums[0] to nums[i]).\n" +
                "\n" +
                "Return the running sum of nums.\n" +
                "\n");

        int[] runningSum = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            if(i==0) {
                runningSum[i] = nums[i];
            } else {
                for(int j=0; j<=i; j++) {
                    runningSum[i] += nums[j];
                }

            }
        }

        return runningSum;
    }
}