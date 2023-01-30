class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0,num;
        if(s.length==0||g.length==0)
            return count;
        int g1=0;
        for(int i=0;i<s.length;i++)
        {
            if(g1>=g.length)
                break;
            if(g[g1]<=s[i])
            {
                count++;
                g1++;
            }
            else
                continue;
        }
        return count;
    }
}