package codeWars;

public class EndsWith {
    public static boolean solution(String str, String ending) {
        int diff = str.length()-ending.length();
        if (diff>0) {
            str = str.substring(diff);
        }
        return str.equals(ending);
    }

    public static void main(String[] args) {
        System.out.println(solution("samurai","ai"));
    }
}
