package LatihanJavaDasar;

import java.util.Scanner;

public class SegitigaApp {
    public static void main(String[] args) {

        int i,j,k,n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("masukan baris : ");
        n=scanner.nextInt();

        for (i=0;i<n; i++){
            for (j=0;j<=i;j++){
                System.out.print(" ");
            }
                 for (k=n;k>i;k--){
                      System.out.print(" * ");
                  }

                 System.out.println();

        }

    }
}
