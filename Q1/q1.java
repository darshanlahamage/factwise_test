public class q1 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int lengthAfterRemoval = removeDuplicates(nums);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < lengthAfterRemoval; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i]; 
                j++; 
            }
        }
        return j; 
    }
}