import java.util.Scanner;

public class sinhvien extends ConNguoi {
     String msv;
     double diemSo;

    public sinhvien() {
        super();
    }

    public sinhvien(Scanner sc, String ten, int tuoi, String gioiTinh, String diaChi) {
        super(ten, tuoi, gioiTinh, diaChi);
    }

    public sinhvien(String msv, double diemSo) {
        this.msv = msv;
        this.diemSo = diemSo;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public double getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double diemSo) {
        this.diemSo = diemSo;
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("nhap ma sinh vien: ");
        msv=sc.nextLine();
        System.out.println("nhap diem so: ");
        diemSo=Double.parseDouble(sc.nextLine());
        while (diemSo>10.0 ||diemSo<0.0){
            System.err.println("nhap lai diem !");
            diemSo=Double.parseDouble(sc.nextLine());
            
        }
        System.out.println("--------------------");

    }

    @Override
    public String toString() {
        return super.toString()+ " msv= " + msv  + " diemSo= " + diemSo;

    }
    public void hienThi(){
        System.out.println(toString());
    }
}
