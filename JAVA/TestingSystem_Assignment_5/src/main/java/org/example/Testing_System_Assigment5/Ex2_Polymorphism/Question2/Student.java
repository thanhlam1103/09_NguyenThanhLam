package org.example.Testing_System_Assigment5.Ex2_Polymorphism.Question2;


import java.util.Scanner;

//Tạo class Student thừa kế Person, lưu trữ các thông tin một sinh viên:
    //Mã sinh viên, Điểm trung bình, Email
public class Student extends Person{
    private String studentId;
    private double averageScore;
    private String email;

        public Student() {
        }

        public Student(String name, String gender, String birthDate, String address,
                       String studentId, double averageScore, String email) {
            super(name, gender, birthDate, address);
            this.studentId = studentId;
            this.averageScore = averageScore;
            this.email = email;
        }

    //a) Override phương thức inputInfo(), nhập thông tin Student từ
    //bàn phím
    //b) Override phương thức showInfo(), hiển thị tất cả thông tin
    //Student
    //c) Viết phương thức xét xem Student có được học bổng không?
    //Điểm trung bình từ 8.0 trở lên là được học bổng
        @Override
        public void inputInfo() {
            super.inputInfo();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student ID: ");
            studentId = scanner.nextLine();
            System.out.print("Enter average score: ");
            averageScore = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter email: ");
            email = scanner.nextLine();
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println("Student ID: " + studentId);
            System.out.println("Average Score: " + averageScore);
            System.out.println("Email: " + email);
        }

        public boolean hocBong() {
            return averageScore >= 8.0;
        }


}
