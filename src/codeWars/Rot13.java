package codeWars;

public class Rot13 {
    public static String rot13(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if(97 <= (int)str.charAt(i) && (int)str.charAt(i) <= 122){
                Character rotChar = (char)((( (int)str.charAt(i)+ 13 - 97 ) % 26)+97);
                sb.append(rotChar);
            }
            else if(65 <= (int)str.charAt(i) && (int)str.charAt(i) <= 90){
                Character rotChar = (char)((( (int)str.charAt(i)+ 13 - 65 ) % 26)+65);
                sb.append(rotChar);
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Character c = 'A';//65-90  und 97-122
        System.out.println((char)110);
        System.out.println(rot13("AbCdxYz!"));
    }
}
