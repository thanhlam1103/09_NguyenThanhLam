package com.vti.frontend;

import com.vti.Backend.Ex5_Inheritance;
import com.vti.Backend.QLCB;
import com.vti.Backend.QLTL;

import java.util.Scanner;

public class InheritanceProgram {

    public static void main(String[] args) {
        Ex5_Inheritance inheritance = new Ex5_Inheritance();
        question1_2();
        //inheritance.Question3();
        question4();
    }

    private static void menuQuesion1_2() {
        System.out.println("=======MENU==========");
        System.out.println("==  1. Thêm cán bộ ==");
        System.out.println("==  2. Hiện cán bộ ==");
        System.out.println("==  3. Tìm cán bộ  ==");
        System.out.println("==  4. Xóa cán bộ  ==");
        System.out.println("==  0. Thoát       ==");
        System.out.println("=====================");
    }

    public static void question1_2() {
        QLCB qlcb = new QLCB();

        byte choose;
        do {
            Scanner scanner = new Scanner(System.in);
            menuQuesion1_2();
            choose = scanner.nextByte();

            switch (choose) {
                case 1:
                    qlcb.addCanBo();
                    break;
                case 2:
                    qlcb.printInforCanBo();
                    break;
                case 3:
                    qlcb.findCanBo();
                    break;
                case 4:
                    qlcb.deleteCanBo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nhập sai ! Nhập lại !");
                    break;
            }
        } while (choose != 0);

    }

    private static void menuQuestion4() {
        System.out.println("=======MENU==========");
        System.out.println("==  1. Thêm tài liệu ==");
        System.out.println("==  2. Hiện tài liệu ==");
        System.out.println("==  3. Tìm tài liệu  ==");
        System.out.println("==  4. Xóa tài liệu  ==");
        System.out.println("==  0. Thoát         ==");
        System.out.println("=====================");
    }

    public static void question4() {
        QLTL qltl = new QLTL();

        byte choose;
        do {
            menuQuestion4();
            Scanner scanner = new Scanner(System.in);

            choose = scanner.nextByte();
            switch (choose) {
                case 1:
                    qltl.inputTaiLieu();
                    break;
                case 2:
                    qltl.printTaiLieu();
                    break;
                case 3:
                    qltl.findTaiLieu();
                    break;
                case 4:
                    qltl.deleteTaiLieu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nhập sai ! Nhập lại !");
                    break;
            }
        } while (choose != 0);
    }

}