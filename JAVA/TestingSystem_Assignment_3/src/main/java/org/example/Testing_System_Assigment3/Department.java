package org.example.Testing_System_Assigment3;

public class Department {
    int  id;
    String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {

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
}

