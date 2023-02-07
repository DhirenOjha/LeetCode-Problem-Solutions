class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
        ArrayList<Integer> arr=new ArrayList<>();
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
                arr.add(nums[i]);
        }
        return arr;
    }
}