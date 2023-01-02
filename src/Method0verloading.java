public class Method0verloading {
    public static void main(String[] args) {
        sayHallo();
        sayHallo("Ruswanda");
        sayHallo("dian","dirgantara");

    }
    static void sayHallo(){
        System.out.println("hallo");
    }
    static void sayHallo(String firstname){
        System.out.println("hallo"+" "+firstname);
    }
    static void sayHallo(String firstname,String lastname){
        System.out.println("hallo"+" "+firstname+" "+lastname);
    }
}
