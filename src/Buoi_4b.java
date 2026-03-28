public class Buoi_4b {
    public static void main(String[] args) {
        //OBJECT và CLASS:
        // Class: là một khuôn mẫu để tạo ra các đối tượng, nó định nghĩa các thuộc tính và phương thức dùng chung của đối tượng
        //obbject: là một thực thể cụ thể đc tạo ra từ class, nó có các thuộc tính và phương thức riêng của nó
        // class là bản thiết kế ngôi nhà, object là ngôi nhà được xây dựng từ bản thiết kế
        // ví dụ: sinh viên: tên , tuổi điểm toán lí hóa, điểm trung bình, xếp loại
        // tạo đối tượng sinh viên từ class sinhVien
        //syntax: tên class tenDoiTuong = new sinhVien
        sinhVien sv1 = new sinhVien("Minh Anh", 20, 8.5, 8, 9);
        sinhVien sv2 = new sinhVien("Nguyễn Văn B", 20, 9, 8, 7);
        // truy cập vào các thuộc tính và phương thức của đối tượng
        double dtb1 = sv1.tinhDiemTrungBinh();
        System.out.println("Điểm TB của " + sv1.ten + "là " + dtb1);
         sv1.xepLoai();
        // System.out.println("Số tuổi của " + sv1.ten + "là " + sv1.tuoi);
        // Lỗi vì thuộc tính tuổi là private, ko thể truy cập tực tiếp từ bên ngoài class mà cần 1 phương thức

    }
}
//readonly: cho phép truy cập từ bên trong class và ko đc phép chỉnh sửa
//public: là một phạm vi truy cập, cho phép truy cập từ bất kì đâu trong chương trình
// private: là một phạm vi truy cập, chỉ cho phép truy cập từ bên trong class(truy cập thông qua các phưng thức)
class sinhVien {
    // thuộc tính
    public String ten;// có thể đọc đc luôn không cần thông qua phương thức
    private int tuoi;
    private double diemToan; // gọi thông qua các phương thức mà đã đc định nghĩa
    private double diemLy;
    private double diemHoa;

// constructor: là một phương thức đặc biệt để khởi tạo đối tượng, cùng tên với class
    public sinhVien(String ten, int tuoi, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;

    }

    //Phương thức
    // taoh hàm hay là tạo phương thức:
    //1. CÓ giá trị trả về: public kiểuDL tenPhuongThuc (){};
    //2. không có giá trị trả về(void): public void tenPhuongThuc (){};
    //tính điểm trung bình : sử dụng phương thức có giá trị trả về
    public double tinhDiemTrungBinh() {
        double diemTrungBinh = (diemHoa + diemLy + diemToan)/3;
        return diemTrungBinh;
    }

    //xếp loại: sử dụng phương thức ko có giá trị trả về
    public void xepLoai(){
        //sử dụng phương thức tinhDiemTrungBinh để tính toán đtb của học sinh
        double diemTrungBinh = tinhDiemTrungBinh();
        if (diemTrungBinh >= 8) {
            System.out.println("Học sinh giỏi");
        } else if (diemTrungBinh >= 6.5) {
            System.out.println("Học sinh khá");
        } else if (diemTrungBinh >= 5) {
            System.out.println(" Học sinh trung bình");
        } else  {
            System.out.println("Học sinh Yếu");
        }
    }
}