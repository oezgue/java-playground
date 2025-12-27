package codeWars;

public class ReversedStrings {
    public static String solution(String str) {
        //
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= str.length(); i++){
            sb.append(str.charAt(str.length()-i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("ab"));
        StringBuilder sb = new StringBuilder("blabla");
        System.out.println(sb.reverse());
    }
}
