public class Method {
    public static void main(String[] args) {
        System.out.println(hitung(200, "-", 100));
    }
    static int hitung(int nilai1, String operasi, int nilai2){
        int hasil;
        switch (operasi){
            case "+" -> {
                hasil = nilai1 + nilai2;
                return hasil;
            }
            case "-" -> {return nilai1 - nilai2;}
            case "*" -> {return nilai1 * nilai2;}
            default -> {return 0;}
        }
    }
}
