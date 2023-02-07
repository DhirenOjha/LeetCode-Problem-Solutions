class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
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
                arr.add(i+1);
        }
        return arr;
    }
}