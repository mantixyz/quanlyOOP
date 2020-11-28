import java.util.Scanner;

public class ConNguoi {
    Scanner sc = new Scanner(System.in);

    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public ConNguoi() {
        super();
    }

    public ConNguoi(String ten, int tuoi, String gioiTinh, String diaChi) {
        super();
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return
                "ten= " + ten + " tuoi= " + tuoi + " gioiTinh= " + gioiTinh + " diaChi= " + diaChi;
    }

    public void nhapThongTin(){
        System.out.println("nhap ten: ");
        ten=sc.nextLine();
        System.out.println("nhap tuoi: ");
        tuoi=sc.nextInt();sc.nextLine();
        System.out.println("nhap gioiTinh: ");
        gioiTinh=sc.nextLine();
        System.out.println("nhap diaChi: ");
        diaChi=sc.nextLine();
        
    }
}
