package bai_tap.cyber;

import java.util.ArrayList;
import java.util.Scanner;

public class quanliHocSinh {
    //thuộc tính
    private ArrayList<hoc_sinh> danhsachHocSinh = new ArrayList<>(); //-> tạo mảng lưu danh sách hs
     // Phương thức
    //1. Thêm học sinh
    public void themHocSinh(Scanner sc) {
        System.out.println("Nhập id học sinh:  ");
        String id = sc.nextLine();
        // neeus id đã có ko cho nhập


        // neu id chưa tồn tại
        System.out.println("Nhập Họ Tên học sinh: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập lớp: ");
        String lop = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điểm Toán: ");
        double diemToan = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Lý: ");
        double diemLy = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Hóa: ");
        double diemHoa = Double.parseDouble(sc.nextLine());
        hoc_sinh hs = new hoc_sinh(id, hoTen, lop, diaChi, diemToan, diemLy, diemHoa );
        danhsachHocSinh.add(hs);
        System.out.println("Thêm Học Sinh thành công!");

    }
    //2. Hiển thị danh sách hs
    public void hienthiDanhsachHocSinh(){
       if(danhsachHocSinh.isEmpty()){
           System.out.println("Danh sách học sinh trống.");
           return;
       }
       for (hoc_sinh hs : danhsachHocSinh){
           hs.disPlayInfo();
       }
    }
//3. Xóa hs theo id
    public void xoaHocSinh(Scanner sc) {
        System.out.println("Nhập ID học sinh cần xóa: " );
        String id = sc.nextLine();
        boolean found = false; // cờ hiệu
        if (danhsachHocSinh.isEmpty()){
            System.out.println("Danh sách trống.");
            return;
        }
        for (hoc_sinh hs : danhsachHocSinh){
            if (hs.getId().equals(id)){
                danhsachHocSinh.remove(hs);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Không tìm thấy học sinh có ID: " + id);

        }

    }
    //4. Tìm hs dựa vào id
    public void timHocSinhtheoID (Scanner sc) {
        System.out.println("Nhập ID của học sinh cần tìm: " );
        String id = sc.nextLine();
        boolean found = false;

        for (hoc_sinh hs : danhsachHocSinh){
            if(hs.getId().equals(id)){
               found = true;
               break;
            }
        }
        if (!found){
            System.out.println("Không tìm thấy Học Sinh có ID: " + id);
        }
    }
    // tìm nv theo ID
    public hoc_sinh timKiemHocSinhtheoID (String id) {
        for (hoc_sinh hs : danhsachHocSinh){
            if (hs.getId().equals(id)){
                return hs;
            }
        }
        return null;
    }
    //5. tìm hs có đtb cao nhất
    public void timHScoDiemTrungBinhmax(){
        if (danhsachHocSinh.isEmpty()){
            System.out.println("Danh sách trống.");
            return;
        }
        hoc_sinh hsMax = danhsachHocSinh.get(0);
        //tìm hs
        for (hoc_sinh hs : danhsachHocSinh){
            if (hs.tinhDiemTrungBinh() > hsMax.tinhDiemTrungBinh()){
                hsMax = hs;

            }
        }
        System.out.println("Học sinh có điểm trung bình cao nhất" );
        hsMax.disPlayInfo();
    }
    //6. tìm hs có dtb thấp nhất
    public void timHSdiemTrungBinhmin (){
        if(danhsachHocSinh.isEmpty()){
            System.out.println("Danh sách trống.");
            return;
        }
        hoc_sinh hsMin = danhsachHocSinh.get(0);
        //tìm
        for (hoc_sinh hs : danhsachHocSinh){
            if (hs.tinhDiemTrungBinh() < hsMin.tinhDiemTrungBinh()){
                hsMin = hs;
            }
        }
        System.out.println("Học sinh có điểm trung bình thấp nhất");
        hsMin.disPlayInfo();
    }

    //7. sx theo tên
    public void sapxepHStheoTen (){
        if (danhsachHocSinh.isEmpty()){
            System.out.println("Danh sách trống.");
            return;
        }
        danhsachHocSinh.sort((hs1 , hs2) -> hs1.getHoTen().compareTo(hs2.getHoTen()));
        System.out.println("Danh sách Học Sinh sau khi đã sắp xếp theo tên: ");
        hienthiDanhsachHocSinh();
    }
    //8. cập nhật ttin theo id
    public void capNhatThongTinh(Scanner sc) {
        if (danhsachHocSinh.isEmpty()){
            System.out.println("Danh sách trống.");
            return;
        }
        System.out.println("Nhập ID học sinh cần cập nhật");
        String id = sc.nextLine();
        hoc_sinh hs = timKiemHocSinhtheoID(id);
        if (hs == null){
            System.out.println("Không tìm thấy HS có id: " + id);
            return;
        }
        System.out.println("Nhập Họ và tên mới");
        String hoTen = sc.nextLine();
        System.out.println("Nhập lớp mới");
        String lop = sc.nextLine();
        System.out.println("Nhập địa chỉ mới");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điểm Toán mới");
        double diemToan = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Lý mới");
        double diemLy =  Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Hóa mới");
        double diemHoa = Double.parseDouble(sc.nextLine());
        hs = new hoc_sinh(id, hoTen, diaChi, lop, diemToan, diemLy, diemHoa);
         for (int i = 0; i < danhsachHocSinh.size(); i++) {
             if(danhsachHocSinh.get(i).getId().equals(hs.getId())){
                 danhsachHocSinh.set(i,hs);
                 break;
             }
         }
        System.out.println("Cập nhật thông tin thành công.");

    }
// 9. hiển thị ra học sinh có tổng điểm 3 môn trên 24đ
    public void hienthiHScodiemtren24(Scanner sc) {
        if (danhsachHocSinh.isEmpty()){
            System.out.println("Danh sách trống.");
            return;

        }
        System.out.println("Danh sách học sinh có tổng điểm 3 môn trên 24");
        ArrayList <hoc_sinh> danhsachdiem3montrn24 = new ArrayList<>();
        for (hoc_sinh hs : danhsachHocSinh) {
            if (hs.tongdiem3mon() > 24) {
                danhsachdiem3montrn24.add(hs);
            }
        }
        // Duyệt mảng mới
        if (danhsachdiem3montrn24.isEmpty()){
            System.out.println("Không có học sinh nào có tổng điểm 3 môn trên 24.");
        }else
        for (hoc_sinh hs : danhsachdiem3montrn24) {
            hs.disPlayInfo();
        }
    }
    //10.hiển thị ra học sinh có tổng điểm dưới 18đ
    public void hienThiDanhSachtongdiemduoi8(Scanner sc) {
        if (danhsachHocSinh.isEmpty()){
            System.out.println("Danh sách trống.");
            return;
        }

        ArrayList <hoc_sinh> danhsachdiem3monduoi18 = new ArrayList<>();
        for (hoc_sinh hs : danhsachHocSinh) {
            if (hs.tongdiem3mon() < 18) {
                danhsachdiem3monduoi18.add(hs);
            }
        }
        if (danhsachdiem3monduoi18.isEmpty()){
            System.out.println("Không có học sinh nào có tổng điểm 3 môn dưới 18 điểm.");
        } else
            for (hoc_sinh hs : danhsachdiem3monduoi18) {
                hs.disPlayInfo();
            }
    }

    //11.hthi hs dtb trên 8
    public void danhSachChatLuongGioi (Scanner sc) {
        if (danhsachHocSinh.isEmpty()){
            System.out.println("Danh sách trống.");
        }

        ArrayList <hoc_sinh> danhSachCLG = new  ArrayList<>();
        for (hoc_sinh hs : danhsachHocSinh) {
            if (hs.tinhDiemTrungBinh() > 8) {
                danhSachCLG.add(hs);
            }
        }
            if (danhSachCLG.isEmpty()){
                System.out.println("Không có học sinh chất lượng giỏi.");
            } else
                for (hoc_sinh hs : danhSachCLG) {
                    hs.disPlayInfo();
                }

        }
    }

