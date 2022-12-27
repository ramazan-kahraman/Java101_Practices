package PatikaDev_Java101_Odevler;

import java.util.Scanner;

public class odev_012 {
    public static void main(String[] args) {

        //Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana
        //“mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bulmak istediginiz mukemmel sayiyi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
            }}
            if (sayi==toplam){
                System.out.println(sayi+"mükemmel sayidir");
            }else {
                System.out.println(sayi+"mükemmel değildir");
            }

    }
}
