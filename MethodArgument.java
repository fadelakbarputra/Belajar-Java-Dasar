public class MethodArgument {
    public static void main(String[] args) {
        int[] nilai = {89, 90, 77, 87, 87};
        selamat("Fadel", 90, 80 , 78, 0);

    }
    static void selamat(String nama, int...nilai){
        var total = 0;
        for(int value : nilai){
            total += value;
        }
        total /= nilai.length;
        var ucapan = total >= 80 ? "Selamat " + nama + " lulus": "Maaf, " + nama + " belum lulus";
        System.out.println(ucapan);
    }
}
