package org.example.Testing_System_Assigment5.Ex2_Polymorphism.Question4;

public class Demo {
    public static void main(String[] args) {
        int intSum = MyMath.sum(5, 10);
        System.out.println("Sum of integers: " + intSum);

        float floatSum = MyMath.sum(3.5f, 2.5f);
        System.out.println("Sum of floats: " + floatSum);

        byte byteSum = (byte) MyMath.sum((byte) 20, (byte) 30);
        System.out.println("Sum of bytes: " + byteSum);
    }

}
