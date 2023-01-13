package LatihanJavaDasar;

import java.util.Scanner;

public class CheckBilanganPrimaOrNot {
    public static void main(String[] args) {
        show(29);
        show(21);
        show(3);
    }
    public static boolean isPrimes(int num){
        if (num < 2){
            return false;
        }
        for (var i = 2 ; i <= num / 2; i++){
            if (num % i == 0){
               return false;
            }
        }
        return true;
    }
    public static void show(int num){

        if (isPrimes(num)){
            System.out.println(num + " bilangan prima");
        }else {
            System.out.println(num+ " bukan bilangan prima");
        }
    }
}






