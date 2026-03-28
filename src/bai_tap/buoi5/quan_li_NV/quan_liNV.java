package bai_tap.buoi5.quan_li_NV;

import java.util.ArrayList;
import java.util.Scanner;

public class quan_liNV {
    //tt
    private ArrayList<nhan_vien> danhSachNhanVien = new ArrayList<>();
// Lưu ra mảng từng nhân viên một

    //pt
    //1. Thêm nhân viên
    public void themNhanVien(Scanner sc) {
        System.out.println("Nhập ID nhân viên");
        String id = sc.nextLine();

        //Kiểm tra id đã tồn tại chưa
        // nếu khác null là đã tồn taiju thì ko cho thêm
        if (timNhanVientheoID(id) != null) {
            System.out.println("ID đã tồn tại. Vui lòng nhập lại");
            return; // dừng phg thức lại
        };
        //neeus chưa tồn tại thì thêm mới
        System.out.println("Nhập name: ");
        String name = sc.nextLine();
        System.out.println("Nhập age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập address: ");
        String address = sc.nextLine();
        System.out.println("Nhập salaryperHours: ");
        double salaryPerHours = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập totalWorkingHours: ");
        double totalWorkingHours = Double.parseDouble(sc.nextLine());
        nhan_vien nv = new nhan_vien(id, name, age, address, salaryPerHours, totalWorkingHours);
        danhSachNhanVien.add(nv);
        System.out.println("Thêm nhân viên thành công: ");
    }

    //2. Hiển thị ds nhân viên
    public void hienThiDanhSachNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
            return;// dừng phg thức, sẽ ko thực hiện những logic bên dưới
        }
        for (nhan_vien nv : danhSachNhanVien) {

            nv.disPlayInfo();
        }
    }
    // 3. Xóa nv theo ID
    public void xoaNhanVien(Scanner sc) {
        System.out.println("Nhập id nhân viên cần xóa");
        String id = sc.nextLine();
        // đặt cờ hiệu chưa tìm thấy là false
        boolean found = false;
        for (nhan_vien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                danhSachNhanVien.remove(nv);
                System.out.println("Nhân viên đã bị xóa");
                found = true;
                break;
            }
        }
if (!found) {
    System.out.println("Khng tìm thấy nhân viên ID: " + id);
}
    }

    //4. Tìm kiếm nv dựa vào id
    public void timKiemNVtheoid(Scanner sc) {
        System.out.println("Nhập vào id muốn tìm:");
        String id = sc.nextLine();
        //đặt cờ hiệu: chưa tìm thấy = false
        boolean found = false;
        for (nhan_vien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với ID: " + id);
        }
        }
    // tìm nhân viên theo id
    public nhan_vien timNhanVientheoID(String id) {
        for (nhan_vien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                return nv; // trả về nv nếu tìm thấy
            }
        }
        return null;
    }
//5. tìm nv có tổng lương cao nhất
    public void timNVcoTongLuongCaoNhat(){
        //ktra có rỗng ko
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách NV trống");
            return;
        }
       nhan_vien maxNV = danhSachNhanVien.get(0);
        //tìm kiếm
        for(nhan_vien nv : danhSachNhanVien){
           if( nv.calculateSalary() > maxNV.calculateSalary() ) {
               maxNV = nv;
           };

        }
        System.out.println("Nhân viên có tổng lương cao nhất");
        maxNV.disPlayInfo();

    }

    //6. Tìm NV có số giờ làm thấp nhất
    public void timNVcoGioLamThapNhat(){
        //ktra rỗng k
        if(danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách NV trống!");
            return;
        }
   nhan_vien minNV = danhSachNhanVien.get(0);

    for (nhan_vien nv : danhSachNhanVien) {
        if(nv.gettotalWorkingHours() < minNV.gettotalWorkingHours()) {
            minNV = nv;
        }

    }
        System.out.println("Nhân viên có số giờ làm thấp nhất:");
        minNV.disPlayInfo();
    }
