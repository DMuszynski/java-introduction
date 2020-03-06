package pl.dmuszynski.exceptions;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object i = Integer.valueOf(42);
        try {
            String s = (String) i;
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }
}
