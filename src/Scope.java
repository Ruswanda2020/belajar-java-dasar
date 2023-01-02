public class Scope {
    public static void main(String[] args) {
        sayHallo("wanda");
        sayHallo("");

    }

    static void sayHallo(String name){
        var hallo="hi"+" "+name;
        if(!name.isBlank()){
            String hi="haii"+" "+name;

            System.out.println(hi);
        }
        System.out.println(hallo);
    }
}
