class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans=nums[nums.length-1];
        if(nums.length==1)
            return nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                i=i+1;
            }
            else
            {
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}