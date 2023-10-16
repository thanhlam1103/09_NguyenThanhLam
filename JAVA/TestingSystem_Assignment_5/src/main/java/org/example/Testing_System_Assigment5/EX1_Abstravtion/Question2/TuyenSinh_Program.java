package org.example.Testing_System_Assigment5.EX1_Abstravtion.Question2;

import java.util.Scanner;

public class TuyenSinh_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tuyenSinh.themMoiThiSinh();
                    break;
                case 2:
                    tuyenSinh.hienThiThongTin();
                    break;
                case 3:
                    tuyenSinh.timKiemTheoSoBaoDanh();
                    break;
                case 4:
                    tuyenSinh.thoatChuongTrinh();
                    break;
                default:
                    System.out.println("Chon sai chuc nang. Vui long chon lai.");
                    break;
            }
        }
    }
}
