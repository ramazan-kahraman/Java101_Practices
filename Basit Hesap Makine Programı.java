package PatikaDev_Java101_Odevler;

import java.util.Scanner;

public class odev_008 {public static void main(String[] args) {

    int runNo=5;

    while (!(runNo==0)){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yapmak istediğin islemi sec" +
                "\n1-toplama" +
                "\n2-cıkarma" +
                "\n3-carpma" +
                "\n4-bolme           "          );
        int islemNo= scan.nextInt();
        if (islemNo<1 || islemNo>4){
            System.out.println("hatali islem no girisi");
        }else {



            System.out.println("lutfen islem yapılacak sayilari girin");
            int s1=scan.nextInt();
            int s2=scan.nextInt();


            switch (islemNo) {
                case 1:
                    System.out.println(s1 + s2);
                    break;
                case 2:
                    System.out.println(s1 - s2);
                    break;
                case 3:
                    System.out.println(s1 * s2);
                    break;
                case 4:
                    System.out.println(s1 / s2);
                    break;
                default:
                    System.out.println("hatalı islem no");

            }
        }
    }
}
}
