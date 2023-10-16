package org.example.Testing_System_Assigment5.Ex2_Polymorphism.Question2;


import java.util.Scanner;

//Tạo 1 class Person chứa các property sau: tên, giới tính, ngày sinh, địa
    //chỉ với đầy đủ getter setter, constructor không tham số, constructor đầy đủ tham số
public class Person {
    private String name;
    private String gender;
    private String birthDate;
    private String address;

    // Contrustor không tham số
    public Person() {
    }

    // Constructor đầy đủ tham số
    public Person(String name, String gender, String birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }
        public void setName(String name) {
            this.name = name;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public String getAddress() {
            return address;
        }

        //a) Viết phương thức inputInfo(), nhập thông tin Person từ bàn phím

        public void inputInfo() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            System.out.print("Enter gender: ");
            gender = scanner.nextLine();
            System.out.print("Enter birth date: ");
            birthDate = scanner.nextLine();
            System.out.print("Enter address: ");
            address = scanner.nextLine();
        }
    //b) Viết phương thức showInfo(), hiển thị tất cả thông tin Person
        public void showInfo() {
            System.out.println("Name: " + name);
            System.out.println("Gender: " + gender);
            System.out.println("Birth Date: " + birthDate);
            System.out.println("Address: " + address);
        }

}
