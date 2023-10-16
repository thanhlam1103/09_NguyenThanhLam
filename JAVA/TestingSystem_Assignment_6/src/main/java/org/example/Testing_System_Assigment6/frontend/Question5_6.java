package org.example.Testing_System_Assigment6.frontend;


import org.example.Testing_System_Assigment6.entity.ScannerUtils;

//Tạo 1 method inputAge() và trả về 1 số int.
    //Trong method hãy cài đặt như sau:
    //B1: Sau đó dùng scanner để nhập vào 1 số
    //B2: Check exeption
    //Nếu người dùng nhập vào 1 số thì return về số đó
    //Nếu người dùng không nhập vào 1 số thì sẽ in ra dòng
    //text "wrong inputing! Please input an age as int, input again."
    //Nếu người dùng không nhập vào 1 số < 0 thì sẽ in ra
    //dòng text "Wrong inputing! The age must be greater
    //than 0, please input again."
    //B3: hãy demo trong method main()
public class Question5_6 {
        public static void main(String[] args) {

            System.out.println("Nhập tuổi: ");
            int age = ScannerUtils.inputAge();

            System.out.println("Tuổi của bạn: " + age);
        }

}
