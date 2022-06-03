import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayOfStrings2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++) {
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
