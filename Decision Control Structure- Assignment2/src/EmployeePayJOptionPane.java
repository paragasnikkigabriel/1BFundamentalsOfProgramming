import javax.swing.JOptionPane;

public class EmployeePayJOptionPane {
    public static void main(String[] args) {

        String rateInput = JOptionPane.showInputDialog(
                "Enter hourly pay rate:"
        );

        String hoursInput = JOptionPane.showInputDialog(
                "Enter hours worked:"
        );

        double rate = Double.parseDouble(rateInput);
        double hours = Double.parseDouble(hoursInput);

        double grossPay = rate * hours;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        String output = String.format(
                "--- PAY SUMMARY ---\n" +
                        "Gross Pay: Php %.2f\n" +
                        "Withholding Tax: Php %.2f\n" +
                        "Net Pay: Php %.2f",
                grossPay, withholdingTax, netPay
        );

        JOptionPane.showMessageDialog(null, output);
    }
}