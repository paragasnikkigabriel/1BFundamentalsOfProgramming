import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JediKnightBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== Jedi Knight Military Academy ===");

        System.out.print("Enter applicant's height in cm: ");
        double height = Double.parseDouble(br.readLine());

        System.out.print("Enter applicant's age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        char citizenship = br.readLine().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = br.readLine().toUpperCase().charAt(0);

        if (recommendee == 'R') {
            System.out.println("Information: The applicant is accepted.");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            System.out.println("Information: The applicant is accepted.");
        } else {
            System.out.println("Information: The applicant is rejected.");
        }
    }
}