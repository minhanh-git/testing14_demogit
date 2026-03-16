import org.w3c.dom.ls.LSOutput;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.Scanner;
import java.util.Scanner;

public class Buoi_1 {
    //comment code: bôi đen , ctrl + /
    //snippet code: gõ code nhanh
    //main + enter/tab : tạo hàm main nhanh
    public static void main(String[] args) {
//1.Lệnh xuất dữ liệu ra dưới terminal
        System.out.println("Hello");
        System.out.println("hi");
    //System.out.print: ko xuong dong
        //System.out.println : giup xuong dong giua cac cau
        //snippet System.out.println: sout
        System.out.println("Test14");
//2.Bien: là một khu vực để lưu trữ dữ liệu trên bộ nhớ
    //cú pháp: <kiểu dữ liệu> <tên biến> = <giá trị>
        //chuỗi: string
        //số: int(số nguyên), float/double (số thập phân)
        //float: 7-8 số sau dấu phẩy   /   double:15-16 số sau dấu thập phân
        //boolean: true/false

        //Tạo ra biến là name/ họ tên
        String hoTen = "Hoàng Minh Anh ";
        String diaChi = "Hải Dương";
        int age = 25;
        System.out.println(hoTen);
        System.out.println(hoTen);
        System.out.println(hoTen);

        Boolean isStudent = true;
        Boolean isLogin = false;
        System.out.println("Họ và Tên " + hoTen);
//3. Scanner: dùng để nhận dữ liệu từ người dùng
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập Họ và Tên: ");
        String fullName = sc.nextLine();// Nhận dữ liệu dạng chuỗi
        System.out.println("Họ và Tên " + fullName);
        //Ví dụ: Nhập và in thông tin học sinh: họ, tên, tuổi, trường, lớp
        System.out.println("Vui lòng nhập tên HS ");
        String nameStudent = sc.nextLine();
        System.out.println("Tên học sinh là " + nameStudent);

        System.out.println("Vui lòng nhập tuổi HS");
        int ageStudent = sc.nextInt();
        System.out.println("Tuổi học sinh là " + ageStudent);
        sc.nextLine();// Xóa dòng khi chuyển từ nextInt sang nextLine

        System.out.println("Vui lòng nhập trường");
        String nameSchool = sc.nextLine();
        System.out.println("Trường " + nameSchool);

        System.out.println("Vui lòng nhập lớp ");
        int classStudent = sc.nextInt();
        System.out.println("Lớp " + classStudent);

//4. Toán tử
//4.1 Toán tử số học: + - * /
        int soA = 5;
        int soB = 10;
        int tinhTong = soA + soB;
        int tinhHieu = soA - soB;
        int tinhTich = soA * soB;
        int tinhThuong = soA / soB;

        //tinh phần dư
        int tinhDu = soA % soB;
        System.out.println("Tổng " + tinhTong + ", Hieu " + tinhHieu + ", Thương " + tinhThuong + ", Tich " + tinhTich + ", Dư " + tinhDu );
//4.2 Toán tử so sánh
        // so sánh ==
        Boolean kq1 = soA == soB;
// so sánh khác
        boolean kq2 = soA != soB;
// so sánh lớn hơn, nhỏ hơn
        boolean kq3 = soA > soB;
// so sánh lớn hơn bằng
        boolean kq4 = soA >= soB;
        System.out.println("KQ1 " + kq1 + ", KQ2 " + kq2 + ", KQ3" + kq3 + ", KQ4 " + kq4);

        //so sánh 2 string
        String a = "Bye";
        String b = "Bye";
        String c = new String("Hello");
        boolean kq5 = a == b;
        System.out.println("KQ5 " + kq5);
//Cách kiểm tra string pool (vùng nhớ)
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(c));

        boolean kq6 = a == c;
//        Chi so sanh voi gia tri ben trong
        boolean kq7 = b.equals(c);// so sánh string dùng equals (chỉ so sánh giá trị nội dung, không dùng ==)
        System.out.println("KQ6" + kq6);

    }





}

