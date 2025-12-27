package codeWars;

public class IsSquare {
    public static boolean isSquare(int n){
        double d = Math.sqrt(n);
        int i = (int)d;
        return d == i;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(16));

    }
}
