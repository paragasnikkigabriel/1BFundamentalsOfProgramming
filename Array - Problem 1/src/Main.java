
import java.util.Arrays; // Dito nag iimport ng arrays para magamit ang deepToString() method.

public class Main {
    public static void main(String[] args) {

        // Dito po gumawa at naglagay ng pangalan sa 2D string array na may 2 rows at 3 columns
        String[][] seats = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Emma", "Frank"}
        };

        // Dito kinukuha at pinapakita ang pangalan sa second row at third column
        // Ang index ng second row ay 1 at ang third column ay 2
        System.out.println("Person in second row, third column: " + seats[1][2]);

        // Pinapalitan ang pangalan na Bob ng Vacant sa first row, second column
        seats[0][1] = "Vacant";

        // Ipinapakita ang buong seating arrangement sa isang linya gamit ang deepToString()
        System.out.println("Updated Seating Arrangement: " + Arrays.deepToString(seats));
    }
}
