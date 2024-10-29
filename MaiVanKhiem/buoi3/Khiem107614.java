    package buoi3;
    public class Khiem107614 { 
    public static String gioiTinh(boolean gt){
         return gt? "nam":"nữ";
}
public static void main(String[] args) {
    String maSV = "107614", hoVaTen = "Mai Văn Khiêm", ngaySinh = "30/04/2006",
    lop = "IT24A", khoa ="Công Nghệ Thông Tin", diaChi = "Đà Nẵng"; 
    int tuoi = 18;
    boolean gt = false;
    System.out.println("----------TTHÔNG TIN SINH VIÊN----------");
    System.out.println("Mã Sinh Viên: "+maSV);
    System.out.println("Họ Và Tên: "+hoVaTen);
    System.out.println("Ngày Sinh: "+ngaySinh);
    System.out.println("Tuổi:"+tuoi);
    System.out.println("Giới Tính: "+gioiTinh(gt));
    System.out.println("Lớp: "+lop);
    System.out.println("Khóa: "+khoa);
    System.out.println("Địa Chỉ: "+diaChi);
    System.out.println("-------HếT-------");

    }
}
