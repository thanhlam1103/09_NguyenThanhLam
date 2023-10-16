package org.example.Testing_System_Assigment9.backend;

import org.example.Testing_System_Assigment9.entity.InnerClass.CPU;
import org.example.Testing_System_Assigment9.entity.InnerClass.Car;

public class Ex3_Innerclass {
    //Question1
    //Tạo class CPU có property: price
    //Tạo 2 inner class Processor, Ram
    //Với Processor có các property: coreAmount, menufacturer và
    //method getCache() và return ra 4.3
    //Với Ram có các property: memory, menufacturer và method
    //getClockSpeed() và return ra 5.5

    public void question1() {
        //khởi tạo object CPU và in ra cache của Processor và clockSpeed của Ram
        CPU cpu = new CPU(500.0);
        CPU.Processor processor = cpu.new Processor(4, "Intel");
        CPU.Ram ram = cpu.new Ram(8, "Kingston");

        System.out.println("Processor Cache: " + processor.getCache());
        System.out.println("Ram Clock Speed: " + ram.getClockSpeed());
    }

    //question2: Tạo Car có property: name, type
    //Tạo inner class Engine có property engineType và tạo getter, setter cho
    //property engineType
    //Khởi tạo object Car có name = Mazda, type = 8WD, có loại động cơ là
    //"Crysler".
    //Sau đó in ra thông tin của động cơ
    public void question2(){
        Car car = new Car("Mazda", "8WD", "Crysler");

        System.out.println("Car Name: " + car.getName());
        System.out.println("Car Type: " + car.getType());
        System.out.println("Engine Type: " + car.getEngine().getEngineType());

    }
}
