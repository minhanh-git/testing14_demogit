package bai_tap;
import java.util.Scanner;

public class bai_tap_buoi2a {
    public static void main(String[] args) {
        //Ví dụ: xếp loại HS dựa trên điểm tb
        //đtb < 5 HS yếu, 5 <= đtb <= 7: HSK, 7<đtb <=8.5 và 8.5<dtb <=10 HSG
        // cho nhập điểm 3 môn : toán văn anh, và họ tên
 Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ ten");
        String hoTen = sc.nextLine();
        System.out.println("Nhập điểm toán");
        double diemToan = sc.nextDouble();
        System.out.println("Nhập điểm văn");
        double diemVan = sc.nextDouble();
        System.out.println("Nhập điểm Anh");
        double diemAnh = sc.nextDouble();
        double dtb = (diemToan + diemVan + diemAnh) / 3;
        //process
        String xeploai ="";
        if (dtb < 5) {
            xeploai ="Yếu";
            System.out.println(xeploai);
        } else if (dtb >=5 && dtb <8) {
            xeploai ="Khá";
            System.out.println(xeploai);
        } else if (dtb >=8 && dtb <=10 ) {
            xeploai ="Giỏi";
            System.out.println(xeploai);
        } else {
            System.out.println("DIem khong hop le");
        }

        // Bài 2: tính tiền điện
        // đk: nếu số điện tiêu thụ <= 50kwh thì giá là 1k/kwh
        //nếu số điện tiêu thị <=100 thì giá diện là 1.2k
        //nếu số điện tiêu thụ> 100 thì giá là 1.5
        System.out.println("Nhập số điện tiêu thụ");
        int sodienTieuThu = sc.nextInt();
        int tongTien = 0;

        if (sodienTieuThu <= 50) {
            tongTien = sodienTieuThu * 1000;
            System.out.println("Gia Dien la " + tongTien );
        } else if (sodienTieuThu <= 100) {
            tongTien = sodienTieuThu * 1200;
            System.out.println("Gia Dien la " + tongTien);
        }else if (sodienTieuThu >=100) {
            tongTien = sodienTieuThu * 1500;
            System.out.println("Gia Dien la " + tongTien);
        } else {
            System.out.println("So dien tieu thu ko hop le");
        }



        //Bài 3: tính tiền taxi
        // đk: km đầu là 20k
        //km thứ 2-5 là 15k
        //5-10 là 12k
        //>10 là 10k
        System.out.println("Nhaập số km: ");
        double soKM = sc.nextDouble();
        double soTien = 0;

        if (soKM <=1) {
            soTien = 20000;
            System.out.println("Giá taxi là " + soTien);
        } else if (soKM >1 && soKM <=5) {
            soTien = 20000 + (soKM-1) * 15000;
            System.out.println("Giá taxi là " + soTien);
        } else if (soKM >5 && soKM <=10) {
            soTien = 20000 + 4 * 15000 + (soKM - 5)* 12000;
            System.out.println("Giá taxi là " + soTien);
        }  else if (soKM >10) {
            soTien = 20000 + 4 * 15000 + 5 * 12000 + (soKM-10) * 10000;
            System.out.println("Giá taxi là " + soTien);
        } else {
            System.out.println("Số km nhập ko hợp lệ");
        }




    }
}
