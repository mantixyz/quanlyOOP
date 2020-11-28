public class GiaoVien extends ConNguoi {
    String lop;
    double luong;

    public GiaoVien() {
        super();
    }

    public GiaoVien(String ten, int tuoi, String gioiTinh, String diaChi, String lop, double luong) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.lop = lop;
        this.luong = luong;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }


    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("nhap lop ");
        lop = sc.nextLine();
        System.out.println("nhap luong ");
        luong=Double.parseDouble(sc.nextLine());
        while (luong<0.0) {
            System.err.println("nhap lai luong !");
            luong = Double.parseDouble(sc.nextLine());
        }
        System.out.println("--------------------");
    }

    @Override
    public String toString() {
        return super.toString()+ " lop= " + lop + " luong= " + luong ;
    }
    public void hienThi(){
        System.out.println(toString());
    }
}
