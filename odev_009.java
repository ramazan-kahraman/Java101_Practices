package PatikaDev_Java101_Odevler;

public class odev_009 {
    public static void main(String[] args) {

    //Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

      int sayi=100;
      int toplam=0;

        for (int i = 0; i < sayi; i++) {

            if (i%2==0){
                System.out.println(i);
            }
        }

    }
}
