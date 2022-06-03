import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayOfStrings4 {
    public static void main(String[] args) throws Exception {
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
