import java.util.Scanner;

public class ScholarshipScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" College Scholarship Application ");

        System.out.print("Enter NSAT score: ");
        double nsat = input.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter entrance examination score: ");
        double entrance = input.nextDouble();

        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Information: The applicant is rejected.");
        } else if (salary <= 3500 && average >= 91) {
            System.out.println("Information: The applicant is accepted.");
        } else {
            System.out.println("Information: The applicant is for further study.");
        }

        input.close();
    }
}