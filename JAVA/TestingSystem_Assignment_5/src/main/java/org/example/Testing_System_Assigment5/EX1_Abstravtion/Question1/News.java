package org.example.Testing_System_Assigment5.EX1_Abstravtion.Question1;


public class News implements INews {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private int[] Rates = new int[3];

    // setter and getter
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    public void setTitle(String title){
        this.Title = title;
    }
    public String getTitle(){
        return Title;
    }
    public void setPublishDate(String publishDate){
        this.PublishDate = publishDate;
    }
    public String getPublishDate(){
        return PublishDate;
    }
    public void setAuthor(String author){
        this.Author = author;
    }
    public String getAuthor(){
        return Author;
    }
    public void setContent(String content){
        this.Content = content;
    }
    public String getContent(){
        return Content;
    }
    public float getAverageRate(){
        return AverageRate;
    }
    public void setRates(int[] rates) {
        Rates = rates;
    }

    // Thực hiện các phương thức từ giao diện
    //a) Method Display() sẽ in ra Title, PublishDate, Author,
    //Content và AverageRate của tin tức ra console.
    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("Publish Date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("Average Rate: " + AverageRate);
    }

    //b) Method có tên Calculate() để thiết đặt thuộc tính
    //Khai báo một array có tên Rates kiểu int gồm 3 phần tử
    //AverageRate là trung bình cộng của 3 phần tử của array Rates.
    @Override
    public float Calculate() {
        AverageRate = (float) (Rates[0] + Rates[1] + Rates[2]) / 3;
        return AverageRate;
    }
}
