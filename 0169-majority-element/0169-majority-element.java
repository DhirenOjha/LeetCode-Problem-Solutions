class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums.length/2;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(num==nums[j])
                    count++;
            }
            if(count>maj)
                return num;
        }
        return 0;
    }
}