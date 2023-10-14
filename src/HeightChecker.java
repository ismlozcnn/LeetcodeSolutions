import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int count=0;
        int[] copy=heights.clone();
        //Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]>heights[j]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if(heights[i]!=copy[i]){
                count++;
            }
        }

        return count;
    }
}
