package pl.dmuszynski.javaintroduction.text;

public class StringTest {

    private static String STR = "string";

    public static void stringMethodTest() {
        System.out.println("STR.equals(1) : " + STR.equals(1)); // false
        System.out.println("STR.equals(\"string\") : " + STR.equals("string")); // true
        System.out.println("STR.equals(new String(\"string\")) : " + STR.equals(new String("string"))); // true

        System.out.println("STR.charAt(4) : " + STR.charAt(4)); // n
        // System.out.println("STR.charAt(10) : " + STR.charAt(10)); // StringIndexOutOfBoundsException: String index out of range: 10

        System.out.println("STR.compareTo(\"string\") : " + STR.compareTo("string")); // 0
        System.out.println("STR.compareTo(\"a\") : " + STR.compareTo("a")); // 18
        System.out.println("STR.compareTo(new String(\"a\")) : " + STR.compareTo(new String("a"))); // 18

        System.out.println("STR.codePointAt(1) : " + STR.codePointAt(5)); // 103 (char index)
       // System.out.println("STR.codePointAt(1) : " + STR); // 103 (char index)
        STR = new String("aaa");
        System.out.println(STR);
    }

    public static void main(String[] args) {
        stringMethodTest();
    }
}
