package leetcode.practise;

import java.util.Scanner;
import java.lang.String;
import leetcode.practise.AlikeStringHalves;
import leetcode.practise.TwoSum;
import leetcode.practise.*;
import leetcode.practise.StringReverse;
import java.util.Arrays;


public class Leetcode {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : \n" +
                "1704. Alike String \n" +
                "1. Two Sum \n" +
                "136. Single Number \n" +
                "344. Reverse String \n" +
                "121. Best time to Buy and Sell stock \n");
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

            default:
                break;

        }


    }
}
