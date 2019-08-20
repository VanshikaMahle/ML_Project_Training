package question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        System.out.println(v1 + " + " + v2 + " = " + (v1+v2));
        System.out.println(v1 + " - " + v2 + " = " + (v1-v2));
        System.out.println(v1 + " * " + v2 + " = " + (v1*v2));
        System.out.println(v1 + " / " + v2 + " = " + (v1/v2));
        System.out.println(v1 + " % " + v2 + " = " + (v1%v2));
        scanner.close();

    }
}
