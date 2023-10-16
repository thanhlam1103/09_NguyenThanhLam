package org.example.Testing_System_Assigment3;

public class Ex3_Boxing_Unboxing {
    public static void main(String[] args) {
        question1();
        question2();
        question3();


    }
    //Question 1: Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
    //Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
    //float có 2 số sau dấu thập phân)
    public static void question1 ()
    {
        Integer luong = 5000; // Khởi tạo lương có kiểu Integer

        // Convert lương thành float và hiển thị lên màn hình
        float luongFloat = luong.floatValue(); // Boxing và unboxing tự động
        System.out.printf("Lương dưới dạng float: %.2f%n", luongFloat);
    }

    // Question 2: Khai báo 1 String có value = "1234567"
    //Hãy convert String đó ra số int
    public static void question2 ()
    {
        String value = "1234567";

        // Convert String thành số int
        int intValue = Integer.parseInt(value); // Chuyển đổi một chuỗi (String) chứa số nguyên thành một giá trị số nguyên (int).
        System.out.println("Giá trị int: " + intValue);
    }

    //Question 3: Khởi tạo 1 số Integer có value là chữ "1234567"
    //Sau đó convert số trên thành datatype int
    public static void question3 ()
    {
        Integer number = Integer.valueOf("1234567"); // Khởi tạo Integer từ chuỗi

                // Convert Integer thành int
        int intValue = number.intValue(); // Boxing và unboxing tự động
        System.out.println("Giá trị int: " + intValue);

    }
}
