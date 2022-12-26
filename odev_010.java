package PatikaDev_Java101_Odevler;

public class odev_010 {
    public static void main(String[] args) {

        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        //3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        int sayi=25;
        int toplam=0;
        int sayac=0;


        for (int i = 1; i <sayi ; i++) {
            if (i%3==0 && i%4==0){
                toplam+=i;
                sayac++;

            }
        }
        int ort=toplam/(sayac);
        System.out.println(ort);
    }
}
