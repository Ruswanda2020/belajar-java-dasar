public class ForEach {
    public static void main(String[] args) {

        String[] array={
                "Ruswanda","dirgantara","oktavians",
                "progremer","kadang","malas"
        };

        //penulisan manual untuk mengkses data dalam aray mengunakan forloop

        for (var i=0;i < array.length;i++){
            System.out.println(array[i]);
        }

        //cara mengkases array menggunakan ForEach

        System.out.println("----------------------------------------------------------------");
        System.out.println("ForEach");
        System.out.println("-----------------------------------------------------");

        for(var name : array){
            System.out.println(name);
        }
    }
}
