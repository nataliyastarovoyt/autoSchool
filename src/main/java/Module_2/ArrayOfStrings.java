package Module_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOfStrings {
    public static void main(String[] args) throws Exception {
        task1();
        task2();


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
}

