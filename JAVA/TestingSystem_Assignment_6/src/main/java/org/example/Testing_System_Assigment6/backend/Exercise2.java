package org.example.Testing_System_Assigment6.backend;

import org.example.Testing_System_Assigment6.entity.Department;

public class Exercise2 {

    //Hãy xử lý exception cho VD trên, khi bị lỗi thì sẽ in ra text "cannot
    //divide 0" su dụng try catch finally...
    public static void question1_2() {
        try {
            float result = divide(7, 0);
        } catch (ArithmeticException a) {
            System.out.println("Cannot divide 0");
        } finally {
            System.out.println("Divide completed!");
        }
    }

    private static float divide(int a, int b) {
        return a / b;
    }

    //Hãy xử lý exception cho VD trên và in ra thông tin lỗi.
    public static void question3() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[2]);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
