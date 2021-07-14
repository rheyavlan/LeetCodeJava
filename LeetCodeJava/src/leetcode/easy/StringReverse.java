package leetcode.easy;

class StringReverse {
    public char[] reverseString(char[] s) {

        System.out.println("Write a function that reverses a string. The input string is given as an array of characters s.");

        stringReverse(s,0,s.length-1);
        return s;
    }

    public void stringReverse(char[] s, int left, int right) {
        char temp;
        if(left>=right) {
            return;
        } else {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left = ++left;
            right = --right;
            stringReverse(s,left,right);
        }
    }
}