class Solution {
    public int maxPoints(int[][] points) {
        int max=0;
        for(int i=0;i<points.length;i++)
        {
            HashMap<Float,Integer> map=new HashMap<>();
            for(int j=i+1;j<points.length;j++)
            {
                float slope;
                if((points[i][0]-points[j][0])==0)
                    slope=Float.MAX_VALUE;
                else
                    slope=((float)(points[i][1]-points[j][1])/(float)(points[i][0]-points[j][0]));
                if(slope==-0.0)
                    slope=(float)0.0;
                // if(slope==-infinity)
                //     slope=(float)infinity;
                System.out.println(slope+" "+i);
                // if(!map.containsKey(slope))
                // {
                //     map.put(slope,1);
                // }
                // else
                //     map.put(slope,map.get(slope)+1);
                map.put(slope,map.getOrDefault(slope,0)+1);
                max=Math.max(max,map.get(slope));
            }
        // System.out.println(map);
        }
        return max+1;
    }
}