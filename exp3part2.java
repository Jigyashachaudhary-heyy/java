import java.util.Scanner;

public class exp3part2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Extract the last digit and add to sum
            num /= 10;       // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    }

    
}
