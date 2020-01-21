import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a Integer number: ");
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println(num + " is a positive number.");
        }else if (num < 0){
            System.out.println(num + " is a negative number.");
        }else{
            System.out.println(num + " is a neutral number.");
        }
    }
}
