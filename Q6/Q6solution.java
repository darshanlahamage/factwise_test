package Q6;
import java.util.*;

public class Q6solution {
    public static int maxrob(int[] nums){
        int n= nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];

        int[] dp= new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2;i<n;i++){
            dp[i] = Math.max(nums[i] +dp[i-2], dp[i-1]);

        }
        return dp[n-1];

    }
    public static void main(String [] args){
        int nums1[] = {2,3,2};
        System.out.println(maxrob(nums1));
        int nums2[] = {1,2,3,1};
        System.out.println(maxrob(nums2));
        int nums3[] = {1,2,3};
        System.out.println(maxrob(nums3));      
   }
}
