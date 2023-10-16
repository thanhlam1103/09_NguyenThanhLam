package com.vti.entity.Inheritance.Question1_2;

import java.util.Scanner;
public class CongNhan extends CanBo {
    private int level;

    public CongNhan(String name, byte age, Gender gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }


    public int getLevel() {
        return level;
    }
    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập bậc của công nhân: ");
        level = scanner.nextByte();
    }

    @Override
    public void getInfor() {
        super.getInfor();
        System.out.println("Bậc  : " + level);
    }

}