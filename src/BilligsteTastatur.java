public class BilligsteTastatur {
    public static int getBilligste(int[] tastaturen){
        int min = tastaturen[0];

        for(int preis: tastaturen)
            if(preis < min) min = preis;
        return min;
    }
}
