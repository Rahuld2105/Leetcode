class Solution {
    public int mostFrequent(int[] nums, int key) {
        int ans = 0;
        int maxFreq = 0;
        int i = 0;
        int count[] = new int[1001];
        while(i<nums.length-1){
            if(nums[i]==key){
                count[nums[i+1]]++;
            }
            i++;
        }
        for(int j=0;j<count.length;j++){
            if(count[j]>maxFreq){
                maxFreq = count[j];
                ans = j;
            }
        }
        return ans;
    }
}