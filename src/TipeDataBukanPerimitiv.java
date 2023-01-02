public class TipeDataBukanPerimitiv {
    public static void main(String[] args) {

        Integer iniIteger=100;
        Long iniLong=10000l;

        Byte iniByte=null;

        System.out.println(iniByte);

        iniByte=100;

        System.out.println(iniByte);

        int iniiteger2=100;
        Integer iniobject=iniiteger2;

        short inishort=iniobject.shortValue();
        long inilong2=iniobject.longValue();
        float inifloat=iniobject.floatValue();


        System.out.println(inifloat);


    }
}
