public class array13 {

   public static int trappedRainWater(int height[])
   {
    //calculate left max boundary - array

    int lefmax[] = new int [height.length];
    lefmax[0] = height[0];
    for(int i = 1 ; i< height.length; i++)
    {
        lefmax[i] = Math.max(height[i], lefmax[i-1]);
    }


    //calculate right max boundary - array 

    int rightmax[] = new int[height.length];
    rightmax[height.length-1] = height[height.length-1];
    for(int i = height.length-2 ; i>=0 ; i--)
    {
        rightmax[i] = Math.max(height[i], rightmax[i+1]);
    }


    //loop for waterlevel = min(lefmax bound , rightmax bound)
    int trappedWater = 0;
    for(int i = 0 ; i< height.length ; i++)
    {
        int waterlevel = Math.min(lefmax[i], rightmax[i]);

        //trapped water = waterlevel - height[i]
        trappedWater += waterlevel-height[i];
    }

    return trappedWater;
    
   }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
    
}
