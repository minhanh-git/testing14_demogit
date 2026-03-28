import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Buoi_4 {
    public static void main(String[] args) {
        // arraylist: là một cấu trúc dữ liệu động, có tể thay đổi kích thước trong quá trình thực thi ctrinh
        //cú pháp: ArrayList<kiểu dữ liệu> tenArrayList = new ArrayList<>();
        //ví dụ: mảng string điện thoaỊ: oppo...
        ArrayList<String> mangDienThoai = new ArrayList<>();
        //CRUD: cho arrayList: create, Read, Update, Delete
        // thêm phần tử vào mảng
        //syntax: tenArrayList.add(giá trị)
        mangDienThoai.add("iphone");
        mangDienThoai.add("samsung");
        mangDienThoai.add("xiaomi");
        mangDienThoai.add("oppo");
        mangDienThoai.add("realme");
        System.out.println("Giá trị của mảng điện thoại: " + mangDienThoai);
        // Thêm vào vị trí cụ thể: sử dụng phương thức add(index, giá trị);

        System.out.println("Gia tri cua mang dien thoai sau khi them nokia vao vi tri index 1: ");
        // cap nhat gia tri trong mang: su dung phuong thuc set(index, gia tri));
        mangDienThoai.add(2, "nokia");
        mangDienThoai.set(3, "huawei");
        //Xoa phan tu trong mang
mangDienThoai.remove("huawei");
        // Duyet mang
        for (String dienThoai : mangDienThoai ) {
            System.out.println("ten dien thoai: " + dienThoai);
        }
// Đếm số lượng phần tử trong mảng: sử dụng phương thức size();
            int soLuong = mangDienThoai.size();
            System.out.println("Số lượng phần tử trong mảng: " + soLuong);
            //Sắp xếp phần tử trong mảng:


            Collections.sort(mangDienThoai); // sắp xếp thứ tự tăng dần
            System.out.println("Giá trị của mảng số sau khi sx: " + mangDienThoai);
            Collections.reverse(mangDienThoai); // sx theo thứ tự giảm dần

            // Tìm kiếm phần tử trong mảng: sử dụng phương thức contains()
            boolean ketQua = mangDienThoai.contains("iphone");
            System.out.println("Kết quả tìm kiếm phần tử ip trong mảng đt: " + ketQua);









    }
}
