package PatikaDev_Java101_Odevler;

import java.util.Scanner;

public class odev_006 {
    public static void main(String[] args) {

        //Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        //Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        //Formül
        //Kilo (kg) / Boy(m) * Boy(m)

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu kg cinsinde giriniz");
        double kg= scan.nextDouble();
        System.out.println("lutfen boyunuzu mt cinsinden giriniz");
        double boy= scan.nextDouble();

        System.out.println(kg/(boy*boy));

    }
}
