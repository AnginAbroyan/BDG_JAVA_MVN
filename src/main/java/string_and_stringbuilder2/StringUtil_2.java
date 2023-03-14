package string_and_stringbuilder2;

import java.util.ArrayList;
import java.util.Scanner;

public class StringUtil_2 {
    Scanner sc = new Scanner(System.in);

    /**
     * 1. done
     * Returns a string made from the given String's first 2 chars (if present), however includes first char only if
     * it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
     *
     * @param line, The String from which we extract first 2 chars if they are o and z consequently.
     * @returns SubString "oz", "o", or "z"
     */
    public String subString2Chars(String line) {
        String subStr = "";
        if (line != null && line != "") {

            if (line.startsWith("oz")) {
                subStr = "oz";
            } else if (line.startsWith("o")) {
                subStr = "o";
            } else if (line.startsWith("z", 1)) {
                subStr = "z";
            } else {
                subStr = "";
            }

        }
        return subStr;
    }

    /**
     * 2.done
     * Counts the number of "xx" in the given string. Overlapping is allowed, so "xxx" contains 2 "xx".
     * @param line, This is the given String, in which we look for xx couples.
     * @return the count of wanted subString.
     */
    public int containsXX(String line) {
        int count = 0;
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == 'x' && line.charAt(i + 1) == 'x') {
                count++;
            }
        }
        return count;
    }


    /**
     * 3.done
     * The method detects whether the String is a palindrome or not.
     *
     * @param line, The String which is examined.
     * @return a boolean value, which indicates is the given String was a palindrome o not.
     */
    public boolean isPalindrome(String line) {
        for (int i = 0, len = line.length() - 1; i < line.length() / 2; i++, len--) {
            if (line.charAt(i) != line.charAt(len)) {
                return false;
            }
        }
        return true;
    }


    /**
     * 4. done
     * The method returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters.
     *
     * @returns list elements that starts with a and have 3 letters.
     */
    public ArrayList<String> findA3Chars() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("fdgdg");
        list.add("adg");
        list.add("aog");
        list.add("fdgdg");
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).startsWith("a") && !(list.get(i).length() == 3)) {
                list.remove(list.get(i));
            }
        }
        return list;

    }

    //5.	Write a method that returns a comma-separated string based on a given list of integers. Each element should
    // be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd.
    // For example, if the input list is (3,44), the output should be 'o3,e44'.
//    public String comSepStr() {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(44);
//        list.add(55);
//        String listString = list.toString();
//        System.out.println(listString);
//        String[] newStr = listString.split(",");
//        String fin = "";
//        int[] arr = new int[newStr.length];
//        for (int i = 0; i < newStr.length; i++) {
//            arr[i] = Integer.parseInt(newStr[i]);
//        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] % 2 == 0) {
//                fin += "e";
//                fin += arr[i];
//            } else {
//                fin += "o";
//                fin += arr[i];
//            }
//        }
//        return listString;
//    }


    //        String listString = list.toString();
//        String[] newStr = listString.split(",");
//
//        for(int i=0; i< newStr.length-1; i++) {
//            newStr[i] = (int);
//        }
//        for (int i = 0; i < newStr.length-1; i++) {
//            if(newStr[i] %2 == 0)
//
//        }


//        int[] arr = new int[newStr.length];
//        for(int i = 0;i < newStr.length;i++)
//        {
//            arr[i] = Integer.parseInt(newStr[i]);
//        }
//        for(int value: arr){
//            System.out.println(value);
//        }


    //6. done

    /**
     * 6 done
     * The method is simple Caesar decoder.
     * @param line, The text which will be decoded.
     * @returns decoded text.
     */
    public String decoderCaesar(String line) {
        int n = 5;
        String decodedStr = "";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z' || (line.charAt(i) >= 'a' && line.charAt(i) <= 'z')) {
                if (line.charAt(i) >= 'A' && line.charAt(i) <= 'E' || (line.charAt(i) >= 'a' && line.charAt(i) <= 'e')) {
                    decodedStr += (char) (line.charAt(i) + 21);

                } else {
                    decodedStr += (char) (line.charAt(i) - 5);
                }
            } else {
                decodedStr += line.charAt(i);
            }
        }
        return decodedStr;
    }


    //7.	A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome. Write a method
    // that returns the longest palindrome substring of a given string.
//    public String largestPalindrome(String line) {
//        int palLen = 0;
//        int maxLen = 0;
//        String[] lineArr = line.split(" ");
//        String longPal = "";
//        for (int i = 0; i < lineArr.length; i++) {
//            for (int j = 0, len = lineArr[i].length() - 1; j < lineArr[i].length() / 2; j++, len--) {
//                if (lineArr[i].charAt(j) == lineArr[i].charAt(len)) {
//                    longPal += lineArr[i].charAt(j);
//                    longPal += lineArr[i].charAt(len);
//                    palLen++;
//                }
//                if (palLen >= maxLen) {
//                    maxLen = palLen;
//                    palLen = 0;
//                }
//            }
//        }
//        return longPal;
//    }

    /**
     * 8 done
     * a method that finds the longest common sub-sequence between two Strings.
     *
     * @param line1 1st String
     * @param line2 2nd String
     * @return the longest sub_sequence.
     */
    public String maxCommonSubSeq(String line1, String line2) {
        int count = 0;
        String maxSub_sequence = "";
        for (int i = 0; i < line1.length(); i++) {
            for (int j = i + 1; j < line1.length(); j++) {
                String sub_sequence = line1.substring(i, j);
                if (line2.contains(sub_sequence) && sub_sequence.length() > count) {
                    count = sub_sequence.length();
                    maxSub_sequence = sub_sequence;
                }
            }
        }
        return maxSub_sequence;
    }


    /**
     * 9 done, doesn't work
     * Finds the number of common characters between two String.
     * @param line1 1st String
     * @param line2 2nd String
     * @returns the number of common characters
     */
    public int countCommonChars(String line1, String line2) {
        int count = 0;
        for (int i = 0; i < Math.min(line1.length(), line2.length()); i++) {
            if (line1.charAt(i) == line2.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    //10.	Write a function that reverses characters in (possibly nested) parentheses in the input string. Input
    // strings will always be well-formed with matching ()s.

//    public String revParentheses(String line) {
//        String reversedStr = "";
//
//        for (int i = 0, j = line.length() - 1; i < line.length() - 1; i++, j--) {
//            if (line.charAt(i) == '(' && line.charAt(j) == ')') {
//                while (j != i + 1) {
//                    reversedStr += line.charAt(j - 1);
//                    j--;
//                }
//            } else {
//                reversedStr += line.charAt(i);
//            }
//        }
//        return reversedStr;
//    }

    //Example
    //For inputString = "(bar)", the output should be
    //solution(inputString) = "rab";
    //For inputString = "foo(bar)baz", the output should be
    //solution(inputString) = "foorabbaz";
    //For inputString = "foo(bar)baz(blim)", the output should be
    //solution(inputString) = "foorabbazmilb";
    //For inputString = "foo(bar(baz))blim", the output should be
    //solution(inputString) = "foobazrabblim".
    //Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".

}

