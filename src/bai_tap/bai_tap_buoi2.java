package bai_tap;
import java.util.Scanner;

public class bai_tap_buoi2 {
    public static void main(String[] args) {
        //Bài 1: Kiểm tra SV có qua môn học không với điều kện điểm trung bình >=5 và ko đc nghỉ quá 3 buổi
        //input: ĐTB, số buổi nghỉ
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm TB " );
        double dtb = sc.nextDouble();
        System.out.println("Nhập số buổi nghỉ: ");
        int buoiNghi = sc.nextInt();

        // process: kiểm tra ĐK
        Boolean isQuaMon = dtb >= 5.0 && buoiNghi <= 3;
        // output: in ra ket quả học viên có qua môn k
        //if else stament

        if (isQuaMon) {
            System.out.println("Học viên qua môn"); }
        else{
            System.out.println("Học viên không qua môn");
        }


//        System.out.println("Sinh Viên có qua môn không: " + isQuaMon);

        // Bài 2: Kiểm tra KH có đc giảm giá không
        //ĐK: là sv hoặc có tổng đơn trnn 500k
        //Boolean isSinhVien = sc.nextBoolean; -> Nhaaoj true/ false
        System.out.println("KH có phải là sv hay ko: (true/false)");
        Boolean isSinhVien = sc.nextBoolean();
        System.out.println("Nhập tổng đơn hàng: ");
        double tongDonHang = sc.nextDouble();
        //process
        Boolean isGiamGia = isSinhVien || tongDonHang >= 500000;
        //output
        System.out.println("Kết quả KH có được giảm giá hay không: " + isGiamGia);


}
}



