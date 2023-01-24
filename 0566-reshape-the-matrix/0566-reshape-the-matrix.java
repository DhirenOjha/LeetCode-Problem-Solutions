class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length*mat[0].length)!=(r*c))
            return mat;
        int mat1[][]=new int[r][c];
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                arr.add(mat[i][j]);
            }
        }
        int k=0;
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[0].length;j++)
            {
                mat1[i][j]=arr.get(k);
                k++;
            }
        }
        return mat1;
    }
}