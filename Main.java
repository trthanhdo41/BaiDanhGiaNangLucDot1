package com.codygym.PersonalExpenseManagement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static DecimalFormat currency = new DecimalFormat("#,###,##0.00 (VND)");
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            calc.displayMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Tổng tiền điện tháng này là: " +currency.format(calc.calcElectricityBill()) + "\n");
                    break;
                case 2:
                    System.out.print("Tổng tiền đi taxi tháng này là: " +currency.format(calc.calcTaxiBill()) + "\n");
                    break;
                case 3:
                    System.out.print("Tiền lương được nhận sau khi trừ thuế là: " +currency.format(calc.calcSalaryBill()) + "\n");
                    break;
                case 4:
                    System.out.println("Tổng thu nhập sau khi chi tiêu cuối tháng : " +currency.format(calc.totalIncome()) + "\n");
                    break;
                default:
                    System.out.println("Cảm ơn bạn đã dùng chương trình.");
            }
        }while(choice > 0 && choice < 5);
    }
}
