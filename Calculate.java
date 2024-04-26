package com.codygym.PersonalExpenseManagement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate {
    static Scanner sc = new Scanner(System.in);

    public static void displayMenu (){
        System.out.println("=====QUẢN LÝ CHI TIÊU CÁ NHÂN=====");
        System.out.println("1.  Tính tiền điện cuối tháng");
        System.out.println("2.  Tính tiền taxi cuối tháng (giả sử: đi 1 lần/ tháng)");
        System.out.println("3.  Tính tiền lương cuối tháng (giả sử: thuế = 15%)");
        System.out.println("4.  Tính tổng thu nhập sau khi chi tiêu cuối tháng");
        System.out.print("-> Mời bạn chọn chức năng [1->4] hoặc nhấn các số khác để thoát chương trình: ");
    }

    public static double calcElectricityBill() {
        System.out.print("Nhập chỉ số điện đã dùng: ");
        double used = sc.nextDouble();
        double fee = used * 3.800;  //giả sử điện thuê trọ là 3.8Kwh
        return fee;
    }

    public static int calcTaxiBill() {
        System.out.print("Nhập số km đã đi trong tháng: ");
        int km = sc.nextInt();
        int fee = km * 20000; // giả sử giá xanhSM taxi là 20.000/1km
        return fee;
    }

    public static double calcSalaryBill() {
        System.out.print("Nhập số tiền lương cuối tháng: ");
        double salary = sc.nextDouble();
        double fee = salary * (1 - 0.15);
        return fee;
    }

    public static double totalIncome() {
        double salary = calcSalaryBill();
        double electricity = calcElectricityBill();
        double taxi = calcTaxiBill();
        double totalIncome = salary - electricity - taxi;
        return totalIncome;
    }
}
