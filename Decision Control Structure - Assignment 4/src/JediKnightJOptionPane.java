import javax.swing.JOptionPane;

public class JediKnightJOptionPane {
    public static void main(String[] args) {

        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter applicant's height in cm:")
        );

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter applicant's age:")
        );

        char citizenship = JOptionPane.showInputDialog(
                "Enter citizenship code (C/N):"
        ).toUpperCase().charAt(0);

        char recommendee = JOptionPane.showInputDialog(
                "Enter recommendee code (R/N):"
        ).toUpperCase().charAt(0);

        String result;

        if (recommendee == 'R') {
            result = "Information: The applicant is accepted.";
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            result = "Information: The applicant is accepted.";
        } else {
            result = "Information: The applicant is rejected.";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}