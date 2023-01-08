package LatihanJavaDasar;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        dataBmi();
    }

    public static void dataBmi() {
        Scanner scanner = new Scanner(System.in);

        String nama;
        int beratBadan;
        double tinggiBadan;
        double bmi;

        System.out.print("masukan nama anda : ");
        nama = scanner.nextLine();
        System.out.print("masukan berat bandan anda : ");
        beratBadan = scanner.nextInt();
        System.out.print("masukan tinggi badan anda :");
        tinggiBadan = scanner.nextDouble();
        tinggiBadan/=100;
        bmi = beratBadan / (tinggiBadan * tinggiBadan);
        System.out.println(nama + " BMI KAMU " + bmi);

        if (bmi <18.5){
            System.out.println(nama + " berat badan kamu kurarang ideal konsumsi lah makanan-makan bergizi yahhh");
        } else if (bmi < 24.5) {
            System.out.println(nama + " berat badan kamu belum mencukupi katagori berat badan ideal terus konsumsi makakanan bervitamin yah");
        } else if (bmi < 28.5 ) {
            System.out.println(nama + " berat badan kamu ideal terus lah jaga pola makn mu yah");
        }else {
            System.out.println(nama + " kamu obositas kurangi makanamu ");
        }
    }
}




