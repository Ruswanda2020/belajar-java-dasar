public class Countinue {
    public static void main(String[] args) {

        for(var conter=1;conter <=100;conter++){

            if(conter % 2 == 0){
                continue;
            }

            System.out.println("perulangan ganjil ke-"+conter);
        }

    }
}
