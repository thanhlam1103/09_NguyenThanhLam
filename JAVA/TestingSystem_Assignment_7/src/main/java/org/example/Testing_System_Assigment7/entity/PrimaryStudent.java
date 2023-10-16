package org.example.Testing_System_Assigment7.entity;

public final class PrimaryStudent extends  Student{
    private static int primaryStudentCount = 0; // Đếm số lượng đối tượng PrimaryStudent đã được tạo
    public PrimaryStudent(int id, String name) {
        super(id, name);
        primaryStudentCount++; // Tăng giá trị primaryStudentCount mỗi khi tạo một đối tượng PrimaryStudent mới
    }



    public static int getPrimaryStudentCount() {
        return primaryStudentCount; // Trả về số lượng PrimaryStudent đã được tạo
    }
}
