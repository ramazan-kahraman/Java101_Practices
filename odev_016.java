package PatikaDev_Java101_Odevler;

import java.util.Arrays;

public class odev_016 {
    public static void main(String[] args) {

        //Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

        int [] arr={3,5,7,9,1};
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i];

        }
        System.out.println(toplam/ arr.length);
        System.out.println(Arrays.toString(arr));

    }
}

