package org.example.Testing_System_Assigment7.entity;

public final class SecondaryStudent extends Student {
    private static int secondaryStudentCount = 0; // Đếm số lượng đối tượng SecondaryStudent đã được tạo

    public SecondaryStudent(int id, String name) {
        super(id, name);
        secondaryStudentCount++; // Tăng giá trị secondaryStudentCount mỗi khi tạo một đối tượng SecondaryStudent mới
    }

    public static int getSecondaryStudentCount() {
        return secondaryStudentCount; // Trả về số lượng SecondaryStudent đã được tạo
    }
}
