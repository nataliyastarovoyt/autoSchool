package Module_2;

public class Str1 {
    public static void main(String[] args) {
        String str = "I like walking. Run and travelling";
        int len = str.length();
        int middle = len / 2;
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        String befor_point = str.substring(0, str.indexOf('.'));
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) count++;
        }
        System.out.println(firstChar);
        System.out.println(lastChar);
        System.out.println(str.charAt(middle));
        System.out.println(count);
        System.out.println(befor_point);
    }

}
