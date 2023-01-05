class Solution {
    public int findMinArrowShots(int[][] points) {
        int arr[]=new int[points.length];
        sort(points,0,points.length-1);
        int arrow=0;
        for(int i=0;i<points.length;i++)
        {
            if(arr[i]==1)
            {
                continue;
            }
            for(int j=i+1;j<points.length;j++)
            {
                if(points[i][0]<=points[j][1]&&points[i][1]>=points[j][0])
                {
                    arr[j]=1;
                }
            }
            arrow++;
        }
        
        return arrow;
    }
     
    void sort(int arr[][], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    void merge(int arr[][], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int L1[] = new int[n1];
        int R[] = new int[n2];
        int R1[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
        {
            L[i] = arr[l + i][0];
            L1[i] = arr[l + i][1];
        }
        for (int j = 0; j < n2; ++j)
        {
            R[j] = arr[m + 1 + j][0];
            R1[j] = arr[m + 1 + j][1];
        }
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L1[i] <= R1[j]) {
                arr[k][0] = L[i];
                arr[k][1] = L1[i];
                i++;
            }
            else {
                arr[k][0] = R[j];
                arr[k][1] = R1[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k][0] = L[i];
            arr[k][1] = L1[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k][0] = R[j];
            arr[k][1] = R1[j];
            j++;
            k++;
        }
    }
}