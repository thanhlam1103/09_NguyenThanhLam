package org.example.Testing_System_Assigment9.entity;

public class Student {
    private  int id;
    public String name;

    //Bước1
    public int getId() {
        return id;
    }


    // Bước 2:
    public Student(){
        this.name = " Nguyễn Văn A";
    }
    // Bước 3
    public String getStudentId() {
        return "MSV: " + id;
    }
    //Buoc 4
    @Deprecated
    public int getDefaultId() {
        return id;
    }
}
