package pl.dmuszynski.javaintroduction.datatypes;

public class BooleanTest {

    private static final boolean isBooleanVariable = true;

    private static void testArithmeticOperators() {
        // Testing of arithmetic operators with boolean variables
        boolean a = true, b = a;
        // a = (a + b);     // Error
        // a = (a - b);     // Error
        // a = (a * b);     // Error
        // a = (a / b);     // Error
        // a = (a % b);     // Error
    }

    private static void testUnaryOperators() {
        // Testing selected unary operators with boolean variables
        boolean a = true;
        boolean b = false;
        // System.out.println(a++); // Error
        // System.out.println(b--); // Error
        System.out.println(!a); // false
    }

    private static void testComparisonOperators() {
        // Testing of comparison operators
        System.out.println("(true == true) = " + (true == true));   // true
        System.out.println("(true == false) = " + (true == false)); // false
        System.out.println("(true != true) = " + (true != true));   // false
        System.out.println("(true != false) = " + (true != false)); // true
        // System.out.println(true >= false);     // Error
        // System.out.println(true <= false);     // Error
        System.out.println(new Boolean("true") == new Boolean("true"));     // false
        System.out.println(new Boolean("true") == new Boolean("false"));    // false
        System.out.println(new Boolean(true) == new Boolean(true));     // false
        System.out.println(new Boolean(true) == new Boolean(false));     // false
        System.out.println(new Boolean("true").equals(new Boolean("true")));    // true
        System.out.println(new Boolean("true").equals(new Boolean("false")));   // false
        System.out.println(new Boolean("true").compareTo(new Boolean("true")));    // 0
        System.out.println(new Boolean("true").compareTo(new Boolean("false")));   // 1
        System.out.println(new Boolean("false").compareTo(new Boolean("true")));   // -1
    }

    private static void testLogicalOperators() {
        // Testing selected logical operators (!, &&, ||)
        // System.out.println("!tmp " + !1); // Error
        System.out.println("(true) = " + (true));   // true
        System.out.println("(!true) = " + (!true)); // false
        System.out.println("(isBooleanVariable) = " + isBooleanVariable);   // true
        System.out.println("(!isBooleanVariable) = " + !isBooleanVariable); // false
        System.out.println("(true && true) = " + (true && true));   // true
        System.out.println("(true || true) = " + (true || true));   // true
        System.out.println("(true || true) = " + (true | true));   // true
    }

    private static void testBitOperators() {
        // Testing selected bit operators (&, |, ^)
        System.out.println("(true & true) = " + (true & true));   // true
        System.out.println("(true | true) = " + (true | true));   // true
        System.out.println("(true ^ true) = " + (true ^ true));   // false
    }

    public static void main(String[] args) {
        testArithmeticOperators();
        testUnaryOperators();
        testComparisonOperators();
        testLogicalOperators();
        testBitOperators();
    }
}
