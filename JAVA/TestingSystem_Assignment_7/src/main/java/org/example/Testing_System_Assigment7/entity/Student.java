package org.example.Testing_System_Assigment7.entity;


    // Khai báo 1 class student có các thuộc tính id, name, college
    // Với college là static variable.
public class Student {
    private final int id; // Ex2_question2: khởi tạo id khong thể thay đổi trong suốt quá trình chạy
    private String name;
    private static String college = "Đại học bách khoa";
    private int moneyGroup = 0; // Thuộc tính moneyGroup

        //Question5
        private static int count = 0; // Biến tĩnh để đếm số lượng đối tượng Student đã được tạo

        public static int getStudentCount() {
            return count; // Trả về số lượng đối tượng Student đã được tạo
        }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


        public int getMoneyGroup() {
            return moneyGroup;
        }

        public void setMoneyGroup(int moneyGroup) {
            this.moneyGroup = moneyGroup;
        }

        public void displayInfo2() {
            System.out.println("ID: " + id + ", Name: " + name + ", College: " + college + ", Money Group: " + moneyGroup + "k VND");
        }
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", College: " + college);
    }
    //Ex1_Question 4: tiếp tục Question 1
        //Trong class Student
        //a) Viết method cho phép thay đổi college
        //b) Viết method cho phép lấy giá trị của college
        //------------------------------------------------

        //a) Viết method cho phép thay đổi college
        public static void setCollege(String college) {
            Student.college = college;
        }

        //b) Viết method cho phép lấy giá trị của college
        public static String getCollege() {
            return college;
        }


        // Ex2_Question3
        //Viết method void study(), bên trong method ta sẽ in text "Đang học bài..."
        public final void study() {
            System.out.println("Đang học bài.....");
        }
}