//7. SX nv theo tên
public void saxepNVtheoTen(){
        //ktr rỗng
    if (danhSachNhanVien.isEmpty()) {
        System.out.println("Danh sách trống");
        return;
    }
    // sx theo tên
    // cú pháp: sort trên ArrayList
    //arrayList.sort((phần tuwr1, phần tử 2) -> {thực hiện logic ss giữu pt1 và pt2} )
// sẽ -1 nếu phần tử 1 < 2
    // sẽ 1 nếu pt1 > pt2
    // sẽ 0 nếu pt1 = pt 2
  danhSachNhanVien.sort((nv1 , nv2) -> nv1.getName().compareTo(nv2.getName()));
    System.out.println("Danh sách nhân viên sau khi sắp xếp theo tên: ");
    hienThiDanhSachNhanVien();
}

//8. SX nhân viên theo số giờ làm
    public void sapxepNVtheosoGioLam(){
        if(danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách NV trống.");
            return;
        }
        danhSachNhanVien.sort((nv1 , nv2) -> Double.compare(nv1.gettotalWorkingHours(), nv2.gettotalWorkingHours()));
        System.out.println("Danh sách nhân viên sau khi đã sx theo soos giờ lam");
        hienThiDanhSachNhanVien();
    }
//9. Cập nhật thông tin NV
    public void capNhatThongTinNhanVien(Scanner sc){
        //kt rỗng
        if(danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
            return;
        }
        // tìm thấy nhân viên cần đc caapj nhật id hoặc tên để tìm kiếm
        System.out.println("Nhập ID nhân viên cần cập nhật: ");
        String id = sc.next();
        nhan_vien nv = timNhanVientheoID(id); // trả về nv bên trong có đủ các thuộc tính
       //kiểm tra có tìm thấy NV hay ko
        if (nv == null) {
            System.out.println("Không tìm thấy nhân viên với id: " + id);
            return;
        }
// nếu thấy thì cập nhật thông tin
        System.out.println("Nhập tên mới: ");
        String name = sc.nextLine();
        System.out.println("Nhập age mới:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ mới: ");
        String address = sc.nextLine();
        System.out.println("Nhập lương mới:");
        Double salaryPerHours = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập tổng số giờ làm mới:");
        Double totalWorkingHours =  Double.parseDouble(sc.nextLine());
        // cập nhật thông tin
        // tạo ra một nhân viên mới với thông tin đã cập nhật
        nv = new nhan_vien(id, name, age, address, salaryPerHours, totalWorkingHours);
        //cập nhật lại thông tin nv trong danh sách
        for (int i =0; i < danhSachNhanVien.size(); i++) {
            if(danhSachNhanVien.get(i).getId().equals(id)){
                danhSachNhanVien.set(i, nv); // cập nhật lại thông tin nv tại vtri index i
                break;
            }
        }
        System.out.println("Cập nhật thông tin nv thành công");
    }
    // 10. Cập nhật số giờ làm của nv
    public void capNhatGioLam(Scanner sc){
        if(danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
            return;
        }


    }
    //11. Hiển thị nv lm quá 120h
    public void hienThiNhanViencoTonggioLamHon120(Scanner sc){
        if(danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách trống");
            return;
        }
        System.out.println("Danh sách nhân viên có tổng số giờ làm lớn hơn 120h:");
        //Lưu ý: sẽ tạo ra danh sách mới để lưu trữ
        ArrayList<nhan_vien> dsNhanVienGioLamLonHon120 = new ArrayList<>();
        for (nhan_vien nv : danhSachNhanVien) {
            if(nv.gettotalWorkingHours() >= 120){
                dsNhanVienGioLamLonHon120.add(nv);

            }
        }

        //Duyệt mảng mới để hiển thị ra nv có thông tin đạt yo cầu đề bài
if(dsNhanVienGioLamLonHon120.isEmpty()) {
    System.out.println("Không có nv nào có tổng giờ lm hơn 120H");
} else
    for (nhan_vien nv : dsNhanVienGioLamLonHon120) {
        nv.disPlayInfo();
    }

    }
// 12. Nv cos giờ lm < 80
}
