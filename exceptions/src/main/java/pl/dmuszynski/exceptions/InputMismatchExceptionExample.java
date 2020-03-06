package pl.dmuszynski.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // input string value to throw exception
            scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}
