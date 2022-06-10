package Module_2;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) throws Exception {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() throws IOException {
        System.out.println("Task 1 is running");
        System.out.println("Enter two numbers from the keyboard, and display the minimum of them");
        int a, b;
        String c, d;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader r = new BufferedReader(inputStreamReader);
        c = r.readLine();
        d = r.readLine();
        a = Integer.parseInt(c);
        b = Integer.parseInt(d);
        if (a < b) System.out.println(a);
        else System.out.println(b);

    }

    public static void task2() throws IOException {
        System.out.println("Task 2 is running");
        System.out.println("Enter four numbers from the keyboard, and print the maximum of them");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        if (a >= b && a >= c && a > d) {
            System.out.println(a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println(b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(c);
        } else if (d >= a && d >= b && d >= c) {
            System.out.println(d);
        }
    }

    public static void task3() throws IOException {
        System.out.println("Task 3 is running");
        System.out.println("Enter three numbers from the keyboard and print them in descending order");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        if (x >= y && x >= z && y > z) {
            System.out.println(x + " " + y + " " + z);
        } else if (x >= y && z >= y && x >= z) {
            System.out.println(x + " " + z + " " + y);
        } else if (y >= x && y >= z && x >= z) {
            System.out.println(y + " " + x + " " + z);
        } else if (y >= x && y >= z && z >= x) {
            System.out.println(y + " " + z + " " + x);
        } else if (z >= x && z >= y && x >= y) {
            System.out.println(z + " " + x + " " + y);
        } else if (z >= x && z >= y && y >= x) {
            System.out.println(z + " " + y + " " + x);
        }
    }

    public static void task4() throws IOException {
        System.out.println("Task 4 is running");
        System.out.println("Enter two names from the keyboard, and if the names are the same, display the message");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        if (n1.equals(n2)) {
            System.out.println("Names are identical");
        } else if (n1.length() == n2.length()) {
            System.out.println("Name lengths are equal");
        }
    }

    public static void task5() throws Exception {
        System.out.println("Task 5 is running");
        System.out.println("Enter your name and age");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        int nage = Integer.parseInt(age);

        if (nage < 18) {
            System.out.println("Grow up some more");
        }


    }

    public static void task6() throws IOException {
        System.out.println("Task 6 is running");
        System.out.println("Enter name and age");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        int nage = Integer.parseInt(age);

        if (nage > 20) {
            System.out.println("And 18 is enough");
        }
    }

    public static void task7() throws IOException {
        System.out.println("Task 7 is running");
        System.out.println("Seven attempts to guess the number");
        Random newRandom = new Random();
        int randomnumber = newRandom.nextInt(20) + 1;
        System.out.println("Input number from 0 to 20:");
        Scanner newScanner = new Scanner(System.in);
        int scannerNumber = newScanner.nextInt();

        if (scannerNumber > randomnumber || scannerNumber < randomnumber) {
            for (int schetchik = 7; schetchik > 0; --schetchik) {
                if (scannerNumber > randomnumber) {
                    System.out.println("A lot of: " + schetchik);
                    Scanner newscannerT = new Scanner(System.in);
                    int scannerttwo = newscannerT.nextInt();
                    scannerNumber = scannerttwo;
                } else if (scannerNumber < randomnumber) {
                    System.out.println("Few " + schetchik);
                    Scanner newscnnaerThr = new Scanner(System.in);
                    int newScannerThree = newscnnaerThr.nextInt();
                    scannerNumber = newScannerThree;
                }
            }
            if (scannerNumber == randomnumber) {
                System.out.println("Win!");
            }
        }
        if (scannerNumber > randomnumber || scannerNumber < randomnumber) {
            System.out.println("Guessed wrong!");
        }
    }
}
