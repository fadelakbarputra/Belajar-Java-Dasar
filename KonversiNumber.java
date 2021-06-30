public class KonversiNumber {
    public static void main(String[] args) {
        //Konversi dari size kecil ke besar
        int iniInt = 1000;
        long iniLong = iniInt;
        //Konversi dari size besar ke kecil
        int iniInt2 = 10000000;
        byte iniShort = (byte) iniInt2; //akan terjadi overflow
    }
}
