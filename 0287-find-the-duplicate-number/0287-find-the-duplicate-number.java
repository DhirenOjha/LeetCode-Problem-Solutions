class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=nums[nums[i]-1])
            {
                int temp=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[temp-1]=temp;
            }
            else
                i++;
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
                return nums[i];
        }
        
        return 0;
    }
}