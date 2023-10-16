package org.example.Testing_System_Assigment3;

import java.util.Scanner;


public class Ex4_String {
    public static void main(String[] args) {

        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();
        question13();
        question14();
        question15();
        question16();

    }
    //Question 1: Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
    //thể cách nhau bằng nhiều khoảng trắng );
    public static void question1 ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu kí tự: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        int wordCount = words.length;

        System.out.println("Số từ trong xâu: " + wordCount);
    }

    //Question 2: Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    public static void question2 ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu kí tự s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập xâu kí tự s2: ");
        String s2 = scanner.nextLine();

        String result = s1.concat(s2);
        System.out.println("Kết quả: " + result);
    }

    //Question 3: Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
    //viết hoa chữ cái đầu thì viết hoa lên
    public static void question3 ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        String[] nameParts = name.split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String part : nameParts) {
            char firstChar = Character.toUpperCase(part.charAt(0));
            String rest = part.substring(1).toLowerCase();
            capitalized.append(firstChar).append(rest).append(" ");
        }

        String result = capitalized.toString().trim();
        System.out.println("Tên sau khi viết hoa chữ cái đầu: " + result);
    }

    //Question 4: Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
    public static void question4 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + name.charAt(i)); //để truy cập và trả về ký tự tại một vị trí cụ thể trong chuỗi.
                                                                                    // Vị trí bắt đầu từ 0 cho ký tự đầu tiên và tăng lên một đơn vị cho mỗi vị trí tiếp theo.
        }
    }
    //Question 5: Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
    //dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
    public static void question5 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ: ");
        String lastName = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String firstName = scanner.nextLine();

        System.out.println("Họ và tên đầy đủ: " + lastName + " " + firstName);
    }

    //Question 6: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
    //sau đó hệ thống sẽ tách ra họ, tên , tên đệm
    public static void question6 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên đầy đủ: ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split("\\s+");
        String ho = nameParts[0];
        String ten = nameParts[nameParts.length - 1];
        String tenDem = "";

        for (int i = 1; i < nameParts.length - 1; i++) {
            tenDem += nameParts[i] + " ";
        }

        System.out.println("Họ là: " + ho);
        System.out.println("Tên đệm là: " + tenDem.trim());
        System.out.println("Tên là: " + ten);
    }

    //Question 7: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
    //chuẩn hóa họ và tên của họ như sau:
    //a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào

    //b) Viết hoa chữ cái mỗi từ của người dùng

    public static void question7 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên đầy đủ: ");
        String fullName = scanner.nextLine();

        // Loại bỏ dấu cách thừa ở đầu và cuối chuỗi
        String trimmedName = fullName.trim();

        // Viết hoa chữ cái đầu mỗi từ
        String[] nameParts = trimmedName.split("\\s+"); // \\s+ tìm các khoảng trắng
        StringBuilder normalizedFullName = new StringBuilder();

        for (String part : nameParts) {
            char firstChar = Character.toUpperCase(part.charAt(0));
            String rest = part.substring(1).toLowerCase();
            normalizedFullName.append(firstChar).append(rest).append(" ");
        }

        String result = normalizedFullName.toString().trim();
        System.out.println("Họ và tên chuẩn hóa: " + result);
    }

    //Question 8: In ra tất cả các group có chứa chữ "Java"
    public static void question8 () {
        String[] groupNames = {"Java with Duy Nguyễn", "Cách qua môn gia va", "Học Java có khó không?"};

        for (String groupName : groupNames) {
            if (groupName.contains("Java")) {
                System.out.println(groupName);
            }
        }
    }

    //Question 9: In ra tất cả các group "Java"
    public static void question9() {
        String[] groupNames = { "Java", "C#", "C++" };

        for (String groupName : groupNames) {
            if (groupName.equals("Java")) {
                System.out.println(groupName);
            }
        }
    }
    //Question 10: Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.Nếu có xuất ra “OK” ngược lại “KO”.
    public static void question10() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi thứ nhất: ");
    String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi thứ hai: ");
    String str2 = scanner.nextLine();

    String reversedStr2 = new StringBuilder(str2).reverse().toString(); // StringBuilder sử dụng để xây dựng và quản lý chuỗi một cách hiệu quả trong quá trình thay đổi hoặc cập nhật.

        if (str1.equals(reversedStr2)) {
        System.out.println("OK");
    } else {
        System.out.println("KO");
    }
}
    //Question 11: Count special Character. Tìm số lần xuất hiện ký tự "a" trong chuỗi
    public static void question11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi đi bé ơi: ");
        String input = scanner.nextLine(); // Đọc một dòng văn bản (chuỗi) từ bàn phím và gán giá trị đó vào biến

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự 'a': " + count);
    }
    // Question 12 : Reverse String
    //Đảo ngược chuỗi sử dụng vòng lặp
    public static void question12() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
    String input = scanner.nextLine();

    String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
        reversed += input.charAt(i);
    }

        System.out.println("Chuỗi đảo ngược: " + reversed);
    }

    //Question 13: String not contains digit
    //Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
    public static void question13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        boolean containsDigit = false;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) { //Character.isDigit() là một phương thức tĩnh (static) được cung cấp bởi lớp Character trong gói java.lang để kiểm tra xem một ký tự có phải là một chữ số hay không.
                containsDigit = true;
                break;
            }
        }

        System.out.println("Chuỗi chứa chữ số: " + containsDigit);
    }
    // Question 14: Replace character
    //Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
    public static void question14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        System.out.print("Nhập ký tự cần thay thế: ");
        char oldChar = scanner.nextLine().charAt(0); // ChartAt để truy cập và trả về ký tự tại một vị trí cụ thể trong chuỗi.

        System.out.print("Nhập ký tự mới: ");
        char newChar = scanner.nextLine().charAt(0);

        String replacedStr = str.replace(oldChar, newChar);
        System.out.println("Chuỗi sau khi thay thế: " + replacedStr);
    }
    //Question 15: Revert string by word
    //Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
    public static void question15 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+"); // trim cắt kí tự trắng đầu và cuối.split cắt chuỗi dựa vào khoảng trắng
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        System.out.println("Chuỗi sau khi đảo ngược: " + reversed.toString().trim());
    }

    //Question 16: Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
    //bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn hình “KO”.
    public static void question16 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập số ký tự mỗi phần: ");
        int n = scanner.nextInt();

        int length = str.length();
        if (length % n != 0) {
            System.out.println("KO");
        } else {
            int numParts = length / n;
            for (int i = 0; i < numParts; i++) {
                System.out.println("Phần " + (i + 1) + ": " + str.substring(i * n, (i + 1) * n));
            }
        }

    }
}

