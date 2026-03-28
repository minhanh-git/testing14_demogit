package bai_tap.buoi5.quan_li_NV;

import java.util.Scanner;

//dđóng gói nhân viên: private
public class nhan_vien {
    // tt
    private String id;
    private String name;
    private int age;
    private String address;
    private double salaryPerHours;
private double totalWorkingHours;
//constructor
    public nhan_vien(String id, String name, int age, String adress, double salaryPerHours, double totalWorkingHours) {
this.id = id;
this.name = name;
this.age = age;
this.address = address;
this.salaryPerHours = salaryPerHours;
this.totalWorkingHours = totalWorkingHours;
    }
    //phg thức
 public double calculateSalary() {
        return salaryPerHours * totalWorkingHours;
 }
public void disPlayInfo(){
    System.out.println("ID: " + id
            + " | Tên: " + name
            + " | Tuổi: " + age
            + " | Địa chỉ: " + address
            + " | Lương/giờ: " + salaryPerHours
            + " | Giờ làm: " + totalWorkingHours
            + " | Tổng lương: " + calculateSalary());
}
public String getId(){
        return id;
}
public double gettotalWorkingHours(){
        return totalWorkingHours;
}
public String getName(){
        return name;
}
}
