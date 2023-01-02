public class IfStetmen {
    public static void main(String[] args) {

        int nilai=60;
        int absen=62;

        if(nilai >=75 && absen >=90){
            System.out.println("selamat anda lulus");
        }else{
            System.out.println("silahkan coba lagi tahun depan");
        }
        if(nilai>=80 && absen>=90){
            System.out.println("nilai anda A");
        } else if (nilai>=70 && absen>=70) {
            System.out.println("niali anda B");
        } else if (nilai>=65 && absen>=65) {
            System.out.println("nilai anda C");
        } else if (nilai>=60 && absen>=60) {
            System.out.println("nilai anda D");
        }else {
            System.out.println("nilai anda E");
        }


    }

}
