package com.vti.entity.Inheritance.Question1_2;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String name, byte age, Gender gender, String address, String nganhDaoTao) {
        super(name, age, gender, address);
        this.nganhDaoTao = nganhDaoTao;
    }
    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngành đào tạo: ");
        nganhDaoTao = scanner.nextLine();
    }

    @Override
    public void getInfor() {
        super.getInfor();
        System.out.println("Ngành đào tạo  : " + nganhDaoTao);
    }
}
