package linxxjie_array;

public class LinxxjieTest02 {
    public int dominantIndex(int[] nums) {
        if(nums.length <= 1){
            return -1;
        }
        int max = 0;
        int secondMax = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                secondMax = max;
                max = nums[i];
                index = i;
            }else{
                if(secondMax < nums[i]){
                    secondMax = nums[i];
                }
            }
        }
        if(secondMax == 0 || max / secondMax > 2 || max / secondMax == 2){
            return index;
        }
        return -1;
    }
}
