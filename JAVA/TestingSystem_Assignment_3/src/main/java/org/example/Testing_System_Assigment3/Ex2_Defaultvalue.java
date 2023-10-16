package org.example.Testing_System_Assigment3;

import java.util.Date;
import java.time.LocalDate;
public class Ex2_Defaultvalue {
    public static void main(String[] args) {
        // Tạo mảng Account có 5 phần tử
        Account[] accounts = new Account[5];

        // Khởi tạo dữ liệu cho mảng
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account();
            account.email = "Email " + (i + 1);
            account.username = "User name " + (i + 1);
            account.fullname = "Full name " + (i + 1);
            account.createDate = new Date(); // Ngày hiện tại
            accounts[i] = account;
        }

        // In thông tin các Account trong mảng
        for (Account account : accounts) {
            System.out.println("Email: " + account.email);
            System.out.println("Username: " + account.username);
            System.out.println("Full Name: " + account.fullname);
            System.out.println("Create Date: " + account.createDate);
            System.out.println("----------------------------");
        }
    }
}



