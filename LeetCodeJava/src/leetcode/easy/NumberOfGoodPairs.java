package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {

        System.out.println("Given an array of integers nums.\n" +
                "\n" +
                "A pair (i,j) is called good if nums[i] == nums[j] and i < j.\n" +
                "\n" +
                "Return the number of good pairs.");

        int numOfGoodPairs = 0;

        for(int i=0; i< nums.length; i++) {
            for(int j=i+1; j< nums.length; j++ ) {
                if(nums[i] == nums[j] && i<j) {
                    numOfGoodPairs+=1;
                }
            }
        }

        return numOfGoodPairs;
    }
}