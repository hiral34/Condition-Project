import java.util.Scanner;
public class PehchaanKaun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        String ans = scanner.next();
        char character = ans.charAt(0);
        int c = character;
        if( (c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
            System.out.println(ans + " is a alphabet.");
        }else if (c >= 48 && c <= 57) {
            System.out.println(ans + " is a number.");
        }else{
            System.out.println(ans + " is a symbol.");
        }
    }
}
