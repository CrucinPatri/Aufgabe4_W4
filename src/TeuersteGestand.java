public class TeuersteGestand {
    public static int get_TeuersteGestand(int[] tastaturen, int[] USBlaufwerke) {
        int max = tastaturen[0];

        for(int preis: tastaturen){
            if(preis > max){
                max = preis;
            }
        }

        for(int preis: USBlaufwerke){
            if(preis > max){
                max = preis;
            }
        }
        return max;
    }
}
