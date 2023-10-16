package org.example.Testing_System_Assigment7.entity;


    //a) Viết class MyMath để thay thế cho class Math của java.
public class MyMath {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    //b) Viết thêm method min(), sum vào class MyMath
    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

       // Ex2_Question 1: final variable
        //Tạo class MyMath, khai báo final variable số PI = 3.14
        //Viết method sum(int a) và trả về tổng của a và PI
        //Thử thay đổi số PI = 3.15 trong method xem có được ko?
       public static final float PI = 3.14f;
    public static float sum(int a){
        return a + PI;
    }
}
