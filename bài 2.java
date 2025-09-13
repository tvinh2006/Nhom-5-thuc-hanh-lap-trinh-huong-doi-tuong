// MenuExample.java
import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: System.out.println("Hello!"); break;
                case 2: System.out.println("Goodbye!"); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}