package linxxjie_array;

public class LinxxjieTest01 {
    public int pivotIndex(int[] nums) {
        if(nums.length < 3){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < i; j++) {
                left = left + nums[j];
            }
            for (int j = nums.length-1; j > i; j--) {
                right = right + nums[j];
            }
            if (right == left) {
                return i;
            }
        }
        return -1;
    }
}
