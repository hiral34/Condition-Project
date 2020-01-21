import java.util.Scanner;
public class Average {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Please enter num3: ");
        int num3 = scanner.nextInt();
        System.out.print("Please enter num4: ");
        int num4 = scanner.nextInt();
        System.out.print("Please enter num5: ");
        int num5 = scanner.nextInt();
        float avg = StudentConditionalReport.round(((num1 + num2 + num3 + num4 + num5)/5f),2);
        System.out.println("Average of " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + " is: " + avg);
    }
}
