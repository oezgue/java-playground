package codeWars;

public class ValidatePin {
    public static boolean validatePin (String str){
        try {
            int i = Integer.parseInt(str);

            if (i > 0 && (str.length() == 4 || str.length() == 6)
                || 999 < i && i < 10000 || 99999 < i && i < 1000000
            ) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
       //
        return false;
    }

    public static void main(String[] args) {
        System.out.println();


    }
}
