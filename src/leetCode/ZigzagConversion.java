package leetCode;

import java.util.ArrayList;

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

        P   A   H   N
        A P L S I I G
        Y   I   R

        And then read line by line: "PAHNAPLSIIGYIR"

        Write the code that will take a string and make this conversion given a number of rows:

        string convert(string s, int numRows);



        Example 1:

        Input: s = "PAYPALISHIRING", numRows = 3
        Output: "PAHNAPLSIIGYIR"

        Example 2:

        Input: s = "PAYPALISHIRING", numRows = 4
        Output: "PINALSIGYAHRPI"
        Explanation:
        P     I    N
        A   L S  I G
        Y A   H R
        P     I

        Example 3:

        Input: s = "A", numRows = 1
        Output: "A"
*/
public class ZigzagConversion {
    public String conversion(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        //Idea: create two Lists, one list holds the orthogonal rows and the other holds the diagonal rows as Array Chars.
        // Then iterate through both, creating the result string via appending to a Stringbuilder
        int length = s.length();
        ArrayList<char[]> orthoList = new ArrayList<>();
        ArrayList<char[]> diagonalList = new ArrayList<>();
        int pointer = 0;
        while (pointer <= length) {

            char[] orthoChars = new char[numRows];
            // fill orthogonal row
            for (int i = 0; i < numRows; i++) {
                if (pointer < length) {
                    orthoChars[i] = s.charAt(pointer);
                    pointer++;
                } else pointer++;
            }
            orthoList.add(orthoChars);
            for (int i = 2; i < numRows; i++) { //starts with 2 cause length starts with 1 position with 0, and we got (row - 2) elements
                if (pointer < length) {
                    char[] diagonalChar = new char[numRows];
                    diagonalChar[numRows - i] = s.charAt(pointer);
                    diagonalList.add(diagonalChar);
                    pointer++;
                } else pointer++;
            }
        }
        //build the string line by line, by alternating between the two lists

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < orthoList.size(); j++) {
                if (orthoList.get(j) != null) {
                    if (orthoList.get(j)[i] != 0) {
                        sb.append(orthoList.get(j)[i]);
                    }
                }
                if (diagonalList.get(j) != null) {
                    if (diagonalList.get(j)[i] != 0) {
                        sb.append(diagonalList.get(j)[i]);
                    }
                }
            }
        }
        s = sb.toString();

        return s;
    }
}
