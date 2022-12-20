package PatikaDev_Java101_Odevler;

import java.util.Scanner;

public class odev_003 {
    public static void main(String[] args) {

        // Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini giriniz.");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3;

        System.out.println("Ucgenin hipotenusu : "+((kenar3)=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2))));
*/
        // Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarını giriniz: ");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        double cevre=(kenar1+kenar2+kenar3)/2;
        double alan=Math.sqrt((cevre)*(cevre-kenar1)*(cevre-kenar2)*(cevre-kenar3));

        System.out.println("Ucgenin alanı: "+alan);







    }
}
