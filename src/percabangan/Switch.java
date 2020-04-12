package percabangan;

public class Switch {
    public  static  void main(String[] args) {
        int jalanJalan=3;
        switch (jalanJalan){
            case 1:
                System.out.println("uang ada");
            break;
            case 2:
                System.out.println("kendaraan ada");
                break;
            case 3:
                System.out.println("tinggal belanja");
                break;
            case 4:
                System.out.println("menikmati makanan");
                break;
            default:
                System.out.println("mahluk guib");
                break;
        }
    }
}
