public class tipeDataArrey {
    public static void main(String[] args) {
        String[] Arreystring=new String[3];

        Arreystring[0]="Ruswada";
        Arreystring[1]="OKTA";
        Arreystring[2]="VIAN";

        System.out.println(Arreystring[0]);
        System.out.println(Arreystring[1]);
        System.out.println(Arreystring[2]);

        Arreystring[2]="DIRGANTARA";

        System.out.println(Arreystring[2]);

        //penulisan arrey singkat

        String[] NamaNama={
                "dika","cahyo","sahrul"
        };

        NamaNama[0]=null;

        int[] IniArreyInt=new int[]{
              1,2,3,4,5,6,7,8,9,10
        };

        long[] IniArrayLong={
                20L,43L,33L,432L,55L
        };

        System.out.println(IniArrayLong.length);

        //make array in array

        String[][] Members={
                {"ahmad","zuhari"},
                {"dimas","akbar"},
                {"sandi"}
        };
        System.out.println(Members[0][1]);
        System.out.println(Members[1][0]);



    }
}
