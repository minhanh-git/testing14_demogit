package bai_tap;
import java.util.Scanner;

public class bai_tap_buoi3 {
    public static void main(String[] args) {
        //bai 1: quản lí chi tiêu cá nhân trong 7 ngày. Cho phép người dùng nhập vào
        // chi tiêu cá nhân trong 7 ngày, in ra tổng chi tiru và trung bình chi tiêu trong 7 ngày
        // in ra chi tiêu cao nhất và thấp nhất trong 7 ngày
        Scanner sc = new Scanner(System.in);
        double[] chiTieu = new double[7];
        for (int i =0; i < chiTieu.length; i++){
            System.out.println("Nhập vào chi tiêu ngày " + (i + 1) + " :");
            chiTieu[i] = sc.nextDouble();
        }

        double tongChitieu = 0;
        double chiTieuTrungBinh = 0;
        double chiTieuCaoNhat = chiTieu[0];
        double chiTieuThapNhat = chiTieu[0];


        for(double chi : chiTieu){
            tongChitieu += chi; // tongChiTieu = tongChiTieu + chi
        if (chi > chiTieuCaoNhat){
            chiTieuCaoNhat = chi;
        }
        if (chi < chiTieuThapNhat){
            chiTieuThapNhat = chi;
        }
        // C2: for(int i = 0, i < chiTieu.length; i ++) {
            // if (chiTieuCaoNhat < chiTieu[i] {
            // chiTieuCaoNhat = chiTieu[i])
            // }
        }

        chiTieuTrungBinh = tongChitieu / chiTieu.length;
        System.out.println("Tổng chi tiêu trong 7 ngày: " + tongChitieu);
        System.out.println("Trung bình chi tiêu mỗi ngày " + chiTieuTrungBinh);



        // Bài 2: quản lí điểm số của học sinh 5 môn. Cho phép người dùng nhập vào điêỉm của 5 môn
        //In ra điểm trung bình, điểm cao nhất và thấp nhất, và in ra số môn có điểm trên 5
        double[] diemMon = new double[5];
        for (int i =0; i < diemMon.length; i++){
            System.out.println("Nhaapj vao điểm môn " + (i + 1) + " :");
            diemMon[i] = sc.nextDouble();
        }

        double diemTrungBinh = 0;
        double tongDiem = 0;
        double diemCaoNhat = diemMon[0];
        double diemThapNhat = diemMon[0];
        int monLonHonBang5 = 0;

        for(double diem : diemMon){
            tongDiem += diem;


            if (diemCaoNhat < diem){
                diemCaoNhat = diem;

            }
            if (diemThapNhat < diem){
                diemThapNhat = diem;

            }
            if (diem >= 5 ) {
                monLonHonBang5++;

            }

        }
        diemTrungBinh = tongDiem / diemMon.length;
        System.out.println("Điểm TB môn là: " + diemTrungBinh);
        System.out.println("Điểm cao nhất là: " + diemCaoNhat);
        System.out.println("Điểm thấp nhất là: " + diemThapNhat);
        System.out.println("Có " + monLonHonBang5 + " môn lớn hơn bằng 5");



        //Bài 3: quản lí thông tin của NV. cho phaep người dùng nhập thông tinh
        // số giwof lm mỗi ngày trong 1 tuần, sau đó in ra tổng số giờ lm trong tuần, trung bình số giờ làm mỗi ngày
        // và số ngày lm việc có số giờ làm >=8 giờ
        double[] gioLamViec = new double[7];

        for (int i =0; i < gioLamViec.length; i++){
            System.out.println("Nhập số giờ làm ngày " + (i + 1) + ":");
            gioLamViec[i] = sc.nextDouble();

        }
        double tongGioLam = 0;
        double gioLamTB = 0;
        int soNgayLam = 0;

        for (double gioLam : gioLamViec) {
            tongGioLam += gioLam;

        if (gioLam >= 8) {
        soNgayLam++;

}

        }
        gioLamTB = tongGioLam / gioLamViec.length;
        System.out.println("Giờ làm Tb là: " + gioLamTB);
        System.out.println("Tổng giờ làm việc: " + tongGioLam);
        System.out.println("có " + soNgayLam + " ngày làm từ 8h");


    }
}
