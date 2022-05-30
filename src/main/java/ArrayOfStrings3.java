import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayOfStrings3 {
    public static void main(String[] args) throws Exception {

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
}
