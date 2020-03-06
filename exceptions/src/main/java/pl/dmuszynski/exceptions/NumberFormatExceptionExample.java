package pl.dmuszynski.exceptions;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        int a;
        String b = "text";
        try {
            a = Integer.parseInt(b);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
