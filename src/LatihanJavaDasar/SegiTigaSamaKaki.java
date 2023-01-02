package LatihanJavaDasar;

import java.util.Scanner;

public class SegiTigaSamaKaki {
    public static void main(String[] args) {

        int baris,kolom,input;
        System.out.print("MASUKAN BARIS :");
        input=new Scanner(System.in).nextInt();

        for (baris=0;baris<input;baris++){
            for (kolom=0;kolom<input;kolom++){
                System.out.print(" * ");
                if (baris==kolom){
                    break;
                } else if ((baris+kolom)==8) {
                    break;
                    
                }

            }
            System.out.println("\n");

        }






    }
}
