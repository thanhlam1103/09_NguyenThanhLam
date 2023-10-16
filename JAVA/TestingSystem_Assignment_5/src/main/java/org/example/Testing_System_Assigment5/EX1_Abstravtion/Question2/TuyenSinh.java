package org.example.Testing_System_Assigment5.EX1_Abstravtion.Question2;

import java.util.ArrayList;
import java.util.Scanner;


    //b) Xây dựng interface ITuyenSinh và class TuyenSinh có các
    //chức năng:
    //a. Thêm mới thí sinh.
    //b. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
    //c. Tìm kiếm theo số báo danh.
    //d. Thoát khỏi chương trình.
public class TuyenSinh implements  ITuyenSinh {
    private ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();
    @Override
    public void themMoiThiSinh() {
        Scanner scanner = new Scanner(System.in);
        ThiSinh thiSinh = new ThiSinh();

        System.out.print("Nhap so bao danh: ");
        thiSinh.setSoBaoDanh(scanner.nextLine());
        System.out.print("Nhap ho ten: ");
        thiSinh.setHoTen(scanner.nextLine());
        System.out.print("Nhap dia chi: ");
        thiSinh.setDiaChi(scanner.nextLine());
        System.out.print("Nhap muc uu tien: ");
        thiSinh.setMucUuTien(scanner.nextInt());
        danhSachThiSinh.add(thiSinh);
        System.out.println("Them thi sinh moi thanh cong.");
    }

    @Override
    public void hienThiThongTin() {
        for (ThiSinh thiSinh : danhSachThiSinh) {
            System.out.println(thiSinh);
        }
    }

    @Override
    public void timKiemTheoSoBaoDanh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số báo danh cần tìm đi bé ơi : ");
        String soBaoDanh = scanner.nextLine();

        for (ThiSinh thiSinh : danhSachThiSinh) {
            if (thiSinh.getSoBaoDanh().equals(soBaoDanh)) {
                System.out.println("Thông tin thí sinh cần tìm của bé là : ");
                System.out.println(thiSinh);
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh voi so bao danh " + soBaoDanh);
    }


    @Override
    public void thoatChuongTrinh() {
        System.out.println("Đang thoát...");
        System.exit(0);
    }

}
