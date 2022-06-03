package Module_2;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) throws Exception {
        task1();
        task2();

    }

    public static void task1() {
        System.out.println("Task 1 is running");
        System.out.println("Output first, last and middle (if any) characters");
        System.out.println("Displaying the number of spaces");
        String str = "I like walking. Run and travelling";
        int len = str.length();
        int middle = len / 2;
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        String befor_point = str.substring(0, str.indexOf('.'));
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) count++;
        }
        System.out.println(firstChar);
        System.out.println(lastChar);
        System.out.println(str.charAt(middle));
        System.out.println(count);
        System.out.println(befor_point);
    }

    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Task 2 is running");
        String oldString = "Nataliya from Ukraine";
        String newString = oldString.replace("Nataliya", "Lena");
        System.out.print("Input your name and where are you from : ");
        String num = in.nextLine();
        System.out.printf(newString);
        in.close();

    }
}







