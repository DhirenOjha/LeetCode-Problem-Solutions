class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int pivot=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]>=nums[s] && nums[mid]>nums[e] && nums[mid]>nums[mid+1])
            {
                pivot=mid;
                break;
            }
            else if(nums[mid]<nums[e] && nums[mid]<nums[s] && nums[mid]<nums[mid-1])
            {
                pivot=mid-1;
                break;
            }
            else if(nums[mid]<nums[e] && nums[mid]<nums[s])
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        if(pivot>=0)
        return nums[pivot+1];
        return nums[0];
    }
}