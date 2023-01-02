public class MethodVariabelArgumen {
    public static void main(String[] args) {
//cara ke-1
        int[] array={80,99,50,89,68};
        saycongrets("eko",array);
        //cara ke-2
        saycongrets("Ruswanda",80,67,33,90,87,99);


    }

    static void saycongrets(String name,int...values){
        var total=0;
        for(var value: values){
            total += value;
        }

        int finalvalue=total/values.length;

        if(finalvalue >=75){
            System.out.println("selamat"+" "+name+" "+"anda lulus");
        }else{
            System.out.println("maaf "+name+" "+" "+"anda belum lulus");
        }
    }
}
