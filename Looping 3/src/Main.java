
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        double balance = 20000.00;
        double amount;

        while (true) {
            System.out.print("Enter amount (0 to stop): ");
            amount = Double.parseDouble(br.readLine());

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful!");
            } else {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                    System.out.println("Withdrawal successful!");
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

            System.out.printf("Outstanding Balance: P%.2f%n",
                    balance);
        }

        System.out.println("Transaction ended.");
    }
}
