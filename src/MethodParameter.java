public class MethodParameter {
    public static void main(String[] args) {
     sayHallo(20,6);
        sayHallo(12,6);
        sayHallo(3,6);
    }

    static void sayHallo(int nilai1,int nilai2){
       if(nilai1 >= nilai2){
           System.out.println("nilai1 lebih besar dari nilai 2 ok");
       }else{
           System.out.println("nilai 2 lebih besar dari niali 1 ok");
       }
    }
}
