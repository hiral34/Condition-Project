import java.math.BigDecimal;
import java.util.Scanner;
import java.math.BigDecimal;
public class EmployeeSalary {
    public static float round(float number, int decimalPlace) {
        BigDecimal bd = new BigDecimal(number);
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Employee ID: ");
        int eID = scanner.nextInt();
        System.out.print("Please Enter Employee Name: ");
        String name = scanner.next();
        System.out.print("Please Enter Employee Basic Salary: ");
        float salary = round(scanner.nextFloat(),2);
        float hra = round(((salary * 10) / 100),2);
        float da = round(((salary * 8) / 100),2);
        float ta = round(((salary * 9) / 100),2);
        float pf = round(((salary * 20) / 100),2);
        float gross_salary = round(((salary + hra + da + ta) - pf),2);
        System.out.println("-------------- " + name + "'s Monthly Salary Slip -----------------");
        System.out.println("Employee ID: " + eID);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Basic Salary: " + salary);
        System.out.println("DA: " + da);
        System.out.println("TA: " + ta);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Total Gross Salary: " + gross_salary);
    }
}
