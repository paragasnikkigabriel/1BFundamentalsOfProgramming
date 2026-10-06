import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScholarshipBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" College Scholarship Application ");

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(br.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(br.readLine());

        System.out.print("Enter entrance examination score: ");
        double entrance = Double.parseDouble(br.readLine());

        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Information: The applicant is rejected.");
        } else if (salary <= 3500 && average >= 91) {
            System.out.println("Information: The applicant is accepted.");
        } else {
            System.out.println("Information: The applicant is for further study.");
        }
    }
}
