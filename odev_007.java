package PatikaDev_Java101_Odevler;

import java.util.Scanner;

public class odev_007 {
    public static void main(String[] args) {

        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin
        kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL

         */

        Scanner scan=new Scanner(System.in);
        double kg;
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;

        System.out.println("lutfen aldıgınız armut kilosunu giriniz");
        kg= scan.nextDouble();
        System.out.println(armut*kg);

        System.out.println("lutfen aldiginiz elma kilosunu giriniz");
        kg= scan.nextDouble();
        System.out.println(elma*kg);

        System.out.println("lutfen aldiginiz domates kilosunu giriniz");
        kg= scan.nextDouble();
        System.out.println(domates*kg);

        System.out.println("lutfen aldiginiz muz kilounu giriniz");
        kg= scan.nextDouble();
        System.out.println(muz*kg);

        System.out.println("lutfen aldiginiz patlican kilosunu giriniz");
        kg= scan.nextDouble();
        System.out.println(patlican*kg);


    }
}
