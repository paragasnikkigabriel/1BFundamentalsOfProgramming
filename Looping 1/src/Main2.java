
import javax.swing.JOptionPane;

public class Main2 {
    public static void main(String[] args) {
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            int num = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Enter number " + i + ":"));

            if (num > highest) {
                highest = num;
            }

            if (num < lowest) {
                lowest = num;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest +
                        "\nLowest number: " + lowest);
    }
}
