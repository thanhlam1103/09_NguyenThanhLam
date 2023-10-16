package org.example.Testing_System_Assigment6.entity;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);


    //Question7 Tạo 1 class ScannerUtils, trong class sẽ tạo 1 method inputInt() chuyên
    //để nhập dữ liệu dạng int như age, id, ...
    //Gợi ý: inputInt() sẽ có parameter là String errorMessage để người dùng
    //có thể tự điền được errorMessage vào
    public static int inputInt(String errorMessage) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.println(errorMessage);
            }
        }
    }

    //Question 8: làm tương tự câu 7
    //Làm tương tự câu 7 với các method inputFloat(), inputDouble(),
    //inputString()
    //Riêng với inputString() thì không cần phải handling exception
    public static float inputFloat(String errorMessage) {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.println(errorMessage);
            }
        }
    }

    public static double inputDouble(String errorMessage) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.println(errorMessage);
            }
        }
    }

    public static String inputString(String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.err.println(errorMessage);
            }
        }
    }

    //Question5_6
    public static int inputAge() {
        while (true) {
            int age = inputInt("Wrong inputing! Please input an age as int, input again.");

            if (age <= 0) {
                System.err.println("Wrong inputing! The age must be greater than 0, please input again.");

            } else {
                return age;
            }
        }
    }

    // Question6
    public static int inputAgeGreaterThan18() {
        while (true) {
            int age = inputAge();

            if (age >= 18) {
                return age;

            } else {
                System.out.println("Wrong inputing! The age must be greater than 18, please input again.");
            }
        }
    }

}
