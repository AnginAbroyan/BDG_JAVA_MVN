package string_and_stringbuilder;

import java.util.Scanner;
import java.lang.StringBuilder;


public class StringUtil {
    Scanner sc = new Scanner(System.in);

    /**
     * @param a String
     * @param b String
     * @returns a + b
     */
    public String concString(String a, String b) {
        return a + b;
    }

    /**
     * @param str1 StringBuilder
     * @param str2 StringBuilder
     * @returns str1 +str2
     */
    public StringBuilder concatStrB(StringBuilder str1, StringBuilder str2) {
        StringBuilder result = new StringBuilder();
        result.append(str1).append(str2).toString();
        return result;
    }

    /**
     * @param a int
     * @param b int
     * @param c String
     * @returns a + b + c
     */
    public String concatStrInt(int a, int b, String c) {
        return "" + a + b + c;
    }

    /**
     * @param num1 int
     * @param num2 int
     * @param a StringBuilder
     * @returns num1 + num 2 + a
     */
    public StringBuilder concat2IntsStrB(int num1, int num2, StringBuilder a) {
        StringBuilder result = new StringBuilder();
        result.append(num1).append(num2).append(a);
        return result;
    }


    /**
     * @param a String
     * @param b int
     * @param c String
     * @returns a + b + c
     */
    public String concatStrIntStr(String a, int b, String c) {
        return a + b + c;
    }

    /**
     * @param a StringBuilder
     * @param b int
     * @param c StringBuilder
     * @returns a+b+c
     */
    public StringBuilder concatStrBIntStrB(StringBuilder a, int b, StringBuilder c) {
        return new StringBuilder().append(a).append(b).append(c);
    }

    /**
     * @param a String
     * @param b int
     * @param c int
     * @param d String
     * @returns a+b+c+d
     */
    public String concatStr2IntStr(String a, int b, int c, String d) {
        return a + b + c + d;
    }

    /**
     * @param a StringBuilder
     * @param b int
     * @param c int
     * @param d StringBuilder
     * @returns a+b+c+d
     */
    public StringBuilder concatStrb2IntStrb(StringBuilder a, int b, int c, StringBuilder d) {
        return new StringBuilder().append(a).append(b).append(c).append(d);
    }


// 2․  Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ  սիվոլից նոր տողում օգտագործելով  String Literal ( \t, \b ….)․
//actual:  “We are living in”
//result:  We are living in

    /**
     * newLine method gets a String, and each word pints in a new line
     * @param a, the text inputted.
     * @returns the String every word in a new line.
     */
    public String newLine(String a) {
        return a.replace(" ", "\n");
    }

    /**
     * The method reverses a String
     * @param a, the String which will be reversed
     * @returns the reversed text
     */
    public String reverseStr(String a) {
        String revStr = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            revStr += String.valueOf(a.charAt(i));
        }
        return revStr;
    }

    /**
     * CountSubString method checks the occurrence of the token in a text.
     * @param line, the text which will be examined.
     * @param token, the subString which occurrence will be counted.
     * @returns how many tokens were in the text.
     */
    public int countSubString(String line, String token) {
        int count = 0;
        String newLine = line;

        while (newLine.contains(token)) {
            newLine = newLine.replaceFirst(token, "");
            count++;
        }

        return count;
    }

    /**
     * upperCase method makes the text uppercase.
     * @param text
     * @returns the uppercase version of the text.
     */
    public String upperCase(String text) {
        String upperCaseText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                upperCaseText += (char) (text.charAt(i) - 32);
            } else {
                upperCaseText += text.charAt(i);
            }
        }
        return upperCaseText;
    }

    /**
     * upperCase method returns the uppercase version of a Stringbuilder.
     * @param text
     * @return
     */
    public StringBuilder upperCase(StringBuilder text) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                upperCaseText.append((char) (text.charAt(i) - 32));
            } else {
                upperCaseText.append(text.charAt(i));
            }
        }
        return upperCaseText;
    }


    //6․ Գրել method, որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող , տպում այն եթե տողի   երկարությունը
    // պակաս է 20 ից ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.
    //actual:   “Armenia”
    //result:  “Armenia*************”

    /**
     * printStr method reads from console a line which length is 20, and prints it, if the length is smaller than 20,
     * it fills '*' until it becomes 20.
     */
    public void printStr() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        if (text.length() > 20) {
            System.out.println("ete");
            printStr();
        } else {
            for (int i = 0; i <= 20; i++) {
                text = text + "*";
            }

        }

        System.out.println(text);
    }

    /**
     * noA method removes all 'a'-s from a String.
     */
    public void noA() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        String newTxt = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != 'a') {
                newTxt += text.charAt(i);
            }
        }
        System.out.println(newTxt);
    }

    /**
     * noAStrB method removes 'a'-s from a StringBuilder.
     */
    public void noAStrB() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        StringBuilder text1 = new StringBuilder(text);
        StringBuilder newTxt = new StringBuilder();

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != 'a') {
                newTxt.append((char) text1.charAt(i));
            }
        }
        System.out.println(newTxt);
    }

    /**
     * aToStars method converts all 'a'-s into '*' in the String.
     */
    public void aToStars() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        String newTxt = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != 'a') {
                newTxt += text.charAt(i);
            } else {
                newTxt += "*";
            }
        }
        System.out.println(newTxt);

    }

    /**
     * maxWord method finds the longest word in a String.
     */
    public void maxWord() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        String maxWord = "";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }
        System.out.println("The longest word in the text is: " + maxWord);

    }

    /**
     * getIndexOfC method finds the index of first met 'c'.
     * @return returns the index.
     */
    public int getIndexOfC() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        System.out.println("Please enter your text: ");
        String c = sc.nextLine();
        // for(int i = 0; i< text.length(); i++){

        // }
        return text.indexOf(c);
    }


    /**
     * printSubLine method prints the SubString from the start of the line till given n index.
     * @param line
     * @param n
     * @return
     */
    public String printSubLine(String line, int n) {
        String newStr = "";
        for (int i = 0; i <= n; i++) {
            newStr += line.charAt(i);
        }
        return newStr;
    }

    /**
     * printSubLine method prints the SubStringBuilder from the start of the line till given n index.
     * @param line
     * @param n
     * @returns the SubStringBuilder.
     */
    public StringBuilder printSubLine(StringBuilder line, int n) {
        StringBuilder newStrB = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            newStrB.append(line.charAt(i));
        }
        return newStrB;
    }

    /**
     * isEmpty method checks if the String parameter is not a null and empty.
     * @param line
     * @return
     */
    public boolean isEmpty(String line) {
        String empty = "";
        String isNull = null;
        if (line == empty || line == isNull) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    /**
     * splitStr method splits the String by ',' and finds the longest word.
     * @param line
     */
    public void splitStr(String line) {

        String maxWord = "";
        String[] words = line.split(",");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }
        System.out.println("The longest word in the text is: " + maxWord);

    }

}

