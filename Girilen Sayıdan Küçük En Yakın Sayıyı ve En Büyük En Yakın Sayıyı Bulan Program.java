package PatikaDev_Java101_Odevler;

import java.util.Arrays;

public class odev_015 {
    public static void main(String[] args) {

        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

        int [] arr={35,45,70,99,15,3,50,7,9,13};
        int enkucuk=0;
        int enbuyuk=0;
        int sayi=25;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   //[3, 7, 9, 13, 15, 35, 45, 50, 70, 99]

        for (int i = 0; i <arr.length ; i++) {
            if (sayi>arr[i]){
                enkucuk=arr[i];
            }else {
                enbuyuk=arr[i];
                break;
            }
        }
        System.out.println(enbuyuk);
        System.out.println(enkucuk);


    }
}
    
    
    

