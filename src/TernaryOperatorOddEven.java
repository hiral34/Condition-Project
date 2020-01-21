import java.util.Scanner;
public class TernaryOperatorOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Math.round(scanner.nextFloat());
        String answer="";
        answer = num % 2 == 0 ? " is a Even number." : " is a odd number.";
        System.out.println(num + answer);
    }
}
