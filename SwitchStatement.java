public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "Z";
        //Lamba switch
        switch(nilai){
            case "A" -> System.out.println("Wow, Anda sangat hebat");
            case "B", "C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Maaf, Anda salah jurusan");
            }
        }
        //Yield
        String ucapan;
        ucapan = switch (nilai){
            case "A":
                yield "Wow, Anda sangar hebat";
            case "B", "C":
                yield "Anda lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Maaf, Anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
