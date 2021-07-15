package leetcode.easy;

public class RichCustWealth {
    public int maximumWealth(int[][] accounts) {

        System.out.println("You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the customer has in the  bank. Return the wealth that the richest customer has.\n" +
                "\n" +
                "A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.");

        int currCount = 0;
        int maxCount = 0;

        //row
        for(int i=0; i<accounts.length; i++) {

            //column
            for(int j=0; j<accounts[0].length; j++) {
                currCount+=accounts[i][j];
            }
            if(currCount >= maxCount) {
                maxCount = currCount;
            }
            currCount = 0;
        }

        return maxCount;
    }
}