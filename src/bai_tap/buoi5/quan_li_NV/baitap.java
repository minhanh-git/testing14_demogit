package bai_tap.buoi5.quan_li_NV;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        // bài tập quản lí nv với menu
        //1. thêm nv
        //2. hiển thị danh sách nv
        //3. xóa nv
        //4. Tìm nv dựa vào id
        //5. Tìm nv có tổng lương cao nhất
        //6. Tìm nv có số giờ làm thấp nhất
        //7. SX nv theo tên
        //8. SX nvien theo số giờ làm
        // 9. cập nhật thông tin nvien dựa vào id
        //10. Cập Nhật số giwof làm cảu nvien dựa vào id
        //11. Hiển thị nhân viên có tổng số giờ làm lớn hơn 120h
        //12. Hiển thị nv có số giờ làm nhỏ hơn 80h
        //13. Thoát ctrinh
        // Nvien = {í, name, age,adress, salaryPerHours, totalWorkingHours}
   Scanner sc = new Scanner(System.in);
   quan_liNV qlnv = new quan_liNV();
   int choice;
   // do ... while
        do {
            System.out.println("------MENU QLNV--------");
            System.out.println("1.Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("Xóa Nhân Viên theo ID");
            System.out.println("4. Tìm kiếm nv theo ID");
            System.out.println("5. Nhân viên có tổng lương cao nhất");
            System.out.println("6. Nhân viên có số giờ làm thấp nhất");
            System.out.println("7. SX NV theo tên");
            System.out.println("8. Sxep NV theo số giờ làm");
            System.out.println("9.Cập nhật thông tin NV");
            System.out.println("10. Cập nhật số giờ làm của NV");
            System.out.println("11. Hiển thị nv có số giờ làm lớn hơn 120h");
            System.out.println("12.Hiển thị nv có số giờ làm <80h");
            System.out.println("13. Thoát khỏi ctrinh");
            System.out.println("Vui lòng chọn chức năng");
       choice = Integer.parseInt(sc.nextLine());
       switch(choice){
           case 1:
               qlnv.themNhanVien(sc);
               break;
               case 2:
                   qlnv.hienThiDanhSachNhanVien();
                   break;
                   case 3:
                       qlnv.xoaNhanVien(sc);
                       break;
           case 4:
               qlnv.timKiemNVtheoid(sc);
               break;
           case 5:
               qlnv.timNVcoTongLuongCaoNhat();
               break;
           case 6:
               qlnv.timNVcoGioLamThapNhat();
               break;
           case 7:
               qlnv.saxepNVtheoTen();
               break;
           case 8:
               qlnv.sapxepNVtheosoGioLam();
               break;
           case 9:
               qlnv.capNhatThongTinNhanVien(sc);
               break;
           case 11:
               qlnv.hienThiDanhSachNhanVien();
               break;
                   case 13:
                       System.out.println("Thoát khỏi chương trình");
                       break;

                   default:
                       System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
       }

        }while (choice != 13);


    }
}
