package LatihanJavaDasar;

import java.util.Scanner;

public class CheckBilanganPrimaOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int num;
            boolean isPrime = true;

            System.out.print("input your number you want : ");
            num = input.nextInt();
            for (var i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " this is primes");
            } else {
                System.out.println(num + " this is not primes");
            }
        }
    }
}






