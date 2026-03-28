public class Buoi_5 {
    public static void main(String[] args) {
        // 4 tính chất của oop: tính đóng gói, kế thừa, tính đa hình, tính trừu tượng
  student st1 = new student("HMA", 25, "10");// khi dùng constructor cần truyền đầy đủ 3 thuộc tính của class đã tạo nếu ko sẽ báo lỗi
  // st1.name : ko đc, cần tạo phương thứ truy cập -> tính đóng gói
  String name =  st1.getName(); // lấy name thông qua phương thức
        System.out.println("Họ tên: " + name);

        // tính kế thừa: cho phép
        giamDoc gd1 = new giamDoc("NVWS", 40,"Kinh DOanh", "Giám Đốc");
        gd1.thongTinhNhanVien();


    }
}

// tính đóng gói : là một tính chất bên trong oop chỉ cho phép truy cập các thuộc tính của dối tượng thông qua các phương thức
class student {
    // thuộc tính
    private String name;
    private int age;
    private String lop;

    //constructor
    public student(String name, int age, String lop) {
        this.name = name;
        this.age = age;
        this.lop = lop;
    }
    // phương thức để truy cập hệ thống
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getLop() {
        return lop;
    }

    // c ó 3 cách để gắn giá trị cho thuộc tính
    //1. gắn trực tiếp vào trong class
    // private String name = "na"; -> ko sử dụng
    //2. Gắn trực tiếp thông qua constructor (phổ biến nhất)
    //3. Gắn thông qua phg thức setter (sử dụng phg thức có giá trị trả về)

//    public void setName(String name) {
//        this.name = name;
//    }
}


// Tính kế thừa: cho phép tạo lớp mới từ lớp đã tồn tại và kế thừa toàn bộ thuộc tính và phương thức của lướp cha
class nhanVien {
    // thuoccj tinh
    public String name;
    private int age;
    private String phongBan;

    //constructor
    public nhanVien(String name, int age, String phongBan) {
        this.name = name;
        this.age = age;
        this.phongBan = phongBan;
    }
    // phương thức
    public void thongTinhNhanVien() {
        System.out.println("Đây là nhân viên");
    }
}

class giamDoc extends nhanVien {
    // tt
//    public String name;
//    private int age;
//    private String phongBan;
    private String chucVu;

    //constr
    public giamDoc(String name, int age,String phongBan, String chucVu) {
//        this.name = name;
//        this.age = age;
//        this.phongBan = phongBan;

        // super: dunfg để gọi lại cons của lớp cha (nhanVien), đặt trc cons của lớp con để có thể khởi tạo lại giá trị
        super(name, age, phongBan);
this.chucVu = chucVu;
    }
    public int getAge (){
        return getAge();
    }

//    public void thongTinGiamDoc() {
//        System.out.println("Đây là Giám Đốc");
//    }
    //sử dụng lại phg thức của lớp cha và ghi đè phg thức
    @Override
    public void thongTinhNhanVien() {
        System.out.println("Đây là giám đốc");
    }

}

// Tính đa hình: một hành động phg thức có nhiều cahs thực hiện khác nhau sử dụng @Overide để ghi đè
// tính trừu tượng:
// tính diện tích của 1 hình
abstract class hinhHoc{
    //tt
    public String tenHinh;
    public int canhA;
    public int canhB;

    //constr
    public hinhHoc(String tenHinh, int chieuDai, int chieuRong) {
        this.tenHinh = tenHinh;
        this.canhA = chieuDai;
        this.canhB = chieuRong;
    }
    // phương thức
    abstract public int tinhDienTich ();}

class hinhChuNhat extends hinhHoc{
    //cons
    public hinhChuNhat(String tenHinh, int canhA, int canhB) {
        super(tenHinh, canhA, canhB);
    }
    // triển khai phg thức trừu tượng

    @Override
    public int tinhDienTich() {
        return canhA * canhB;
    }
}

class hinhVuong extends hinhHoc{
    //cons
    public hinhVuong(String tenHinh, int canhA, int canhB) {
        super(tenHinh, canhA, canhB);

    }
    // triển khai phương thức trừ tươngk
    public int tinhDienTich() {
        return canhA * canhB;
    }
}

