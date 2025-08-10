import java.util.*;

class Solution{
    public int maxArea(int[] height){
        // Two pointer Approch 
        int lp = 0;
        int rp = height.length-1;
        int maxWater = 0;
        while(lp<rp){
            int w = rp - lp;
            int ht = Math.min(height[lp],height[rp]);
            int currWater = w * ht;
            maxWater = Math.max(maxWater, currWater);
            if(height[lp]<height[rp]) lp++;
            else rp--;
        }
        return maxWater;
    } 
}

public class ContainerWithMostWater {
    public static void main(String[] args){
        Solution sl = new Solution();
        int [] height1 = {1,8,6,2,5,4,8,3,7};
        int [] height2 = {1,2,3,9,4,6,8};
        System.out.println("Max Area :"+sl.maxArea(height1));
        System.out.println("Max Area :"+sl.maxArea(height2));
        
    }



}
