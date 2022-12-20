package PatikaDev_Java101_Odevler;

import java.util.Scanner;

public class odev_005 {
    public static void main(String[] args) {


        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        // 𝜋 sayısını = 3.14 alınız.
        // Formül : (𝜋 * (r*r) * 𝛼) / 360


        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen yaricapi(r) girin");
        double r = scan.nextDouble();
        System.out.println("lutfen merkez aci olcusunu(alfa) girin");
        double alfa=scan.nextDouble();
        double pi = 3.14;

        System.out.println((pi*(r*r)*alfa)/360);

    }
}
