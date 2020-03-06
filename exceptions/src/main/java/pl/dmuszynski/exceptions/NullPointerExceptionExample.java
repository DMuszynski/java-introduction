package pl.dmuszynski.exceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Object obj = null;
        try {
            obj.getClass();
        } catch (NullPointerException e) {
            System.out.println("Object is not initialized : " + e);
        }
    }
}
