
import java.util.Scanner;

public class QuadraticSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read input values for a, b, and c
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Step 2: Calculate the discriminant
        double discriminant = Math.sqrt(b * b - 4 * a * c);

        // Step 3: Calculate the two solutions
        double root1 = (-b - discriminant) / (2 * a);
        double root2 = (-b + discriminant) / (2 * a);

        // Step 4: Print the solutions in ascending order
        System.out.println(root1 + " " + root2);
    }
}
