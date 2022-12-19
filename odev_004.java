package PatikaDev_Java101_Odevler;

import java.util.Scanner;

public class odev_004 {
    public static void main(String[] args) {

    //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
    // Taksimetre KM başına 2.20 TL tutmaktadır.
    //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    // Taksimetre açılış ücreti 10 TL'dir.

    Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gittiginiz km'yi yazınız");
    int km= scan.nextInt();
    double kmucret=2.2;
    double odenecekucret;
    double acilisucret=10;


        if (km*kmucret<=20){
        System.out.println("ödemeniz gereken tutar: 20 tl'dir.");
    } else if (km*kmucret>20) {
            odenecekucret=(km*kmucret)+acilisucret;
        System.out.println("ödemeniz gereken tutar: "+odenecekucret);

    }


}
}


