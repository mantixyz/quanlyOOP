import java.util.ArrayList;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        GiaoVien gv=new GiaoVien();
        sinhvien sv =new sinhvien();
        ArrayList<sinhvien>sinhviens=new ArrayList<>();
        ArrayList<GiaoVien>giaoViens= new ArrayList<>();
        int n;

        do {
            System.out.println("Menu \n"+
                    "1. nhap thong tin. \n"+
                    "2. xem thong tin \n"+
                    "3.nhap thong tin giao vien \n"+
                    "4.xem thong tin giao vien \n"+
                    "5. de thoat");
            n=Integer.parseInt(sc.nextLine());

            switch (n){
                case 1:
                    System.out.println("nhap so sinh vien can them: ");
                    int m=Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < m; i++) {
                        sinhvien sv1= new sinhvien();
                        sv1.nhapThongTin();
                        sinhviens.add(sv1);

                    }break;

                case 2:
                    System.out.println("xem thong tin sinh vien");
                    for (int i = 0; i < sinhviens.size(); i++) {
                        sinhviens.get(i).hienThi();
                    }break;


                case 5:
                    System.out.println("tam biet");break;


                case 3:
                    System.out.println("nhap so giao can them: ");
                    int z=Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < z; i++) {
                        GiaoVien gv1 = new GiaoVien();
                        gv1.nhapThongTin();
                        giaoViens.add(gv1);

                    }break;
                case 4:
                    System.out.println("xem thong giao vien");
                    for (int i = 0; i < giaoViens.size(); i++) {
                        giaoViens.get(i).hienThi();
                    }break;



                default:
                    System.err.println("hay nhap lai");
            }

        }while (n!=5);

        






    }
}
