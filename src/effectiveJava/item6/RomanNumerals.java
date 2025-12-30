package effectiveJava.item6;

import java.util.regex.Pattern;

public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    //faster
    static boolean isRomanNumeralFaster(String s) {
        return ROMAN.matcher(s).matches();
    }

    //slower
    static boolean isRomanNumeralSlower(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }


}
