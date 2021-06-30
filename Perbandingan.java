public class Perbandingan {
    public static void main(String[] args) {
        int niilaiIPA = 89;
        var nilaiIPS = 79;
        var absensi = 3;
        boolean lulusNilai = (nilaiIPS+niilaiIPA)/2 >= 75;
        boolean lulusAbsen = absensi <= 3;

        boolean lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);
    }
}
