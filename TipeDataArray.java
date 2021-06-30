public class TipeDataArray {
    public static void main(String[] args) {
        //Inisialisasi Array 1
        String[] jadwal = new String[3];
        jadwal[0] = "Kimia";
        jadwal[1] = "Fisika";
        jadwal[2] = "Biologi";
        //Inisialisasi Array 2
        String[] bulan = {"Januari", "Februari", "Maret"};
        //Inisialisasi Array 3
        int[] nilai = new int[]{90, 80, 70};

        System.out.println(nilai[0]);
        //Melihat panjang array
        long[] tinggi = {179L, 180L, 277L, 169L};
        tinggi[2] = 177;
        System.out.println(tinggi[2]);
        System.out.println(tinggi[3]);
        System.out.println(tinggi.length);
        //Array dua dimensi
        String[][] nama = {
                {"Fadel", "Akbar", "Putra"},
                {"Syamsul", "Rusdi"},
                {"Kuncoro"}
        };
        System.out.println(nama[0][2]);
        System.out.println(nama[2][0]);
    }
}
