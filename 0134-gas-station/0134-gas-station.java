class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0,totalcost=0;
        for(int i=0;i<gas.length;i++)
        {
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalcost>totalgas)
            return -1;
        int start=0;
        int sum=0;
        for(int j=0;j<gas.length;j++)
        {
            sum=sum+gas[j];
            sum=sum-cost[j];
            if(sum<0)
            {
                start=j+1;
                sum=0;
            }
        }
        
        return start;
    }
}