package com.vti.entity.Inheritance.Question1_2;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String job;

    public NhanVien(String name, byte age, Gender gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }
    public String getJob() {
        return job;
    }
    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập công việc: ");
        job = scanner.nextLine();
    }

    @Override
    public void getInfor() {
        super.getInfor();
        System.out.println("Công việc  : " + getJob());
    }
}
