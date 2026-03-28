package bai_tap.cyber;

public class hoc_sinh {
    // thuộc tính  học sinh = {id, hoTen, lop, diaChi, toan, ly, hoa}
private String id;
private String hoTen;
private String lop;
private String diaChi;
private double diemToan;
private double diemLy;
private double diemHoa;
// constructor
    public hoc_sinh(String id, String hoTen, String lop, String diaChi, double diemToan, double diemLy, double diemHoa) {
        this.id = id;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diaChi = diaChi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    // Phương thức
    public void disPlayInfo (){
        System.out.println("ID: " + id
                + " | Tên: " + hoTen
                + " | Lớp: " + lop
                + " | Địa chỉ: " + diaChi
                + " | Điểm Toán: " + diemToan
                + " | Điểm Lý: " + diemLy
                + " | Điểm Hóa: " + diemHoa);

}
public double tinhDiemTrungBinh(){
        return (diemToan*diemLy*diemHoa) / 3;
}
public String getId(){
        return id;
}
public String getHoTen(){
        return hoTen;
}
public double tongdiem3mon(){
        return diemToan + diemLy +diemHoa;
}

}
