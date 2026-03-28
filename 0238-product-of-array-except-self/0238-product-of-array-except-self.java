class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int n = result.length;
        result[0] = 1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1]*nums[i-1];
        }
        int suffix = 1;
        for(int i=n-1;i>=0;i--){
            result[i] = result[i]*suffix;
            suffix = suffix*nums[i];
        }
        return result;
        
    }
}