public class Buoi_2 {
    public static void main(String[] args) {
     //4.3 Toán tử gán: =, +=, -=, *=, /=,
        String ngay = "Thứ 2 ngày 9/3/2026";
        int soA = 10;
        soA +=5; // tương đương soA = soA + 5
        soA -=5; // tương đương soA = soA -5
        soA *=5;// tương đương soA = soA * 5
        soA /=5;// tương đương soA = soA / 5
        //4.4 Toán tử logic: &&, ||, !: sử dụng cho những biến kiểu Boolean
        //&&: Kết hợp tất cả các điều kiện của các logic: VÀ
        Boolean logicA = true;
        Boolean logicB = true;
        Boolean logicC = true;
        Boolean kq1 = logicA && logicB && logicC;
        System.out.println("Kết quả 1: " + kq1);
        // ||: HOẶC (hoặc A hoặc B)
        Boolean logicD = true;
        Boolean logicE = true;
        Boolean logicF = false;
        boolean ketQua2 = logicD || logicE || logicF;
        System.out.println("Kết quả 2: " + ketQua2);
        // ! : PHỦ ĐỊNH
        Boolean logicG = true;
        boolean ketQua3 = !logicG;
        System.out.println("Kết quả 3: " + ketQua3);

        // Tiền tố và hậu tố: ++, --


        // Cấu trúc câu điều kiện
        // if statement: nếu đúng thì sẽ thực hiện logic, nếu sai không lmj cả
        // if (điều kiện đúng) { thực hiện logic }
        int thu = 2;
        if(thu == 2 || thu == 6) {
            System.out.println("Hôm nay tôi phải đi học");
        }
// if else statement:
        // if (điều kiện đúng) {logic a} else {logicB}

        // if else if statement:
        // if (ĐKA) {logic A} else if (ĐKB đúng) {logic B} else {ĐKC}

        //SWITCH case stament
        // switch (Điều kiện cần kiểm tra)
        //case gia trị 1: thực hiện logic 1; break;
        //case giá trị 2: thực hiện logic 2; break;
        //case giá trị 3: thực hiện logic 3; break;
        // default: thực hiện logic mặc định; break; (chỉ xảy ra khi không có điều kiện nào khớp với điều kiện cần kiểm tra)

        int soC =2;
        switch (soC) {
            case 1:
                System.out.println("Số C là 1");
                break;
            case 2:
                System.out.println("Số C là 2");
                break;
                case 3:
                    System.out.println("Số C là 3");
                    break;
            default:
                System.out.println("Số C ko phải 1, 2 ,3");
        }
switch (soC) {
            case 1:
    System.out.println("SỐ C là 1");
    break;
    case 2:
    case 3:
        System.out.println("Số C là 2 hoặc 3");
        break;
        default:
            System.out.println("Số C kp là 1 2 hoặc 3");

}
// Vòng lặp: lòng lặp while
        // cú pháp: while (điều kiện đúng) {thực hiện logic}
        // miễn là điều kiện luôn đúng thì vòng lặp sẽ liên tục được thực hiện

        int soD = 2;
        while (soD <= 10) {
            System.out.println("soD" + soD );
            soD += 2; // 4,6,8,10 đến 10 sẽ dừng lại, vượt ra khỏi điều kiện đúng thì vòng lặp sẽ dừng lại
        }
        // while (true){
        // sout ("Vong lap while đang chạy")
        // }
        int soE =1;
         while (soE >= 5) {
             System.out.println("soE: " + soE);
             soE++; // soE++ = soE +=1 => hậu tố: sử dụng cái biến đó đi thực hiện các logic phía trên sau đó tăng thêm 1 đơn vị
         }
// vòng lặp do-while
        //cú pháp: do {thực hiện logic} while (điều kiện đúng);
        //logic sẽ đc thực hiện ít nhất 1 lần dù đk đúng hay sai sau đó mới đi kiểm tra đk, nếu đk đúng thì tiếp tục thực hiện, nếu đk sai thì dừng lại
        int soF =1;
         do {
             System.out.println("soF: " + soF);
             soF++;
         }while (soF <= 3); // điều kiện = false -> vòng lặp sẽ dừng
  // vòng lặp for (*)
        // cú pháp: for(giá trị khởi tạo: điều kiện đúng : giá trị thay đổi) {thực hiện logic}
        // dùng khi biết đc số lần lặp lại cụ thể

       for(int i =1; i < 5; i++) {
           System.out.println("i: " + i);
       }

    }
}
