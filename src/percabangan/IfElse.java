package percabangan;

public class IfElse {
    public  static  void  main(String[] args) {
        double totalBelanja = 43000;
        double uangDiDompet = 50000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang kurang,kurangi belanja anda");
        }else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("uang cukup ansul : "+angsul);
        }else {
            System.out.println("Uang pass....");
        }
    }
}
