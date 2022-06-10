package Module_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopFor {
    public static void main(String[] args) throws Exception {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    public static void task1() {
        System.out.println("Task 1 is running");
        System.out.println("Displaying even numbers from 1 to 100");
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

    }

    public static void task2() throws IOException {
        System.out.println("Task 2 is running");
        System.out.println("Displaying an m by n rectangle of eights");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("8");
            }
            System.out.print("" + "\n");
        }
    }

    public static void task3() {
        System.out.println("Task 3 is running");
        System.out.println("Displaying a horizontal line of 10 eights and\n" +
                "a vertical line of 10 eights.");
        for (int i = 1; i <= 10; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void task4() {
        System.out.println("Task 4 is running");
        System.out.println("Display a horizontal and vertical line of 10 eights");
        for (int i = 1; i <= 10; i++)
            System.out.print("8");

        System.out.println();

        for (int i = 1; i <= 10; i++)
            System.out.println("8");

    }


    public static void task5() throws IOException {
        System.out.println("Task 5 is running");
        System.out.println("Enter the name");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        for (int i = 1; i <= 10; i++)
            System.out.println(name + " love me.");


    }

    public static void task6() throws IOException, InterruptedException {
        System.out.println("Task 6 is running");
        System.out.println("Countdown from 30 to 0");
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }

        System.out.println("Boom!");
    }
}




