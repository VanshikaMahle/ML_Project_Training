package question1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine().trim();
        System.out.println("Welcome, " + userName + "!");
        scanner.close();

    }
}