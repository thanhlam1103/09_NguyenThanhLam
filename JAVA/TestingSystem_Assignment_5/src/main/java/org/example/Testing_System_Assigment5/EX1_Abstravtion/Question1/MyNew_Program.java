package org.example.Testing_System_Assigment5.EX1_Abstravtion.Question1;

import java.util.Scanner;


    //c) Tạo chương trình demo có tên là MyNews và tạo một menu
    //lựa chọn gồm các mục sau:
    // Insert news
    // View list news
    // Average rate
    // Exit
    //Nếu người dùng chọn 1 từ bàn phím thì tạo một object của
    //class News và nhập giá trị cho các thuộc tính Title,
    //PublishDate, Author, Content sau đó yêu cầu người dùng
    //nhập vào 3 đánh giá để lưu vào Rates.
    //Nếu người dùng chọn 2 từ bàn phím thì thực thi method Display().
    //Nếu người dùng chọn 3 từ bàn phím thì thực hiện method
    //Calculate() để tính đánh giá trung bình, sau đó thực thi method Display().
    //Trường hợp người dùng chọn 4 thì sẽ thoát khỏi chương trình.
public class MyNew_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        News news = new News();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập Title: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.print("Nhập ngày xuất: ");
                    String publishDate = scanner.nextLine();
                    System.out.print("Nhập Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Nhập Content: ");
                    String content = scanner.nextLine();
                    System.out.print("Nhập 3 Rates: ");
                    int[] rates = new int[3];
                    for (int i = 0; i < 3; i++) {
                        rates[i] = scanner.nextInt();
                    }
                    news.setTitle(title);
                    news.setPublishDate(publishDate);
                    news.setAuthor(author);
                    news.setContent(content);
                    news.setRates(rates);
                    break;
                case 2:
                    news.Display();
                    break;
                case 3:
                    news.Calculate();
                    news.Display();
                    break;
                case 4:
                    System.out.println("Đang thoát...");
                    return;
                default:
                    System.out.println("HuHu! Lựa chọn không hợp lệ, vui lòng chọn lại bạn yêu nhé <3");
                    break;
            }
        }
    }
}
