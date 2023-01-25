class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        ArrayList<Integer> arr=new ArrayList<>();
        if(mat.length==1&&mat[0].length==1&&target==mat[0][0])
            return true;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                arr.add(mat[i][j]);
            }
        }
        System.out.println(arr);
        int s=0,e=arr.size()-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr.get(mid)>target)
                e=mid-1;
            else if(arr.get(mid)<target)
                s=mid+1;
            else
                return true;
        }
        return false;
        
        // int i=0,j=mat[0].length-1;
        // while(i<mat.length&&j>=0)
        // {
        //     if(mat[i][j]>target)
        //         j--;
        //     else if(mat[i][j]<target)
        //         i++;
        //     else
        //         return true;
        // }
        // return false;
    }
}