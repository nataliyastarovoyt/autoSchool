package Module_2;

import java.util.Scanner;

public class Str3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two different words:");
        String str = in.nextLine();

        String[] strArray = str.split(" ");
        System.out.println("Longest word: " + strArray[findLongestWord(strArray)]);
    }

    public static int findLongestWord(String[] strArray) {
        int maxLong = strArray[0].length();
        int index = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > maxLong) {
                maxLong = strArray[i].length();
                index = i;
            }
        }

        return index;
    }
}

