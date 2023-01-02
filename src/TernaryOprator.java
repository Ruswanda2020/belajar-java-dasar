public class TernaryOprator {
    public static void main(String[] args) {
        //penulisan perkondisian menggunakan if else

        var Value=75;
        String Ucapan;

        if(Value >= 75){
            Ucapan="SELAMAT ANDA LULUS";
        }else {
            Ucapan="ANDA BELUM LULUS";
        }

        System.out.println(Ucapan);

        //pengkondisian menggunakan tenary oprator yg lebih singkat menuliskan code nyah dari pada menggunakan if else

        var Nilai=75;
        String Say=Nilai >= 75 ? "SELAMAT ANDA LULUS" : "ANDA BELUM LULUS";

        System.out.println(Say);

    }
}
