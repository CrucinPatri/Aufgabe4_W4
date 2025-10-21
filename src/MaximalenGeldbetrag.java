public class MaximalenGeldbetrag {
    public static int get_MaxSum(int[] tastaturen, int[] USBlaufwerke, int buget){
        int maxSum = -1;
        for(int t: tastaturen){
            for(int u: USBlaufwerke){
                int sum = t + u;
                if(sum <= buget && sum > maxSum){
                    maxSum = sum;
                }
            }

        }
        return maxSum;
    }
}
