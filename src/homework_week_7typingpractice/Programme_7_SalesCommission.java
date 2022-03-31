package homework_week_7typingpractice;

import java.util.Scanner;

public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        // Scanner declaration for reading inpu for console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Seller Name");
        String name = scanner.nextLine();
        System.out.println(" Enter Seller Id");
        int sellerId = scanner.nextInt();
        System.out.println(" Enter Sales Amount");
        int salesAmount = scanner.nextInt();
        System.out.println(" Enter Basic Salary");
        int baiscSalary = scanner.nextInt();
        // Creating the object to call instance method
        Programme_7_SalesCommission salesCommission = new Programme_7_SalesCommission();
        int grossSalary = baiscSalary + salesCommission.calculateCommision(salesAmount);
        System.out.println(" Seller name is            :  " + name);
        System.out.println(" Seller id is              :  " + sellerId);
        System.out.println(" Seller's sales amount is  :  " + salesAmount);
        System.out.println(" Seller's basic salary is  :  " + baiscSalary);
        System.out.println(" Seller's gross salary is  :  " + grossSalary);
        // closing ther scanner object.
        scanner.close();
    }  //  Calculationg the sales commission

    public int calculateCommision(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println(" Sales Commission is  " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println(" Sales commission is  " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println(" Sales commision is  " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 10) / 100;
            System.out.println(" Sales commision is   " + commission);
        } else {
            commission = (salesAmount * 2)/100;
            System.out.println(" Sales Commision is   " + commission);
        }
        return commission;

        }
    }

