import java.util.Scanner;

public class EmployeeSalary {
    public static void main (String[] args){

        Scanner scanner= new Scanner(System.in);

        System.out.println(" Enter Employee id");
        int employeeID = scanner.nextInt();

        System.out.println(" Enter Employee Name ");
        String employeename = scanner.next();

        System.out.println(" Employee Basic Salary ");
       double basicsalary = scanner.nextDouble();

       double HRA, TA, DA, PF, grossSalary;

       // calculate HAR,  TA, DA, and PF
        if (basicsalary > 0) {
            HRA = basicsalary * 0.10;
            System.out.println("HRA: £" + HRA);
            DA = basicsalary * 0.08;
            System.out.println("DA: £" + DA);
            TA = basicsalary * 0.09;
            System.out.println("TA: £" + TA);
            PF = basicsalary * 0.20;
            System.out.println("PF: £" + PF);
        }else {
            System.out.println( " ");




        }



    }
}
