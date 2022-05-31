package Module_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = in.nextLine();
        System.out.print("Input your surname: ");
        String surname = in.nextLine();
        in.close();

        printHelloName(name);
        System.out.println(calculateSymbols(surname));
        printNameAndSurname(name, surname);
        printNumberOfSymbols(name);
    }

    private static void printHelloName(String s) {
        System.out.println("Hello," + s);
    }

    private static void printNumberOfSymbols(String s) {
        int n;
        n = s.length();
        System.out.println("Lengths is: " + n);
    }

    private static void printNameAndSurname(String n, String s){
        System.out.println(n + " " + s);
    }

    private static int calculateSymbols(String s) {
        int n;
        n = s.length();
        return n;
    }
}








