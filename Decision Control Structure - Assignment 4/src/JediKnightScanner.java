import java.util.Scanner;

public class JediKnightScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Jedi Knight Military Academy ===");

        System.out.print("Enter applicant's height in cm: ");
        double height = input.nextDouble();

        System.out.print("Enter applicant's age: ");
        int age = input.nextInt();

        System.out.print("Enter citizenship code (C/N): ");
        char citizenship = input.next().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = input.next().toUpperCase().charAt(0);

        if (recommendee == 'R') {
            System.out.println("Information: The applicant is accepted.");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            System.out.println("Information: The applicant is accepted.");
        } else {
            System.out.println("Information: The applicant is rejected.");
        }

        input.close();
    }
}