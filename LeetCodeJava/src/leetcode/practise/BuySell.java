package leetcode.practise;

class BuySell {
    public int maxProfit(int[] prices) {

        System.out.println("You are given an array prices where prices[i] is the price of a given stock on the ith day.\n" +
                "\n" +
                "You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.\n" +
                "\n" +
                "Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.");

        int lowest = prices[0];
        int profit = 0;

        for(int i=0;i<prices.length;i++) {
            if(prices[i]<lowest) {
                lowest = prices[i];
            } else if(prices[i]-lowest > profit) {
                profit = prices[i]-lowest;
            }

        }
        return profit;

    }
}