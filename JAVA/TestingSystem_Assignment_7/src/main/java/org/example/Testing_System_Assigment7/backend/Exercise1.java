package org.example.Testing_System_Assigment7.backend;

import org.example.Testing_System_Assigment7.entity.MyMath;
import org.example.Testing_System_Assigment7.entity.PrimaryStudent;
import org.example.Testing_System_Assigment7.entity.SecondaryStudent;
import org.example.Testing_System_Assigment7.entity.Student;

public class Exercise1 {

    //Question 1: static variable
    //Khai báo 1 class student có các thuộc tính id, name, college
    //Với college là static variable.
    //Hãy khởi tạo các student sau:
    //Student có id = 1, name ="Nguyễn Văn A"
    //Student có id = 2, name = " Nguyễn Văn B "
    //Student có id = 3, name = " Nguyễn Văn C "
    //Và tất cả các student này đều học ở "Đại học bách khoa".
    //Dùng vòng for để in ra thông tin các student
    //Sau đó hãy chuyển các student này sang "Đại học công nghệ"
    //Dùng vòng for để in ra thông tin các student
    public  static  void question1() {
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new Student(3, "Nguyễn Văn C");

        System.out.println("Thông tin các Student ban đầu :");
        Student[] students = {student1, student2, student3};
        for (Student student : students) {
            student.displayInfo();
        }
        //Sau đó hãy chuyển các student này sang "Đại học công nghệ"
        //Dùng vòng for để in ra thông tin các student
        Student.setCollege("Đại học công nghệ");
        System.out.println("\nThông tin student sau khi chuyển sang Đại học công nghệ :");
        for (Student student : students) {
            student.displayInfo();

        }
    }

    //Question 2: tiếp tục question 1
    //Bổ sung thuộc tính moneyGroup cho Student (moneyGroup là tiền quỹ
    //lớp - dùng chung cho tất cả các student).
    //Hãy viết chương trình main() để mô tả các bước sau:
    //B1: Các Student sẽ nộp quỹ, mỗi Student 100k
    //B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
    //B3: Student thứ 2 lấy 20k đi mua bánh mì
    //B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
    //B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
    //In ra số tiền còn của nhóm tại mỗi bước
    public static  void question2(){
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new Student(3, "Nguyễn Văn C");
        // Bước 1: Các Student sẽ nộp quỹ, mỗi Student 100k
        student1.setMoneyGroup(student1.getMoneyGroup() + 100);
        student2.setMoneyGroup(student2.getMoneyGroup() + 100);
        student3.setMoneyGroup(student3.getMoneyGroup() + 100);
        // Bước 2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
        student1.setMoneyGroup(student1.getMoneyGroup() - 50);
        // Bước 3: Student thứ 2 lấy 20k đi mua bánh mì
        student2.setMoneyGroup(student2.getMoneyGroup() -20 );

        // Bước 4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
        student3.setMoneyGroup(student3.getMoneyGroup() -150);

        // Bước 5: Cả nhóm mỗi người lại đóng quỹ mỗi người 50k
        student1.setMoneyGroup(student1.getMoneyGroup() + 50);
        student2.setMoneyGroup(student2.getMoneyGroup() + 50);
        student3.setMoneyGroup(student3.getMoneyGroup() + 50);

        // In ra số tiền còn của nhóm tại mỗi bước
        System.out.println("Số tiền còn của nhóm sau mỗi bước:");
        student1.displayInfo2();
        student2.displayInfo2();
        student3.displayInfo2();
    }

    //Question 3: static method
    //public static void main(String[] args ){
    //  int result = Math.max(5, 7);
    //  System.out.println(result);
    //}
    //a) Viết class MyMath để thay thế cho class Math của java.
    //b) Viết thêm method min(), sum vào class MyMath
    public static void question3(){
        int resultMax = MyMath.max(5, 7);
        System.out.println("Max: " + resultMax);

        int resultMin = MyMath.min(5, 7);
        System.out.println("Min: " + resultMin);

        int resultSum = MyMath.sum(5, 7);
        System.out.println("Sum: " + resultSum);

    }

    //Question 5:
    //Hãy viết chương trình đếm số Student được sinh ra (tham khảo code trên google)
    public static void question5(){
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new Student(3, "Nguyễn Văn C");
        System.out.println("Số lượng Student đã được tạo: " + Student.getStudentCount()); //
    }

    //Tạo class PrimaryStudent, SecondaryStudent, hãy viết chương trình
    //đếm số lượng PrimaryStudent được sinh ra, SecondaryStudent được
    //sinh ra.
    //Viết chương trình demo.
    //Khởi tạo 6 Student, trong đó có 2 PrimaryStudent và 4
    //SecondaryStudent, sau đó in ra số lượng Student,
    //PrimaryStudent, SecondaryStudent được sinh ra.
    public static void question6(){
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new PrimaryStudent(3, "Nguyễn Văn C");
        Student student4 = new PrimaryStudent(4, "Nguyễn Văn D");
        Student student5 = new SecondaryStudent(5, "Nguyễn Văn E");
        Student student6 = new SecondaryStudent(6, "Nguyễn Văn F");
        Student student7 = new SecondaryStudent(7, "Nguyễn Văn H");

        System.out.println("Số lượng Student đã được tạo: " + Student.getStudentCount());
        System.out.println("Số lượng PrimaryStudent đã được tạo: " + PrimaryStudent.getPrimaryStudentCount());
        System.out.println("Số lượng SecondaryStudent đã được tạo: " + SecondaryStudent.getSecondaryStudentCount());

    }
}

