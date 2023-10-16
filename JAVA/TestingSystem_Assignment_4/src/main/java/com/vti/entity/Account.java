package com.vti.entity;

import java.time.LocalDate;

public class Account {
    private int id;
    private String email;
    private String username;
    private String fullname;
    private Department department;
    private Position position;
    private LocalDate createDate;
    private Group[] groups;


    /*
Exercise 1 (Optional): Constructor
	Question 2:
		Tạo constructor cho Account:
		a) Không có parameters
		Khởi tạo 1 Object với mỗi constructor ở trên
 */
    public Account() {

    }
    //b) Có các parameter là id, Email, Username, FirstName,
    //	LastName (với FullName = FirstName + LastName)
    public Account(int id, String Email, String Username, String FirstName, String LastName){
            this.id = id;
            this.email = Email;
            this.username = Username;
            this.fullname= FirstName + " " + LastName;
    }
    //c) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và
    //	Position của User, default createDate = now
        public Account(int id, String Email, String Username, String FirstName, String LastName, Position position) {
            this.id = id;
            this.email = Email;
            this.username = Username;
            this.fullname= FirstName + " " + LastName;
            this.position = position;
            this.createDate = createDate.now();
        }
    //d) Có các parameter là id, Email, Username, FirstName,
    //		LastName (với FullName = FirstName + LastName) và
    //		Position của User, createDate
    public Account(int id, String Email, String Username, String FirstName, String LastName, Position position, LocalDate createDate) {
        this.id = id;
        this.email = Email;
        this.username = Username;
        this.fullname= FirstName + " " + LastName;
        this.position = position;
        this.createDate = createDate;
    }
    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getFullname() {
            return fullname ;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }

        public Position getPosition() {
            return position;
        }

        public void setPosition(Position position) {
            this.position = position;
        }

        public LocalDate getCreateDate() {
            return createDate;
        }

        public void setCreateDate(LocalDate createDate) {
            this.createDate = createDate;
        }

        public Group[] getGroups() {
            return groups;
        }

        public void setGroups(Group[] groups) {
            this.groups = groups;
        }
    }


