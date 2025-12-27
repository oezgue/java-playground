package fernuni.leetCode;

public class LongestPrefixTest {
    public static void main(String[] args) {
        String[] strings = {"hi", "hiho"};
        LongestPrefix longestPrefix = new LongestPrefix();
        System.out.println(longestPrefix.longestCommonPrefix(strings));
    }
}
