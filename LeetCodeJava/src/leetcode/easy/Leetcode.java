package leetcode.easy;

import java.util.Scanner;
import java.lang.String;
import leetcode.easy.AlikeStringHalves;
import leetcode.easy.TwoSum;
import leetcode.easy.*;
import leetcode.easy.StringReverse;
import java.util.Arrays;


public class Leetcode {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : \n" +
                "1704. Alike String \n" +
                "1. Two Sum \n" +
                "136. Single Number \n" +
                "344. Reverse String \n" +
                "121. Best time to Buy and Sell stock \n " +
                "70. Climbing Stairs \n" +
                "1920. Build Array from Permutation \n" +
                "771. Jewels and Stones \n" +
                "1512. Number of Good Pairs \n" +
                "1480. Running Sum of 1d Array\n" +
                "1672. Richest Customer Wealth \n");
        String text = sc.nextLine();

        switch(text) {
            case "1704":
                Scanner alike = new Scanner(System.in);
                System.out.println("Enter String : ");
                String alikestring = alike.nextLine();
                AlikeStringHalves alikeStringHalves = new AlikeStringHalves();

            boolean alikeHalf = alikeStringHalves.halvesAreAlike(alikestring);
            break;

            case "1":
                TwoSum twoSum = new TwoSum();
                int[] input = {2,7,11,15};
                int[] twosumArray = twoSum.twoSum(input, 9);
                System.out.println("Two Sum array : "+ Arrays.toString(twosumArray));
                break;

            case "136":
                SingleNumber singleNumber = new SingleNumber();
                int[] inputsn = {4,1,2,1,2};
                int sn = singleNumber.singleNumber(inputsn);
                System.out.println("Single Number is : "+ sn);
                break;

            case "344":
                StringReverse stringReverse = new StringReverse();
                char[] reversal = {'r', 'h', 'e', 'y', 'a'};
                char[] rs = stringReverse.reverseString(reversal);
                System.out.println("Reversed String : " + Arrays.toString(rs));
                break;

            case "121":
                BuySell buySell = new BuySell();
                int[] prices = {7,1,5,3,6,4};
                int profit = buySell.maxProfit(prices);
                System.out.println("Profit : " + profit);
                break;

            case "70":
                ClimbingStairs cs = new ClimbingStairs();
                int stair = 11;
                int possibleCombination = cs.climbStairs(stair);
                System.out.println("Number of possible combinations (Fibonacci term value): "+ possibleCombination);
                break;

            case "1920":
                PermuteArray pm = new PermuteArray();
                int[] array = {0,2,1,5,3,4};
                int[] resultArray = pm.buildArray(array);
                System.out.println("zero-based permutation nums ans[i] = nums[nums[i]]: "+ Arrays.toString(resultArray));
                break;

            case "771":
                JewelsStones jewelsStones = new JewelsStones();

                System.out.println("Enter Jewels : \n");
                Scanner scjewels = new Scanner(System.in);
                String jewels = scjewels.nextLine();

                System.out.println("Enter Stones : \n");
                Scanner scstones = new Scanner(System.in);
                String stones = scstones.nextLine();

                int count = jewelsStones.numJewelsInStones(jewels,stones);
                System.out.println("Count of Jewels in Stones "+ count);
                break;

            case "1512":
                NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
                int[] nums = {1,2,3,1,1,3};
                int countOfGoodPairs = numberOfGoodPairs.numIdenticalPairs(nums);
                System.out.println("Number of Good Pairs "+ countOfGoodPairs);
                break;

            case "1480":
                RunningSum runningSum = new RunningSum();
                int[] numsRs = {3,1,2,10,1};
                int [] runningSumArr = runningSum.runningSum(numsRs);
                System.out.println("Running Sum : "+ Arrays.toString(runningSumArr));
                break;

            case "1672":
                RichCustWealth richCustWealth = new RichCustWealth();
                int[][] accounts = {{1,5},{7,3},{3,5}};
                int maxWealth = richCustWealth.maximumWealth(accounts);
                System.out.println("Rich customer Wealth : " + maxWealth);
                break;

            default:
                break;

        }


    }
}
