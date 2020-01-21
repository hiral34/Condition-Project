import java.util.Scanner;
import java.math.BigDecimal;
public class StudentReport {
    public static float round(float number, int decimalPlace) {
        BigDecimal bd = new BigDecimal(number);
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
    public static void main(String[] args) {
        String grade="";
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter Student name: ");
        String name = scanner.next();
        System.out.print("Please Enter marks for Maths: ");
        int maths = scanner.nextInt();
        System.out.print("Please Enter marks for English: ");
        int english = scanner.nextInt();
        System.out.print("Please Enter marks for Science: ");
        int science = scanner.nextInt();
        int total = maths + english + science;
        float percent ;
            percent = round(total / 3f,2);
        if (percent >= 80){
            grade = "A+";
        }else if(percent >= 60){
            grade="A";
        }else if(percent >= 50){
            grade="B";
        }else if(percent >= 35){
            grade="C";
        }else{
            grade="Fail";
        }
        System.out.println(name + " has scored " + total + " out of 300 which is " + percent + "% thus, " + name + " has scored Grade " + grade + ".");
        System.out.println("----------" + name + "'s Report ---------");
        System.out.println("Maths: " + maths);
        System.out.println("Science: " + science);
        System.out.println("English: " + english);
        System.out.println("---------------------");
        System.out.println("Total: " + total);
        System.out.println("Percent: " + percent + "%");
        System.out.println("Grade: " + grade);
    }
}
