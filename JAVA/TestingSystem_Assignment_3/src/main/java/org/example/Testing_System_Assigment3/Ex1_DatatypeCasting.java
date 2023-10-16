package org.example.Testing_System_Assigment3;

import java.util.Random;
import java.util.Scanner;

public class Ex1_DatatypeCasting {
    public static void main(String[] args) {
    question1();
    question2();
    question3();
    question4();

    }
        public static void question1 ()
        {
            //Khai báo 2 số lương có kiểu dữ liệu là float.
            float luong_Account1 = 5240.5f;
            float luong_Account2 = 10970.055f;

            // Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
            int tronluongAccount1 = Math.round(luong_Account1);  //Math.round : làm tròn số thực
            System.out.println("Lương của Account 1 sau khi làm tròn: " + tronluongAccount1);

            //Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
            int tronluongAccount2 = (int) luong_Account2;
            System.out.println("Lương của Account 2 sau khi làm tròn: " + tronluongAccount2);
        }

        public static void question2 ()
        {
            //Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)
            Random random = new Random();
            // Sinh một số ngẫu nhiên từ 0 đến 99999
            int randomNumber = random.nextInt(100000);
            // Định dạng số thành chuỗi có độ dài 5, thêm số 0 ở đầu nếu cần
            String formattedNumber = String.format("%05d", randomNumber);
            System.out.println("Số ngẫu nhiên có 5 chữ số: " + formattedNumber);
        }
        public static void question3 () {
        //Lấy 2 số cuối của số ở Question 2 và in ra.
            Random random = new Random();
            int randomNumber = random.nextInt(100000);
            String formattedNumber = String.format("%05d", randomNumber);
            System.out.println("Số ngẫu nhiên có 5 chữ số: " + formattedNumber);

            //Lấy 2 số cuối của số ngẫu nhiên có 5 chữ số và in ra.
            String lastTwoDigits = formattedNumber.substring(formattedNumber.length() - 2);
            System.out.println("2 số cuối của số: " + lastTwoDigits);

            // Hoặc dùng cách 2: chia lấy dư số đó cho 100
            //int lastTwoDigitsMod = randomNumber % 100;
            //System.out.println("2 số cuối của số (cách 2): " + lastTwoDigitsMod);
        }


        public static void question4 ()
        {
            //Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số nguyên a: ");
            int a = scanner.nextInt();

            System.out.print("Nhập số nguyên b: ");
            int b = scanner.nextInt();

            double thuong = tinhThuong(a, b);
            System.out.println("Thương của " + a + " và " + b + " là: " + thuong);

        }
    public static double tinhThuong(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Số b không được bằng 0"); //  đối tượng ngoại lệ
        }
        return (double) a / b;
    }
    }
