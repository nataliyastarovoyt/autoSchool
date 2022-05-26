import java.util.Scanner;

public class PrintMethod {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Input your name: ");
            String num = in.nextLine();

            System.out.printf("Hello," + num);
            in.close();
        }
    }

