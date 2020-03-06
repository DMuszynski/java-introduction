package pl.dmuszynski.javaintroduction.datatypes;

public class DataTypesTest {

    // primitive data types
    private boolean a = false;
    private char b = 'b';
    private byte c = 1;
    private short d = 2;
    private int e = 3;
    private long f = 4L;
    private float g = 5f;
    private double h = 6d;

    // non-primitive data types
    private Boolean a1 = false;
    private Character b1 = 'b';
    private Byte c1 = 1;
    private Short d1 = 2;
    private Integer e1 = 3;
    private Long f1 = 4L;
    private Float g1 = 5f;
    private Double h1 = 6d;

    private void testBooleanDataTypes() {
        System.out.println("(a == false) : " + (a == false)); // true
        System.out.println("(a != false) : " + (a != false)); // false
        System.out.println("!a : " + (!a)); // true
        System.out.println("(!a ? true : false) : " + (!a ? true : false)); // true
        System.out.println("(a && false) : " + (a && false)); // false
        System.out.println("(a || false) : " + (a || false)); // false
        System.out.println("(a & false) : " + (a & false)); // false
        System.out.println("(a ^ true) : " + (a ^ true)); // true
        System.out.println("(a | true) : " + (a | true)); // true
        System.out.println("(a1 == a) : " + (a1 == a)); // true
        System.out.println("(a1.equals(a)) : " + (a1.equals(a))); // true
        System.out.println("(a1.compareTo(a)) : " + (a1.compareTo(a))); // 0
        System.out.println("(a1 == new Boolean(false)) : " + (a1 == new Boolean(false))); // false
        System.out.println("(a1.equals(new Boolean(false))) : " + (a1.equals(new Boolean(false)))); // true
        System.out.println("(a1.compareTo(new Boolean(false))) : " + (a1.compareTo(new Boolean(false)))); // 0
    }

    private void testCharDataTypes() {
        System.out.println("(b == 'a') : " + (b == 'a')); // false
        System.out.println("(b != 'b') : " + (b != 'b')); // false
        System.out.println("(b >= 'b') : " + (b >= 'b')); // true
        System.out.println("(b < 'b') : " + (b < 'b'));  // false
        System.out.println("b : " + b); // b
        System.out.println("(b + 0) : " + (b + 0)); // 98
        System.out.println("(b | 4) : " + (b | 4)); // 102
        System.out.println("(b & 2) : " + (b & 2)); // 2
        System.out.println("(b ^ 8) : " + (b ^ 8)); // 106
        System.out.println("(++b) : " + (++b)); // c
        System.out.println("(--b) : " + (--b)); // a
        System.out.println("(b++) : " + (b++)); // b
        System.out.println("(b1 == 'b') : " + (b1 == 'b')); // true
        System.out.println("(b1.equals('b')) : " + (b1.equals('b'))); // true
        System.out.println("(b1.compareTo('e')) : " + (b1.compareTo('e'))); // -3
        System.out.println("(b1 == new Character('b')) : " + (b1 == new Character('b'))); // false
        System.out.println("(b1.equals(new Character('b'))) : " + (b1.equals(new Character('b')))); // true
        System.out.println("(b1.compareTo(new Character('f'))) : " + (b1.compareTo(new Character('f')))); // -4
    }

    private void testByteDataTypes() {

    }

    private void testShortDataTypes() {

    }

    private void testIntDataTypes() {

    }

    private void testLongDataTypes() {

    }

    private void testFloatDataTypes() {

    }

    private void testDoubleDataTypes() {

    }

    public static void main(String[] args) {
        DataTypesTest app = new DataTypesTest();
        app.testBooleanDataTypes();
        app.testCharDataTypes();
        app.testByteDataTypes();
        app.testShortDataTypes();
        app.testIntDataTypes();
        app.testLongDataTypes();
        app.testFloatDataTypes();
        app.testDoubleDataTypes();
    }
}
