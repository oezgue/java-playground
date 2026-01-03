package codeWars.kyu5;

public class DRoot {
    public static int digital_root(int n) {

        int sum = schleifer(n);
        while (sum > 9){
            sum = schleifer(sum);
        }
        return sum;
    }

    public static int schleifer(int n){
        int sum = 0;
        while (n>9){
            sum += n%10;
            n = n/10;
        }
        sum += n;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(181));
    }
}
