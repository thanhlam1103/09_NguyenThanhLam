package org.example.Testing_System_Assigment5.Ex2_Polymorphism.Question5;

public class PhoneDemo {
    public static void main(String[] args) {
        DienThoaiCoDien dienThoaiCoDien = new DienThoaiCoDien();
        dienThoaiCoDien.ngheGoi("123456789");
        dienThoaiCoDien.guiTinNhan("Hello", "987654321");
        dienThoaiCoDien.nhanCuocGoi();
        dienThoaiCoDien.nhanTinNhan("Chào em", "ThanhLam");
        dienThoaiCoDien.listenToRadio();
        dienThoaiCoDien.sudungVuKhi();

        DienThoaiThongMinh smartphone = new DienThoaiThongMinh();
        smartphone.ngheGoi("987654321");
        smartphone.chupHinh();
        smartphone.sudungVuKhi();
    }
}
