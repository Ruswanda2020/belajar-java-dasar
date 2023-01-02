public class ReturnValue {
    public static void main(String[] args) {


        System.out.println(sum(200,200));
        System.out.println(sum(100,1111));

        System.out.println(hitung(200,"+",200));
        System.out.println(hitung(400,"-",10));
        System.out.println(hitung(400,"mmm",10));


    }

    static int sum(int value1,int value2){
        var total=value1+value2;
        return total;
    }

    static int hitung(int value1,String oprasi,int value2){
        switch (oprasi){
            case "+" :
                return value1+value2;
            case "-":
                return value1-value2;
            default:
                return 0;
        }
    }
}
