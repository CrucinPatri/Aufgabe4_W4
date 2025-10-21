public class Main {
    public static void main(String[] args) {
        int[] tastaturen = {40, 35, 70, 15, 45};
        int[] USBlaufwerke = {20, 15, 40, 15};
        int buget = 60;

        BilligsteTastatur billigsteTastatur = new BilligsteTastatur();
        System.out.println("Billigste Tastatur: " + BilligsteTastatur.getBilligste(tastaturen));

    }
}