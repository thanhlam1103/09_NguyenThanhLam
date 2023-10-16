package org.example.Testing_System_Assigment5.Ex2_Polymorphism.Question5;

public class DienThoaiThongMinh implements ChucNangDTTM {
    @Override
    public void ngheGoi(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    @Override
    public void nhanCuocGoi() {
        System.out.println("Nhận cuộc gọi ");
    }

    @Override
    public void guiTinNhan(String tinnhan, String nguoinhan) {
        System.out.println("Gửi tin nhắn : '" + tinnhan + "' đến " + nguoinhan);
    }

    @Override
    public void nhanTinNhan(String tinnhan, String nguoigui) {
        System.out.println("Nhận tin nhắn : '" + tinnhan + "' từ " + nguoigui);
    }

    @Override
    public void sudungVuKhi() {
        System.out.println("Sử dụng vũ khí");
    }

    @Override
    public void use3G() {
        System.out.println("Sử dụng 3G");
    }

    @Override
    public void chupHinh() {
        System.out.println("Chụp hình ");
    }
}
