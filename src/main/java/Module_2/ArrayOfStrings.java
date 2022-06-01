package Module_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayOfStrings {
    public static void main(String[] args) throws Exception {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < 8; i++) {
            list[i] = reader.readLine();
        }

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }

    public static void task2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter new string: ");
            String s = reader.readLine();
            str[i] = s;
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = str[i].length();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void task3() throws IOException {
        int[] mass = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 5; i++) {
            int t = mass[i];
            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = t;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }

    public static void task4() throws IOException {
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        smallArray1 = Arrays.copyOfRange(bigArray, 0, 9);
        smallArray2 = Arrays.copyOfRange(bigArray, 10, 20);

        for (int i = 0; i < smallArray2.length; i++) {
            System.out.println(smallArray2[i]);
        }
    }
}



