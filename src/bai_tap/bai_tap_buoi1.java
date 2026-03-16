package bai_tap;
import java.util.Scanner;

public class bai_tap_buoi1 {
    public static void main(String[] args) {
        // Bai 1: tính điểm trung bình của học sinh, cho phép nhập vào họ tên,
        //ĐIểm toán, lí, hóa sau đó in ra thông tin của học sinh đó
        //input = tên, điểm 3 môn
        //process: tính điểm trung bình
        // output: in ra các thông tin của HS: ten, điểm TB
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên HS: " );
        String nameStudent = sc.nextLine();


        System.out.println("Diem toan: ");
        float diemToan = sc.nextFloat();

        System.out.println("Diem li: ");
        float diemLi = sc.nextFloat();

        System.out.println("Diem Hoa: ");
        float diemHoa = sc.nextFloat();
        System.out.println("Diem Tan: ");

        float diemTB = (diemToan + diemLi + diemHoa) / 3;
        System.out.println(nameStudent + "có điểm TB 3 môn Toán, Lí, Hóa là " + diemTB);


        // Bài 2: tính lương nhân viên, cho phép nhập vào họ tên, lương cơ bản, số ngàu làm vc.
        // Sau đó in ra thông tin của sv đó
        System.out.println("Ten NV: ");
        String nameNV = sc.nextLine();
        System.out.println("Lương cơ bản NV: ");
        int luongNV = sc.nextInt();
        System.out.println("số ngày lm vc: ");

        int soNgaylmvc = sc.nextInt();

        int luongthuc = luongNV * soNgaylmvc;
        System.out.println("Ten NV: " + nameNV);
        System.out.println("Lương cơ bản NV: " + luongNV);
        System.out.println("Lương thực: " + luongthuc);

        // Sử dụng mô hình IPO: input(dữ liệu đầu vào) - process(xử lí logic để đạt được kết quả output) - output(kết quả đầu ra mong muốn)

    }
}
