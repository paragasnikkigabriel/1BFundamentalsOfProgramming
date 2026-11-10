
import javax.swing.JOptionPane;

public class Main2 {
    public static void main(String[] args) {

        String output = "Even numbers from 2 to 100:\n";

        for (int i = 2; i <= 100; i += 2) {
            output += i + " ";

            if (i % 20 == 0) {
                output += "\n";
            }
        }

        JOptionPane.showMessageDialog(null, output,
                "Even Numbers", JOptionPane.INFORMATION_MESSAGE);
    }
}
