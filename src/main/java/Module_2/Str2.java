package Module_2;

import java.util.Scanner;

public class Str2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String oldString = "Nataliya from Ukraine";
        String newString = oldString.replace("Nataliya", "Lena");
        System.out.print("Input your name and where are you from : ");
        String num = in.nextLine();
        System.out.printf(newString);
        in.close();
    }

}
