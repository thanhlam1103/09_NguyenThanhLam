package org.example.Testing_System_Assigment6.frontend;


import org.example.Testing_System_Assigment6.entity.Department;

    //Question 4:
    //Tạo 1 array departments gồm 3 phần tử
    //Sau đó viết 1 method getIndex(int index) để lấy thông tin phần tử thứ
    //index trong array departments. Nếu index vượt quá length lấy ra thì sẽ
    //in ra text "Cannot find department."
public class Question4 {
        private static Department[] departments = new Department[3];
    public static void main(String[] args) {

        // Init Department
        Department department1 = new Department(1, "Sale");
        Department department2 = new Department(2, "Marketing");
        Department department3 = new Department(3, "BOD");

        departments[1] = department1;
        departments[2] = department2;
        departments[3] = department3;

        // Get index
        getIndex(5);
    }

    private static void getIndex(int index) {
        if (index >= 0 && index < departments.length) {
            System.out.println("Department at index " + index + ": " + departments[index]);
        } else {
            System.out.println("Cannot find department.");
        }
    }
}
