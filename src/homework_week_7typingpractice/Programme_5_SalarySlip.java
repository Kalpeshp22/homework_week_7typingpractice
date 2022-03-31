package homework_week_7typingpractice;

import java.util.Scanner;

public class Programme_5_SalarySlip {

    public static void main(String[] args) {
        // Scanner declartion of rreading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your Name;");
        String name = scanner.nextLine();

        System.out.println(" Enter your EmployeeID; ");
        int employeeId = scanner.nextInt();

        System.out.println(" Enter basic salary ");
        double basicSalary = scanner.nextDouble();

        // Calculationg HRA , DA , TA AND PF
        double HRA = calculateHRA(basicSalary);
        double DA = calculateDA (basicSalary);
        double TA = calculateTA ( basicSalary);
        double PF = calculatePF( basicSalary);

        // Calculating  the gorss salary

        double grossSalary = basicSalary + HRA+DA+TA-PF;

        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeId + "                     |");
        System.out.println("|Employee Name:" + name + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary + "                |");
        System.out.println("|HRA 10%     : " + HRA + "                 |");
        System.out.println("|TA 8%       : " + TA + "                 |");
        System.out.println("|DA 9%       : " + DA + "                 |");
        System.out.println("|PF -20%     : " + PF + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        scanner.close();
       }
        // Calculating HRA
          public static double calculateHRA(double basicSalary){
           return ( basicSalary * 10) / 100;
    }
    //  Calculationg DA
        public static double calculateDA ( double basicSalary){
        return ( basicSalary *  8 ) / 100;

    }
      // Calculationg  TA
        public static double calculateTA ( double basicSalary){
        return ( basicSalary * 9 ) / 100;

    }
      // Calculationg PF
       public  static double calculatePF ( double basicSalary){
        return ( basicSalary * 20) / 100;
       }


}
