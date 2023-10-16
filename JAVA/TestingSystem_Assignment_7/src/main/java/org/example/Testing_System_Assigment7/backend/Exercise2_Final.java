package org.example.Testing_System_Assigment7.backend;

import org.example.Testing_System_Assigment7.entity.MyMath;
import org.example.Testing_System_Assigment7.entity.PrimaryStudent;
import org.example.Testing_System_Assigment7.entity.SecondaryStudent;
import org.example.Testing_System_Assigment7.entity.Student;

public class Exercise2_Final {

    //Question 1: final variable
    //Tạo class MyMath, khai báo final variable số PI = 3.14
    //Viết method sum(int a) và trả về tổng của a và PI
    //Thử thay đổi số PI = 3.15 trong method xem có được ko?
    public  static void question1(){
        MyMath math = new MyMath();
        System.out.println(math.sum(5)); // In ra 8.14

        // Thử thay đổi PI = 3.15 (không cho phép)
        // math.PI = 3.15; // Lỗi biên dịch
    }

    //Question 2:
    //Tạo class Student có property id, name hãy thiết kế class Student sao
    //cho khi đã khởi tạo Student thì id là không thể thay đổi trong suốt quá trình chạy chương trình
    public static void question2(){
        Student student = new Student(1, "Nguyễn Văn A");
        // student.id = 2; // Lỗi biên dịch, không thể thay đổi id sau khi đã gán giá trị ban đầu

    }
    public static void question3(){
//        PrimaryStudent primaryStudent = new PrimaryStudent();
//        primaryStudent.study(); // In ra "Đang học bài..."
//
//        SecondaryStudent secondaryStudent = new SecondaryStudent();
//        secondaryStudent.study(); // In ra "Đang học bài..."
    }
    //Question 4: Tiếp tục Question 3 (final class)
    //Hãy thiết kế chương trình sao cho không có class nào có thể kế thừa từ
    //PrimaryStudent, SecondaryStudent
     // chỉ cần đặt final 2 class PrimaryStudent và SecondaryStudent
}
