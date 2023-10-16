package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private int id;
    private String name;
    private Account creator;
    private Account[] accounts;
    private LocalDate createDate;
        public Group(int id, String name) {
            this.id = id;
            this.name = name;
            this.accounts = new Account[0];
        }



    //Tạo constructor cho Group:
    //a) không có parameters
    public Group() {

    }
    ////b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
    public Group(String name,Account creator,Account[] accounts, LocalDate createDate ) {
        this.name = name;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }
    //c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
    //Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
    //username, các thông tin còn lại = null).
    public Group(String name, Account creator, String[] usernames, LocalDate createDate ) {
        this.name = name;
        this.creator = creator;
        this.createDate = createDate;
    }


    public void addAccount(Account account) {
            Account[] newAccounts = Arrays.copyOf(accounts, accounts.length + 1);
            newAccounts[accounts.length] = account;
            accounts = newAccounts;
        }
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

        public LocalDate getCreateDate() {

            return createDate;
        }

        public void setCreateDate(LocalDate createDate) {

            this.createDate = createDate;
        }

        public Account[] getAccounts() {

            return accounts;
        }

        public void setAccounts(Account[] accounts) {

            this.accounts = accounts;
        }
//    @Override
//    public String toString() {
//        return "Group{" + "id=" + id + ", name='" + name + '\'' + ", creator='" + creator + '\'' + ", createDate='"
//                + createDate + ", accounts=" + Arrays.toString(accounts) + '}';
//    }
    }

