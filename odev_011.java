package PatikaDev_Java101_Odevler;

import java.util.Scanner;

public class odev_011 {
    public static void main(String[] args) {

        //Java ile klavyeden girilen N tane
        //sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

        Scanner scan = new Scanner(System.in);
        System.out.println("kaç sayi gireceksiniz");
        int sayiAdedi = scan.nextInt();

        int max=0;
        int min=0;


        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println(i +". sayiyi girin");
            int sayi=scan.nextInt();
            if (i==1){
                max=sayi;
                min=sayi;
            }
            if (sayi>max){
                max=sayi;

        }
            if (sayi<min){
                min=sayi;
            }

        }
        System.out.println("Girilen en buyuk sayi: "+max);
        System.out.println("Girilen en kucuk sayi: "+min);
    }
}
