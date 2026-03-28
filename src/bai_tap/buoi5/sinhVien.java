package bai_tap.buoi5;

import java.util.Scanner;

public class sinhVien {
    // thuộc tính
    private String id;
    private String name;
    private int age;
    private String address;
    private double score;
    //Khởi tạo cons mặc định ko có tham số
    public sinhVien() {

    }
    // cons
    public sinhVien(String id, String name, int age, String address, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;

    }
    // phg thưccs
    // Phuoeng thức để nhập thông tin sv
    public void input(Scanner sc) {
        System.out.println("Nhập id ");
        this.id = sc.nextLine();
        System.out.println("Nhập name: ");
        this.name = sc.nextLine();
        System.out.println("Nhập age:");
        this.age = sc.nextInt();
        sc.nextLine(); // để đọc bỏ dòng mới sau khi nhập age // chuyển từ nextInt sang nextLine
        System.out.println("nhập adress");
        this.address = sc.nextLine();
        System.out.println("Nhập score: ");
        this.score = sc.nextDouble();
        sc.nextLine(); // để đọc bỏ dòng mới sau khi nhập score

    }

    // phg thức display để hiển thị tt sv
    public void display(){
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Address: " + address +
                " | Score: " + score);}
// phg thức getID để lấy id sinh Viên
    public String getId() {
        return id;
    }
}
