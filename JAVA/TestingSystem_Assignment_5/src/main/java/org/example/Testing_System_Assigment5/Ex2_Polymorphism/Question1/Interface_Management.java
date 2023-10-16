package org.example.Testing_System_Assigment5.Ex2_Polymorphism.Question1;


    //Hãy viết chương trình thực hiện các lệnh sau:
    //a) Tạo 10 học sinh, chia thành 3 nhóm
    //b) Kêu gọi cả lớp điểm danh.
    //c) Gọi nhóm 1 đi học bài
    //d) Gọi nhóm 2 đi dọn vệ sinh
public class Interface_Management {
        public static void main(String[] args) {
            Student[] students = new Student[10];

            // Tạo 10 học sinh, chia thành 3 nhóm
            for (int i = 0; i < 10; i++) {
                int group = i % 3 + 1;
                students[i] = new Student(i + 1, "Nguyễn Văn " + (char)('A' + i), group);
            }

            // Kêu gọi cả lớp điểm danh
            System.out.println("Kêu gọi cả lớp điểm danh:");
            for (Student student : students) {
                student.diemDanh();
            }

            // Gọi nhóm 1 đi học bài
            System.out.println("\n Gọi nhóm 1 đi học bài:");
            for (Student student : students) {
                if (student.group == 1) {
                    student.hocBai();
                }
            }

            // Gọi nhóm 2 đi dọn vệ sinh
            System.out.println("\n Gọi nhóm 2 đi dọn vệ sinh:");
            for (Student student : students) {
                if (student.group == 2) {
                    student.diDonVeSinh();
                }
            }
        }
}
