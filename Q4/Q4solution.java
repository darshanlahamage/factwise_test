package Q4;

public class Q4solution {
    public static int search(int[] nums, int target){
       int low =0;
       int high = nums.length - 1;
       while(low<high){
        int mid = low+ (high -low) /2;
        if(nums[mid] ==target){
            return mid;
        }else if(nums[mid]<target){
            low = mid + 1;
        }else{
            high =mid+1;
        }
       }
       return low;
    }
    public static void main(String [] args){
        int nums1[] = {7,1,5,3,6,4};
        int target1 = 5;
        int target2 = 2;
        System.out.println(search(nums1, target1));
        System.out.println(search(nums1, target2));

        
   }
}
