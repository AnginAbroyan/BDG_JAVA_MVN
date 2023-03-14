package string_and_stringbuilder2;


import java.util.Scanner;



public class StringUtil_DuringClass {
    Scanner sc = new Scanner(System.in);

    /**
     * A method that returns that string in reverse order.
     *
     * @param a, The String that will be reversed.
     * @return the reversed version of the String.
     */
    public String reverseStr(String a) {
        String revStr = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            revStr += String.valueOf(a.charAt(i));
        }
        return revStr;
    }


    /**
     * a method which returns sum of all digits in that string. Assume that string contains only single digits.
     *
     * @param line, the String from which will be extracted numbers.
     * @return sum of the numbers in a String.
     */
    public int sumDigits(String line) {
        int sumNums = 0;
        char ch1 = '0';
        char ch2 = '9';
        int i1 = 0;
        int i2 = 9;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                sumNums += Character.getNumericValue(line.charAt(i));
            }
        }
        return sumNums;
    }


    /**
     * a method that returns one string made of two strings. First letter of new string is first letter of first string,
     * second letter of new string is first letter of second string and so on.
     *
     * @param line1 The first String that will be mixed.
     * @param line2 The 2nd String.
     * @return The mixed String.
     */
    public String mixString(String line1, String line2) {
        String mixedStr = new String();
        int len = line1.length() + line2.length();
        for (int i = 0; i < line1.length() || i < line2.length(); i++) {
            if (i < line1.length()) {
                mixedStr += line1.charAt(i);
            }
            if (i < line2.length()) {
                mixedStr += line2.charAt(i);
            }
        }
        return mixedStr;
    }


    /**
     * a method that counts its number of words. Assume there are no leading and trailing whitespaces
     * and there is only single whitespace between two consecutive words.
     *
     * @return the count of the words in a String.
     */
    public int wordsCounter() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");
        int count = words.length;
        return count;
    }


    /**
     * a method that returns new string with reverted words order. Pay attention to the
     * punctuation at the end of the sentence (period).
     *
     * @param line, The String that will be reverted.
     * @return the reverted String.
     */
    public String revertedStr(String line) {
        String revertedStr = "";

        if (line.charAt(line.length() - 1) == '.') {
            String[] line1 = line.substring(0, line.length() - 1).split(" ");
            for (int i = line1.length - 1; i >= 0; i--) {
                revertedStr += line1[i] + " ";
            }
            return revertedStr.substring(0, revertedStr.length() - 1) + ".";
        } else {
            String[] line1 = line.split(" ");
            for (int i = line1.length - 1; i >= 0; i--) {
                revertedStr += line1[i] + " ";
            }
            return revertedStr.substring(0, revertedStr.length() - 1);
        }
    }


    public int countSubString(String line, String token) {
        int count = 0;
        String newLine = line;

        while (newLine.contains(token)) {
            newLine = newLine.replaceFirst(token, "");
            count++;
        }

        return count;
    }


    //SortCharactersDescending("onomatopoeia") → tpoooonmieaa
    public char[] sortedStr(String line) {
        char[] charArr = line.toCharArray();
        char temp;
        for (int i = 0; i < charArr.length - 1; i++) {
            if (Character.valueOf(charArr[i]) < Character.valueOf(charArr[i + 1])) {
                temp = charArr[i];
                charArr[i] = charArr[i + 1];
                charArr[i + 1] = temp;
                i = -1;
            }
        }

        return charArr;
    }


//CompressString("kkkktttrrrrrrrrrr") → "k4t3r10"
//CompressString("p555ppp7www") → "p153p371w3"

    /**
     * A method that returns a non-empty string in compressed format
     *
     * @param line The String that will be compressed.
     */
    public void compressString(String line) {
        int count = 1;
        line = line + " ";
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(line.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
    }
}
