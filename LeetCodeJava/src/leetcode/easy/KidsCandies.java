package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class KidsCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        System.out.println("There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.\n" +
                "\n" +
                "Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.\n" +
                "\n" +
                "Note that multiple kids can have the greatest number of candies.\n" +
                "\n" +
                " ");

        List<Boolean> status = new ArrayList<>();

        for(int i=0;i<candies.length; i++) {

            boolean statusVal = true;

            for(int j=0; j<candies.length; j++) {
                if((candies[i] + extraCandies) < candies[j]) {
                    statusVal=false;
                }
            }
            status.add(statusVal);
        }

        return status;
    }
}