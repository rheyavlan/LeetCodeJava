package leetcode.easy;

class ClimbingStairs {

    public int climbStairs(int n) {

        System.out.println("You are climbing a staircase. It takes n steps to reach the top.\n" +
                "\n" +
                "Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?");

        int ways = 1;

        if(n==1) {
            return ways;
        }

        int first = 1;
        int second = 2;

        for(int i=3; i<=n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;

    }

}