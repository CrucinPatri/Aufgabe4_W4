public class TeuersteUSBNachBuget {
    public static int teuersteUSBnachBuget(int[] USBlaufwerke, int buget){
        int max = -1;
        for(int preis: USBlaufwerke )
            if(preis <= buget && preis > max)
                max = preis;

        return max;
    }
}
