package Module_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopWhile {
    public static void main(String[] args) throws Exception {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Task 1 is running");
        System.out.println("Displaying numbers from 1 to 10");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void task2() {
        System.out.println("Task 2 is running");
        System.out.println("Displaying numbers from 10 to 1");
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void task3() throws IOException {
        System.out.println("Task 3 is running");
        System.out.println("Enter a string and the number N from the keyboard.\n" +
                "Display string N times");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        String n1 = read.readLine();
        int n = Integer.parseInt(n1);
        int i = 0;

        while (i < n) {
            System.out.println(s);
            i++;
        }
    }

    public static void task4() throws IOException {
        System.out.println("Task 4 is running");
        System.out.println("Displaying a square of 10x10 letters S");
        int x = 1, y = 1;
        while (y <= 10) {
            while (x < 10) {
                System.out.print("S");
                x++;
            }
            System.out.println("S");
            y++;
            x = 1;
        }
    }

    public static void task5() throws IOException {
        System.out.println("Task 5 is running");
        System.out.println("Displaying the multiplication table 10x10");
        int i = 1, n = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            while (n <= 9) {
                n++;
                System.out.print(i * n + " ");
            }
            i++;
            n = 1;
            System.out.println("");
        }

    }
}