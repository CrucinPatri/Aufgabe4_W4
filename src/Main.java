public class Main {
    public static void main(String[] args) {
        int[] tastaturen = {40, 35, 70, 15, 45};
        int[] USBlaufwerke = {20, 15, 40, 15};
        int buget = 60;

        BilligsteTastatur billigsteTastatur = new BilligsteTastatur();
        System.out.println("Billigste Tastatur: " + BilligsteTastatur.getBilligste(tastaturen));

        TeuersteGestand teuersteGestand = new TeuersteGestand();
        System.out.println("Teuerste Gestand: " + TeuersteGestand.get_TeuersteGestand(tastaturen, USBlaufwerke));

        TeuersteUSBNachBuget teuersteUSBNachBuget = new TeuersteUSBNachBuget();
        System.out.println("Teuerste USB der Mark nach seinem Buget kaufen kann:" +
                TeuersteUSBNachBuget.teuersteUSBnachBuget(USBlaufwerke, buget));

        int b1 = 60;
        int[] tastaturen1 = {40, 50, 60};
        int[] usb1 = {8,12};

        int b2 = 60;
        int[] tastaturen2 = {60};
        int[] usb2 = {8,12};

        int b3 = 60;
        int[] tastaturen3 = {40, 60};
        int[] usb3 = {8,12};

        MaximalenGeldbetrag maximalenGeldbetrag = new MaximalenGeldbetrag();
        System.out.println("Maximalen Geldbetrag: " + MaximalenGeldbetrag.get_MaxSum(tastaturen1, usb1, b1));
        System.out.println("Maximalen Geldbetrag: " + MaximalenGeldbetrag.get_MaxSum(tastaturen2, usb2, b2));
        System.out.println("Maximalen Geldbetrag: " + MaximalenGeldbetrag.get_MaxSum(tastaturen3, usb3, b3));

    }
}