package Module_2;

import java.util.Scanner;

public class TypeConversion1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1 is running");
        int q = 21;
        int w = 8;
        int a = q / w;
        int b = q % w;
        System.out.println("21/8 is " + a + " and " + b + " remainder.");
    }

    public static void task2() {
        System.out.println("Task2 is running");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your two-digit number:");
        int a = sc.nextInt();
        System.out.println((a / 10) + (a % 10));
        sc.close();

    }

    public static void task3() {
        System.out.println("Task3 is running");
        float n = 22.99f;
        float y = Math.round(n);
        System.out.println("Result=" + y);
    }

    public static void task4() {
        System.out.println("Task4 is running");
        int a = 0;
        int b = 2;
        int c = 5;

        a = a + b;
        b = c - a + b;
        c = a + c;
        System.out.println("a stored the value a+b");
        System.out.println(a);
        System.out.println("b the difference of the old values c-a");
        System.out.println(b);
        System.out.println("c stored the sum of the old values a+b+c");
        System.out.println(c);
    }
}
