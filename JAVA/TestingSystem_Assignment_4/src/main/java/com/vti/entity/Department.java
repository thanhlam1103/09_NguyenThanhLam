package com.vti.entity;



public class Department {
    private int  id;
    private String name;


    /*
    Exercise 1 (Optional): Constructor
        Question 1:
            Tạo constructor cho department:
            a) không có parameters
            b) Có 1 parameter là nameDepartment và default id của
            Department = 0
            Khởi tạo 1 Object với mỗi constructor ở trên

     */
    //  không có parameters
    public Department() {
    }
   // Có 1 parameter là nameDepartment và default id của Department = 0
   public Department(int id, String name) {
       this.id = 0;
       this.name = name;
   }
    public Department(String name){

    }

    // Getter và setter cho các thuộc tính id và name
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Department{" + "id=" + id + ", name='" + name + '\'' + '}';
//    }
}

