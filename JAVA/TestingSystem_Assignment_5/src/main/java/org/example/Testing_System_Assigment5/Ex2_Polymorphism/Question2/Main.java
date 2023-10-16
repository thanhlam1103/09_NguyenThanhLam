package org.example.Testing_System_Assigment5.Ex2_Polymorphism.Question2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputInfo();
        student.showInfo();

        if (student.hocBong()) {
            System.out.println(student.getName() + " đủ điều kiện nhận học bổng.");
        } else {
            System.out.println(student.getName() + " không đủ điều kiện nhận học bổng.");
        }
    }
}
