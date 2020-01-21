import java.util.Scanner;

public class InterchangeValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter number2: ");
        int num2 = scanner.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Now number1 is: " + num1 + " and number2 is: " + num2);
    }
}
