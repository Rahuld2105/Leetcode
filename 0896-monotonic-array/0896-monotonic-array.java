class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isDec = true;
        boolean isInc = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                isInc = true;
            }else{
                isInc = false;
                break;

            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                isDec = true;
            }else{
                isDec =false;
                break;
            }
        }
        return isDec||isInc;
    }
}