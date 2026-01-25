package leetcode;

public class Palindrome {

    public static boolean isPalindrome(int x) {

        String intToString =String.valueOf(x);
        StringBuilder sb = new StringBuilder(intToString);
        sb.reverse();
        return (sb.toString().equals(intToString));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(323));
    }
}
