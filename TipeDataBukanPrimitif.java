public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
    //Dari primitif ke objek / objek ke primitif dg tipe data sama
       int iniPrimtif = 100;
       Integer iniObject = iniPrimtif;
       int intLagi = iniObject;

        System.out.println(iniObject);
        System.out.println(intLagi);
    //Dari objek ke primitif dg tipe data berbeda
        short iniShort = iniObject.shortValue();
        byte iniByte = iniObject.byteValue();
        long iniLong = iniObject.longValue();
    }
}
