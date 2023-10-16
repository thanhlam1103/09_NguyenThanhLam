package org.example.Testing_System_Assigment5.Ex2_Polymorphism.Question3;


    //hãy tạo 1 class HinhVuong extends HinhChuNhat, có 2
    //method tính chu vi và tính diện tích
public class HinhVuong extends  HinhChuNhat{
    public HinhVuong(double canh) {
        super(canh, canh); // Hình vuông là trường hợp đặc biệt của hình chữ nhật
    }
    @Override
    public double tinhChuVi() {
        System.out.println("Tính chu vi theo Hình Vuông");
        return super.tinhChuVi();
    }

    @Override
    public double tinhDienTich() {
        System.out.println("Tính diện tích theo Hình Vuông");
        return super.tinhDienTich();
    }
}
