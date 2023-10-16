package com.vti.entity.Abstraction.Question2_3;

public abstract class User {
    private String name;
    protected double salaryRatio;

    public User(String name, double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }
    //Viết hàm calculatePay() dạng abstract trả về thu nhập của nhân viên, kiểu double.
    public abstract double calculatePay();

    //c) Viết hàm displayInfor()
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary ratio: " + salaryRatio);
        System.out.println("Pay: " + calculatePay());
    }
}
