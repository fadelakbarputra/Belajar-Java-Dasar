public class BreakAndContinue {
    public static void main(String[] args) {
        var i = 0;
        for(i = 0; i <= 10; i++){
            if(i % 2 != 0){ //print angka genap
                continue;
            }
            System.out.println("Perulangan ke-" + i);
        }
        var counter = 0;
        while(counter <= 10){
            if(counter == 7){
                break;
            }
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }
    }
}
