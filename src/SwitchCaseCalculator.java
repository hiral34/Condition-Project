import java.util.Scanner;
public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter a number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Please enter another number: ");
        float num2 = scanner.nextFloat();
        System.out.print("Please enter a sign from (+,-,*,/) to carryout operation on these numbers: ");
        String ans = scanner.next();
        char sign = ans.charAt(0);
        switch (sign){
            case '+':
                System.out.println(num1 + " + " + num2 + " is: " + StudentReport.round((num1+num2),2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " is: " + StudentReport.round((num1-num2),2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " is: " + StudentReport.round((num1*num2),2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " is: " + StudentReport.round((num1/num2),2));
                break;
            default:
                System.out.println("Invalid sign");
        }
    }
}
