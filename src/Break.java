public class Break {
    public static void main(String[] args) {
        var Counter=1;

        while (true){
            System.out.println("perulangan ke "+Counter);
            Counter++;

            if (Counter > 10){
                break;
            }
        }
        System.out.println("perulangan berhenti");

    }
}
