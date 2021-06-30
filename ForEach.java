public class ForEach {
    public static void main(String[] args) {
        String[][] bulan = {
                {"Januari", "Februari"},
                {"Maret", "April", "Mei"},
                {"Juni", "Juli"}
        };
        //For each digunakan untuk mengakses seluruh isi array
        for(var month : bulan){
            System.out.println(month);
        }
        //coba-coba
        for(var i = 0; i < bulan.length; i++){
            for(var j = 0; j < 2; j++){
                System.out.println(bulan[i][j]);
            }
        }
    }
}
