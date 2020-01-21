import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year in 4 digit: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year as it is exactly divisible by 4, 100 and 400.");
                } else {
                    System.out.println(year + " is not a leap year as even though it is exactly divisible by 4 and 100 but not by 400.");
                }
            } else {
                System.out.println(year + " is a leap year as it is exactly divisible by 4.");
            }
        } else {
            System.out.println(year + " is not a leap year as it is not exactly divisible by 4.");
        }
    }
}
