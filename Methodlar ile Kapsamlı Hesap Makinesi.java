package PatikaDev_Java101_Odevler;

import java.util.Scanner;

public class odev_014 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("1 topla, 2 cıkar, 3 carp, 4 böl,5 modal, 6 dikdörtgen cevre, 0 cıkış");
        System.out.println("Lutfen yapilacak islemi secin");
        int islem= scan.nextInt();
        if (islem==0) {
            System.out.println("yine bekleriz");
        }else if (islem<1 || islem>6) {
            System.out.println("hatali secim, tekrar deneyin.");}
        else {
            System.out.println("Lutfen islem yapmak istediginiz sayilari girin");
            int sayi1 = scan.nextInt();
            int sayi2 = scan.nextInt();


            if (islem == 1) {
                topla(sayi1, sayi2);
            } else if (islem == 2) {
                cikar(sayi1, sayi2);
            } else if (islem == 3) {
                carp(sayi1, sayi2);
            } else if (islem == 4) {
                bol(sayi1, sayi2);
            } else if (islem == 5) {
                mod(sayi1, sayi2);
            } else{
                dikcevre(sayi1, sayi2);
            }
        }

    }
    public static void topla(int a, int b){
        System.out.println(a + b);
    }
    public static void cikar(int a,int b){
        System.out.println(a - b);
    }
    public static void carp(int a, int b){
        System.out.println(a * b);
    }
    public static void bol(int a, int b){
        System.out.println(a / b);
    }
    public static void mod(int a, int b){
        System.out.println(a%b);
    }
    public static void dikcevre(int a, int b){
        System.out.println((a * 2) + (b * 2));
    }
}
