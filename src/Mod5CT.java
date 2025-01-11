//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Mod5CT {
    private static int i = 1;

    public static int calculateSum(int n, Scanner scanner) {

        if (n <= 0) {
            return 0;
        }

        else {
            System.out.print("Enter number " + i + ": ");
            i++;
            int myNum = scanner.nextInt();

            return myNum + calculateSum(n - 1, scanner);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numToAdd = 5;

        System.out.println("ENTER " + numToAdd +
                " NUMBERS TO ADD TOGETHER");
        int result = calculateSum(numToAdd, scanner);
        System.out.println("Sum: " + result);

        scanner.close();
    }
}
