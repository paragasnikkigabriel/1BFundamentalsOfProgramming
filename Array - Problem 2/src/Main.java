
public class Main {
    public static void main(String[] args) {

        // Gumagawa tayo ng array na may 5 slots para sa temperature ng 5 days.
        double[] temperatures = new double[5];

        // Day 1, lagay natin yung 32.5 na temperature.
        temperatures[0] = 32.5;

        // Day 2 naman, 34.0 ang temperature natin.
        temperatures[1] = 34.0;

        // Day 3, 31.8 muna ang temperature dito.
        temperatures[2] = 31.8;

        // Day 4, ilagay natin yung 33.2.
        temperatures[3] = 33.2;

        // Last day na, 35.1 naman ang temperature.
        temperatures[4] = 35.1;

        // For loop naman para ma-display lahat ng temperature, no need isa-isahin.
        for (int i = 0; i < temperatures.length; i++) {

            // Ipi-print dito yung day at temperature niya.
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        }

        // Update natin yung Day 3, from 31.8 gawin nating 32.0.
        temperatures[2] = 32.0;

        // Check natin yung updated temperature ng third day.
        System.out.println("Updated temperature for the third day: " + temperatures[2]);
    }
}
