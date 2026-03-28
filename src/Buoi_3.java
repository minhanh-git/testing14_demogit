import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Buoi_3 {
    public static void main(String[] args) {
        int soA = 10;
        int soB = 20;
        // array: mảng, là một cấu trúc dữ liệu dùng để lưu trữ nhiều giá trị cùng kiểu dữ liệu, cùng mục đích sử dụng
        // khai báo biến: kiểu dữ liệ tenBien = giá trị;
        //Khai báo mảng: kiểu dữ liệu[] tenMang = new kiểu dữ liệu[kích thước]; -> số lượng phần tử của mảng
        int [] mangSo = new int [5];
        // Gán giá trị cho từng phần tử
        //Vị trí của giá trị trong 1 mảng đc gọi là index, và bắt đầu bằng 0
        mangSo[0] = 10;
        mangSo[1] = 2;
        mangSo[2] = 6;
        mangSo[3] = 10;
        mangSo[4] = 5;
//        System.out.println("Giá trị của phần tử có index 0: " + mangSo[0]);
        System.out.println("Giá trị của mảng " + Arrays.toString(mangSo));
        //Khai báo mảng: kiểu dữ liệu[] tenMang = {giá trị 1, giá trị 2, giá trị 3,...};
        String[] mangTen = {"A", "B", "C", "D"};
        mangTen[0] = "X";
        System.out.println("Giá trị của phần tử có index 0: " + mangTen[0]);
        System.out.println("Số lượng phần tử có bên trong mảng: " + mangTen.length);
        // .length: trả về số lượng phần tử của mảng
    //duyệt mảng: sử dụng vòng lặp for để duyệt qua tất cả phần tử của mảng
        for (int i = 0; i < mangTen.length ; i++) {
            System.out.println("Phần tử có giá trị index " + i + " là: " + mangTen[i]);
        }
        // vòng lặp for-each
        // syntax: for (kiểu dữ liệu tenBien: tenMang) {logic để sử dụng tenBien}
        for (String ten : mangTen) {
            System.out.println("Tên học sinh " + ten);
        }
// if else is statement:
        // ví dụ
        int diem = 85;
//        if (diem >= 80) {
//            System.out.println("đạt đk");
//        } else {
//            System.out.println("Ko đạt đk");
//        }
        // toán tử 3 ngôi: có thể dùng toán tử 3 ngôi để viết thay cho if else nếu chỉ có 1 điều kiện, khi phần logic bên trong đơn giản
        //syntax: điều kiện đúng ? thực hiện logic A có kết quả: thực hiện logicB có kết quả

  String ketQua = diem >=80 ? "Đạt Đk" : "Ko đạt ĐK";
        System.out.println(ketQua);
        // ép kiểu dữ liệu: chueyern đổi một giá trị từ kiểu dữ liệu này sang kiểu dữ liệu khác
        // ép kiểu ngắm định: tự động chuyển đổi kiểu dữ liệu từ nhỏ hơn sang kiểu dữ kiệu lớn hơn (của cùng 1 loại dữ liệu)
        // kiểu dữ liệu là số: byte < short < int < long < float < double
        byte so1 = 10;
        int so2 = so1; //ép kiểu ngắm định
        System.out.println("Giá trị của số 2 là: " + so2);
        // ép kiểu tường minh: tự động chuyển đổi kiểu dữ liệu hớn hơn sang nhỏ hơn (cùng 1 loại dữ liệu)
        //syntax: kiểu dữ liệu cần chuyển tenBien = (kiểu dữ liệu cần chuyển) giá trị cần chuyển
        double so3 = 3.14;
        int so4 = (int) so3; // ép từ double sang int
        System.out.println("giá trị cảu số 4 là : " + so4);

        // ép từ số sang chuỗi
        int so5 = 100;
        String str5 = Integer.toString(so5); // ép từ chuỗi sang số
        // Cách khác để ép từ số sang chuỗi  String str5 = String.valueOf(so5)
        System.out.println("Giá trị của str5: " + str5);

        String str6 = "200";
        int so6 = Integer.parseInt(str6);

        // code mới test git

    }
}
