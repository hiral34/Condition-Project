import java.util.Scanner;
public class UpperToLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a alphabet to convert into lowercase: ");
        String alphabet = scanner.next().toLowerCase();
        char first_alphabet = alphabet.charAt(0);
        System.out.println(first_alphabet + " is now written in all lowercase.");
    }
}
