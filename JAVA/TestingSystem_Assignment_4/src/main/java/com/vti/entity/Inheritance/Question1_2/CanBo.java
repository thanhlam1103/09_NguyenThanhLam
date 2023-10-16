package com.vti.entity.Inheritance.Question1_2;


import java.util.Scanner;
public class CanBo {
    private String name;
    private byte age;
    private Gender gender;
    private String address;

    public CanBo() {
    }
    public CanBo(String name, byte age, Gender gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public Byte getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    private void setGender(int gender) {
        if (gender == 0) {
            this.gender = Gender.valueOf("MALE");
        } else if (gender == 1) {
            this.gender = Gender.valueOf("FEMALE");
        } else {
            this.gender = Gender.valueOf("UNKNOWN");
        }
    }

    public String getDiachi() {
        return address;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        name = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        age = scanner.nextByte();

        System.out.println("Nhập giới tính (0:Nam, 1:Nữ, khác: Unknown): ");
        setGender(scanner.nextInt());

        System.out.println("Nhập địa chỉ: ");
        address = scanner.nextLine();
    }

    public void getInfor() {
        System.out.println("Họ tên      : " + name);
        System.out.println("Tuổi        : " + age);
        System.out.println("Giới tính   : " + gender);
        System.out.println("Địa chỉ     : " + address);
    }

    @Override
    public String toString() {
        return "CanBo{" + "hoten='" + name + '\'' + ", tuoi=" + age + ", gt=" + gender + ", diachi='" + address
                + '\'' + '}';
    }
}
