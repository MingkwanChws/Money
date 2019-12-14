package com.company;

public class Main {
    // ฝากธนาคารด้วยเงินต้น 500 บาท ได้ดอกเบี้ยปีละ 1.5% กี่ปีถึงจะมีเงินในบัญชีทั้งหมดมากกว่า 1,0000 บาท
    public static void money() {
        float deposit = 500.0f;
        float interestRate = .015f;
        int year = 1;
        float balance = deposit * (1 + interestRate); // 500 * (1.015)
    }
    public static void main(String[] args) {
    }
}
