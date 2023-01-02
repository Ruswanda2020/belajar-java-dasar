package LatihanJavaDasar;

import java.util.Scanner;

public class SegitigaJenjang {
    public static void main(String[] args) {

        int baris,kolom,spasi,input;
        System.out.print("MASUKAN BARIS :");
        input=new Scanner(System.in).nextInt();

        for (baris=0;baris<input;baris++){
            for (spasi=0;spasi<=baris;spasi--){
                System.out.print(" ");
            }
            for (kolom=input;kolom<=baris;kolom--){
                System.out.print(" * ");
            }
            System.out.println();
        }



    }
}
