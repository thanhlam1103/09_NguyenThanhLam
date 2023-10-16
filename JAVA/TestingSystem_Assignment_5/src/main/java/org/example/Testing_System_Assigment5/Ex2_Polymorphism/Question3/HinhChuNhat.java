package org.example.Testing_System_Assigment5.Ex2_Polymorphism.Question3;


    //Tạo 1 class HinhChuNhat có 2 method: tính chu vi và tính diện tích.
    //Hãy implement 2 method này.
public class HinhChuNhat {
    protected double chieuDai;
    protected double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
