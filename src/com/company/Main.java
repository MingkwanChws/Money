package com.company;

public class Main {
    // ฝากธนาคารด้วยเงินต้น 500 บาท ได้ดอกเบี้ยปีละ 1.5% กี่ปีถึงจะมีเงินในบัญชีทั้งหมดมากกว่า 1,000 บาท
    public static void money() {
        float deposit = 500.0f;
        float interestRate = .015f;
        int years = 1;
        float balance = deposit * (1 + interestRate); // 500 * (1.015)
        while (balance <= 1000) {
            balance = balance * (1 + interestRate);
            years++;
        }
        System.out.printf("year : %d --> balance = %.2f฿", years, balance);
    }
    public static void main(String[] args) {
        money();
    }
}
