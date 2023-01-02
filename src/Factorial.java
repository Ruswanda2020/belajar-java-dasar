public class Factorial {
    public static void main(String[] args) {

        System.out.println(FactorialLoop(11));
        System.out.println(FactorialRecrusive(11));
        loop(10000);

    }
    static int FactorialLoop(int value){
       var  result=1;
       for (var counter=1;counter <= value;counter++){
           result *=counter;
       }
       return result;
    }
    static int FactorialRecrusive(int value){
        if(value==1){
            return 1;
        }else {
            return value*FactorialRecrusive(value-1);
        }
    }
    static void loop(int value){
        if(value==0){
            System.out.println("selesai");
        }else {
            System.out.println("loop ke"+" "+value);
            loop( value -1);
        }
    }
}
