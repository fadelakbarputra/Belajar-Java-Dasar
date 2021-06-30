public class TernaryOperatoe {
    public static void main(String[] args) {
        var nilai = 79;
        var ucapan = nilai >= 80 ? "Anda lulus" : "Anda tidak lulus";
        System.out.println(ucapan);


        if(nilai >= 80){
            ucapan = "Anda lulus";
        }else{
            ucapan = "Anda tidak lulus";
        }
        System.out.println(ucapan);;
    }

}
