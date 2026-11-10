
import javax.swing.JOptionPane;

public class Main2 {
    public static void main(String[] args) {

        double balance = 20000.00;
        double amount;

        while (true) {
            amount = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Enter amount (0 to stop):"));

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;

                JOptionPane.showMessageDialog(null,
                        "Deposit successful!");
            } else {
                if (Math.abs(amount) <= balance) {
                    balance += amount;

                    JOptionPane.showMessageDialog(null,
                            "Withdrawal successful!");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "INSUFFICIENT FUNDS!");
                }
            }

            JOptionPane.showMessageDialog(null,
                    String.format("Outstanding Balance: P%.2f",
                            balance));
        }

        JOptionPane.showMessageDialog(null,
                "Transaction ended.");
    }
}
