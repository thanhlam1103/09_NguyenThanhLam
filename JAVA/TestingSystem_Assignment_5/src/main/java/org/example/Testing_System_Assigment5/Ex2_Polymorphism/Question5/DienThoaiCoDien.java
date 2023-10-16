package org.example.Testing_System_Assigment5.Ex2_Polymorphism.Question5;

public class DienThoaiCoDien implements ChucNangCBDT {


    @Override
    public void ngheGoi(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    @Override
    public void nhanCuocGoi() {
        System.out.println("Nhận cuộc gọi");
    }

    @Override
    public void guiTinNhan(String tinnhan, String nguoinhan) {
        System.out.println("Gửi tin nhắn: '" + tinnhan + "' đến " + nguoinhan);
    }

    @Override
    public void nhanTinNhan(String tinnhan, String nguoigui) {
        System.out.println("Nhận tin nhắn: '" + tinnhan + "' từ " + nguoigui);
    }

    @Override
    public void sudungVuKhi() {
        System.out.println("Su dụng vũ khí");
    }

    // Điện thoại cổ điển có sẵn chức năng nghe đài radio
    public void listenToRadio() {
        System.out.println("Nghe radio");
    }
}
