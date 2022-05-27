public class TypeConversion4 {
    public static void main (String [] args) {
        int a = 0;
        int b = 2;
        int c = 5;
        a = a + b;
        b = c - a + b;
        c = a + c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

