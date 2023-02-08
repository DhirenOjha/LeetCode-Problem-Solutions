class Solution {
    public int[] findErrorNums(int[] nums) {
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
        int ans[]=new int[2];
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                ans[0]=nums[i];
                ans[1]=i+1;
                break;
            }
        }
        
        return ans;
    }
}