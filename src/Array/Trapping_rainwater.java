package Array;

public class Trapping_rainwater {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
        int n = height.length;
        int[] Lmax = new int[n];
        int[] Rmax = new int[n];

        Lmax[0]=height[0];
        int res = 0;
        for(int i =1;i<n;i++){
            Lmax[i]= Math.max(height[i],Lmax[i-1]);
        }
        Rmax[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--){
            Rmax[j]= Math.max(height[j],Rmax[j+1]);
        }
        for(int k = 1;k<n-1;k++){
            res += Math.min(Lmax[k],Rmax[k])-height[k];
        }



        return res;
    }
}
