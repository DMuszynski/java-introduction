package pl.dmuszynski.exceptions;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            int devide = x/y;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0" + e);
        }
    }
}
