package LatihanJavaDasar;

import java.util.Scanner;

public class MenampilkanKelipatan5and3 {

    static int jumlahangkagenap=0,jumlahangkaganjil=0;

    public static void main(String[] args) {
        int batasAngka=getInputatasAngka();
        System.out.println("====================");
        System.out.println("Angka-angka yang merupakan kelipatan 3 atau 5 dari " +batasAngka+" adalah");

        for (int angka=1;angka<batasAngka;angka++){
            if (kelipatanTigaAtauLima(angka)){
                tampilkanAngka(angka);
                tambahAJumlahngkaGenapAtauGanjil(angka);
            }
        }
        tampikanJumlahAngkaGenapAtauGanjil();


    }
    private static int getInputatasAngka(){
        System.out.print("input batas angka : ");
        return new Scanner(System.in).nextInt();
    }
    private static boolean kelipatanTigaAtauLima(int angka){
        return angka % 3==0 || angka % 5==0;
    }
    private static void tampilkanAngka(int angka){
        System.out.print("["+angka+"]");
    }
    private static void tambahAJumlahngkaGenapAtauGanjil(int angka) {
        if (genap(angka)) {
            jumlahangkagenap++;
        } else {
            jumlahangkaganjil++;
        }

    }
    private static boolean genap(int angka) {
        return angka % 2==0;
    }

    private static void tampikanJumlahAngkaGenapAtauGanjil(){
        System.out.println("");
        System.out.println("jumlah angka genap : "  +jumlahangkagenap+" "+"angka");
        System.out.println("jumlah angka ganjil: "  +jumlahangkaganjil+" "+"angka");
    }
}
