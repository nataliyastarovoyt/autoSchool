import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printHelloName();
        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String num = in.nextLine();
        System.out.printf("Hello," + num);
        in.close();
    }

    private static void printHelloName() {
    }
}








