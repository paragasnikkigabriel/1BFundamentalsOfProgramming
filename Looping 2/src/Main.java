
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Even numbers from 2 to 100:");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");

            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
