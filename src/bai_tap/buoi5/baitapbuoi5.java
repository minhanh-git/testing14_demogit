package bai_tap.buoi5;

import java.util.Scanner;

public class baitapbuoi5 {
    public static void main(String[] args) {
        // bài tập quản lí sv thông qua menu có 4 chức năng chính
        //1,2. Thêm sv, xóa dựa vào id
        //3. Hiển thị ds sv
        //4. Tìm sv theo id
        //5. Thoát khỏi ct
        //mỗi sinh viên có các thuộc tính: id, name, age

        //B1: tạo 1 class SV
        //B2: tạo call quanlisv để thêm các sv1, sv2 vào class sv
        //b3: tạo menu để người dùng lựa chọn chức năng

        // tạo ra menu
        Scanner sc=new Scanner(System.in);
        quanLiSV quanLiSV=new quanLiSV();
        int choice;
        do {
        System.out.println("==== QUẢN LÍ SINH VIÊN====");
        System.out.println("1.Thêm SV");
        System.out.println("2.Hiển th ds SV");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        choice=sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                quanLiSV.themSinhVien(sc);
                break;
            case 2:
                quanLiSV.hienThiDanhSachSV();
                break;
                case 3:
                    quanLiSV.timSV(sc);
                    break;
            case 4:
                quanLiSV.xoaSV(sc);
                break;
                case 5:
                    System.out.println("Thoát ctrinh");
                    break;
                    default:
                        System.out.println("Lựa chọn ko hợp lệ! Vui lòng chọn lại");

        }}while(choice!=5);
    }
}
