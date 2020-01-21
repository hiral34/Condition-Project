import java.util.Scanner;
public class VowelNConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character to find out whether its a vowel or consonant: ");
        String ans = scanner.next();
        char character = ans.toLowerCase().charAt(0);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ){
            System.out.println(ans.charAt(0) + " is a vowel.");
        }else{
            System.out.println(ans.charAt(0) + " is a consonant.");
        }
    }
}
