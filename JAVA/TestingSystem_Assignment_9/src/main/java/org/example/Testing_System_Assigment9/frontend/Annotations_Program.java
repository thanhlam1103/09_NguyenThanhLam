package org.example.Testing_System_Assigment9.frontend;

import org.example.Testing_System_Assigment9.entity.Student;

import java.util.Date;

public class Annotations_Program {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student Name: " + student.name);
        System.out.println("Default ID: " + student.getDefaultId());
        System.out.println("Student ID: " + student.getStudentId());
    }

    //Question 1: @Deprecated
    //Khai báo 1 instance có datatype Date và có value là ngày 18/05/2020.
    //Bạn sẽ thấy java cảnh báo, hãy tắt cảnh báo này đi
    @SuppressWarnings("deprecation")
    public static void question2() {
        Date date = new Date(2020, 4, 18); // Năm 2020, tháng 5 (index 4), ngày 18
        System.out.println(date);
    }
}
