package percabangan;

public class Switch {
    public  static  void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Saya   :\"Hallo bro\"");
                System.out.println("teman  :\"Hallo juga bro\"");
                break;
            case 'B':
                System.out.println("Saya   :\"Lagi apa bro\"");
                System.out.println("teman  :\"lagi main la ap lagi\"");
                break;
            case 'C':
                System.out.println("Saya  : \"kirain lagi apa hehe...\"");
                System.out.println("teman : \"ya iyala main...\"");
                break;
            default:
                System.out.println("Saya  : \"ya maaf deh hehe..\"");
                System.out.println("teman  : \"hadu oh ae..\"");
                break;

        }
    }
}


