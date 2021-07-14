package leetcode.easy;

import java.util.ArrayList;
import java.util.List;


public class SingleNumber {
    public int singleNumber(int[] nums) {

        System.out.println("Given a non-empty array of integers nums, every element appears twice except for one. " +
                "Find that single one.");

        boolean foundmatch = false;
        int sn = nums[0];

        List<Integer> no_dupe = new ArrayList<>();

        if(nums.length == 1) {
            return nums[0];
        }

        for(int i : nums) {
            if(!no_dupe.contains(i)) {
                no_dupe.add(i);
            }else {
                no_dupe.remove(new Integer(i));
            }
        }

        return no_dupe.get(0);

    }
}