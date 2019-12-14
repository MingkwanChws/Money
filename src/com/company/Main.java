package com.company;

public class Main {
    // ฝากธนาคารด้วยเงินต้น 500 บาท ได้ดอกเบี้ยปีละ 1.5% กี่ปีถึงจะมีเงินในบัญชีทั้งหมดมากกว่า 1,000 บาท
    public static int money(float deposit, float interestRate, float target) {
//        float deposit = 500.0f;
//        float interestRate = .015f;
        int years = 1;
        float balance = deposit * (1 + interestRate); // 500 * (1.015)
        while (balance <= target) {
            System.out.printf("year : %d --> balance = %.2f฿\n", years, balance);
            balance = balance * (1 + interestRate);
            years++;
        }
        System.out.printf("year : %d --> balance = %.2f฿\n", years, balance);
        return years;
    }
    public static void main(String[] args) {
//        money();
        int n = money(500, .015f, 1000);
        System.out.printf("years needed = %d", n);
    }
}
