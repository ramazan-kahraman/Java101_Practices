package PatikaDev_Java101_Odevler;

import java.util.Scanner;

public class odev_013 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");
        int sayi= scan.nextInt();
        palindromSayi(sayi);

    }
    public static void palindromSayi(int sayi){

        if (sayi>=0 && sayi<10){
            System.out.println("palindrom sayi");
        } else if (sayi>=10 && sayi<100) {
            if (sayi%10==sayi/10){
                System.out.println("palindrom sayi");
            }
        } else if (sayi>=100 && sayi<1000) {
            if (sayi%10==sayi/100){
                System.out.println("palindrom sayi");
            }
        } else if (sayi>=1000 && sayi<10000) {
            if (sayi%10==sayi/1000 && (sayi/100)%10==(sayi/10)%10){
                System.out.println("palidrom sayi");
            }
        }

    }
}
