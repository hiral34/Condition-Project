import java.util.Scanner;
public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Sales ID: ");
        int sid = scanner.nextInt();
        System.out.print("Please enter Seller Name: ");
        String seller_name = scanner.next();
        System.out.print("Please enter Sales Amount: ");
        int sales_amt = scanner.nextInt();
        System.out.print("Please enter Basic Salary: ");
        int basic_salary = scanner.nextInt();
        float commission = 0;
        if (sales_amt >= 50000){
            commission = StudentConditionalReport.round(((sales_amt * 35 )/100f),2);
        }else if (sales_amt >= 30000) {
            commission = StudentConditionalReport.round(((sales_amt * 20) / 100f),2);
        }else if (sales_amt >= 20000) {
            commission = StudentConditionalReport.round(((sales_amt * 10) / 100f),2);
        }else if (sales_amt >= 10000) {
            commission = StudentConditionalReport.round(((sales_amt * 5) / 100f),2);
        }else if (sales_amt > 0) {
            commission = StudentConditionalReport.round(((sales_amt * 2) / 100f),2);
        }
        System.out.println("-------------- " + seller_name + "'s Monthly Salary Slip -----------------");
        System.out.println("Sales ID: " + sid);
        System.out.println("Seller Name: " + seller_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Commission: " + commission);
        System.out.println("Grosse Salary: " + (basic_salary + commission));
    }

}

