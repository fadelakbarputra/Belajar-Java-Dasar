public class IfStatement {
    public static void main(String[] args) {
        int nilai = 80;
        var absen = 2;

        if(nilai >= 80 && absen <= 2){
            System.out.println("Lulus predikat A");
        }
        else if(nilai >= 70 && absen <= 2){
            System.out.println("Lulus predikat B");
        }
        else if(nilai >= 60 && absen <= 3){
            System.out.println("Lulus predikat C");
        }
        else{
            System.out.println("Tidak lulus");
        }
    }
}
