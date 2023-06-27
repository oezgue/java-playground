public class StringTesting {

    public static void main(String[] args) {
        String str = "Annabelle Hallo";
        System.out.println(circle(str));
        listMatches(str, str);

    }

    static void listMatches(String str1, String str2) {
        int length = str1.length();
        for (int i = 0; i < str1.length(); i++) {
            for ( int j = i+1; j < str1.length(); j++){
            System.out.println(str1.substring(i, j));
            }

        }
    }

    /**
     * Diese Methode soll einen String umdrehen.
     *
     * @param str
     * @return
     */
    static String circle(String str) {
        int strLength = str.length();
        int counter = str.length();
        String newStr = new String();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counter; i++) {
            strLength--;
            sb.append(str.charAt(strLength));
        }

        return sb.toString();

    }
}
