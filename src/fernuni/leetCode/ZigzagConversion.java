package fernuni.leetCode;

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
        //Idea: create one (!) List with columns
        int length = s.length();
        //Ermittle menge der columns

        // Teilen mit Aufrunden: (dividend + divisor -1) / divisor
        int amountFullColumns = (length + (numRows+numRows-2) - 1)/(numRows+numRows-2);
        int amountOneCharColumns = length-amountFullColumns*numRows;
        int amount = amountFullColumns+amountOneCharColumns;


        System.out.println(amount);

        return s;
    }
}
