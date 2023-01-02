public class SwicthStatmen {
    public static void main(String[] args) {
        var Value="B";
        switch (Value){
            case "A":
                System.out.println("anda lulus dengan nilai yang baik");
                break;
            case "B":
            case "C":
                System.out.println("anda lulus");
                break;
            case "D":
                System.out.println("cukup baik");
                break;
            default:
                System.out.println("mungkin anda salah jurusan");

        }
        //PENULISAN swict lamda
        switch (Value){
            case "A" -> System.out.println("anda lulus dengan nilaiyang baik");
            case "B","c" -> System.out.println("anda lulus");
            case "C"-> System.out.println("anda belum lulus");
            default -> System.out.println("mungkin anda salah jurusan");
        }
        //penulisan swicth dengan keyword yield
        String Ucapan=switch (Value){
            case "A":
             yield ("anda lulus dengan nilaiyang baik");
            case "B","c" :
              yield  ("anda lulus");
            case "C":
              yield   ("anda belum lulus");
            default:
                yield   ("mungkin anda salah jurusan");
        };

        System.out.println(Ucapan);

    }
}
