import java.util.Scanner;
public class CityNameSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character from a - g: ");
        String alphabet = scanner.next().toLowerCase();
        char first_alphabet = alphabet.charAt(0);
        switch (first_alphabet){
            case 'a':
                System.out.println("Amerstdam");
                break;
            case 'b':
                System.out.println("Bhavnagar");
                break;
            case 'c':
                System.out.println("Cardiff");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'e':
                System.out.println("Edinburgh");
                break;
            case 'f':
                System.out.println("Faridabad");
                break;
            case 'g':
                System.out.println("Gandhinagar");
                break;
            default:
                System.out.println("please enter a valid input.");
        }
    }
}
