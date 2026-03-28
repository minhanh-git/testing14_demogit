package bai_tap.cyber;

import java.util.Scanner;

public class baitap_cyber {
    public static void main(String[] args) {

        //Đề bài: quản lí học sinh
        // 1. thêm học sinh
// 2. hiển thị danh sách học sinh
// 3. xóa học sinh dựa vào id
// 4. tìm kiếm học sinh dựa vào id
// 5. tìm học sinh có điểm trung bình cao nhất
// 6. tìm học sinh có điểm trung bình thấp nhất
// 7. sắp xếp học sinh theo tên
// 8. cập nhật thông tin học sinh dựa vào id
// 9. hiển thị ra học sinh có tổng điểm 3 môn trên 24đ
// 10. hiển thị ra học sinh có tổng điểm dưới 18đ
// 11. hiển thị ra danh sách học sinh đạt chất lượng giỏi (đtb > 8)
// 12. thoát khỏi chương trình
// học sinh = {id, hoTen, lop, diaChi, toan, ly, hoa}
        Scanner sc = new Scanner(System.in);
        quanliHocSinh qliHocSinh = new quanliHocSinh();
        int choice;
        //dùng do-while kết hợp switch
        do {
            System.out.println("----MENU QUẢN LÍ HỌC SINH----");
            System.out.println("1.Thêm học sinh.");
            System.out.println("2.Hiển thị danh sách học sinh.");
            System.out.println("3.Xóa học sinh theo ID.");
            System.out.println("4.Tìm học sinh theo ID.");
            System.out.println("5.Tìm học sinh có điểm TB cao nhất.");
            System.out.println("6.Tìm học sinh có ĐTB thấp nhất.");
            System.out.println("7.Sắp xếp học sinh theo tên.");
            System.out.println("8.Cập nhật thông tin HS theo id");
            System.out.println("9. Hiển thị học sinh có tổng điểm 3 môn trên 24.");
            System.out.println("10.Hiển thị học sinh có tổng điểm 3 môn dưới 18.");
            System.out.println("11.Hiển thị học sinh đạt chất lượng giỏi.");
            System.out.println("12.Thoát khỏi chương trình");
            System.out.println("Vui lòng chọn chức năng");


            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    qliHocSinh.themHocSinh(sc);
                    break;
                case 2:
                    qliHocSinh.hienthiDanhsachHocSinh();
                    break;
                case 3:
                    qliHocSinh.xoaHocSinh(sc);
                    break;
                case 4:
                    qliHocSinh.timHocSinhtheoID(sc);
                    break;
                case 5:
                    qliHocSinh.timHScoDiemTrungBinhmax();
                    break;
                case 6:
                    qliHocSinh.timHSdiemTrungBinhmin();
                    break;
                case 7:
                    qliHocSinh.sapxepHStheoTen();
                    break;
                case 8:
                    qliHocSinh.capNhatThongTinh(sc);
                    break;
                case 9:
                    qliHocSinh.hienthiHScodiemtren24(sc);
                    break;
                case 10:
                    qliHocSinh.hienThiDanhSachtongdiemduoi8(sc);
                    break;
                case 11:
                    qliHocSinh.danhSachChatLuongGioi(sc);
                    break;
                case 12:
                    System.out.println("Thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

        } while (choice != 12);


    }
}