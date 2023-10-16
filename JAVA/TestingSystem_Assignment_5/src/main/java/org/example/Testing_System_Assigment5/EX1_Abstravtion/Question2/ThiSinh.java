package org.example.Testing_System_Assigment5.EX1_Abstravtion.Question2;

public class ThiSinh {
    private String SoBaoDanh;
    private String HoTen;
    private String DiaChi;
    private int MucUuTien;

//    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
//        this.SoBaoDanh = soBaoDanh;
//        this.HoTen = hoTen;
//        this.DiaChi = diaChi;
//        this.MucUuTien = mucUuTien;
//    }

    public void setSoBaoDanh(String soBaoDanh){
        this.SoBaoDanh = soBaoDanh;
    }
    public String getSoBaoDanh(){
        return SoBaoDanh;
    }
    public void setHoTen(String hoTen){
        this.HoTen = hoTen;
    }
    public String getHoTen(){
        return HoTen;
    }
    public void setDiaChi(String diaChi){
        this.DiaChi = diaChi;
    }
    public String getDiaChi(){
        return DiaChi;
    }
    public void setMucUuTien(int mucUuTien){
        this.MucUuTien = mucUuTien;
    }
    public int getMucUuTien(){
        return MucUuTien;
    }
    @Override
    public String toString() {
        return "SBD: " + SoBaoDanh + ", Ho Ten: " + HoTen + ", Dia Chi: " + DiaChi + ", Muc Uu Tien: " + MucUuTien;
    }
}

