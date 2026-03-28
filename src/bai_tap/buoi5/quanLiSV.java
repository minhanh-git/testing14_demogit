package bai_tap.buoi5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quanLiSV {
    // thuoc tinh
    private  ArrayList<sinhVien> danhSachSV = new ArrayList<>();
 // phg thức them sv
    public void themSinhVien (Scanner sc) {
        // tạo ra đối tượng SV từ lớp đối tượng
        sinhVien sv = new sinhVien();
        //gọi phg thức input để nhập tooong tin
        sv.input(sc);
        // thêm sv vào danh sách
        danhSachSV.add(sv);
        System.out.println("Thêm sinh Viên thành công! ");

    }
    // Phg thức hiển thị ds SV
    public void hienThiDanhSachSV(){
        // 2 trường hợp xảy ra
        //2.1 Nếu ds sv rỗng hiển thị thông báo rỗng
        if (danhSachSV.isEmpty()){
            System.out.println("Danh sách rỗng");
        } else {
            //2.2 Nếu danh sachs ko rỗng thì hiển thị thông tin sv
            for (sinhVien sv : danhSachSV) {
                sv.display();
            }
        }

    }

    // Phương thức xóa sv dụa vào id
    public void xoaSV(Scanner sc) {
        System.out.println("Nhaaoj id sinh viên muốn xóa:" );
        String id = sc.nextLine();
        boolean found = false; // giải quyết bài toán theo phg pháp đặt cờ hiệu
        // giả sử chưa tìm thấy
        for (sinhVien sv : danhSachSV) {
            if((sv.getId()).equals(id)){
                danhSachSV.remove(sv);
                System.out.println("Xóa SV thành công!");
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Ko tìm thấy SV với id: " + id);
        }
    }

    //Phg thức tìm sv dựa vào id

    public void timSV(Scanner sc) {
        System.out.println("Nhập SV cần tìm:");
        String id = sc.nextLine();
        boolean found = false; // chưa tìm thấy sv cần tìm
        for (sinhVien sv : danhSachSV) {
            if(sv.getId().equals(id)){
                System.out.println("Thông tin sv cần tìm: ");
                sv.display();
                found = true;
                break; // thoát khỏi vòng lặp đã tìm thấy sv
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy SV id: " + id);
        }
    }


}
