class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(s));
        int count=0,num;
        if(s.length==0||g.length==0)
            return count;
        if(s.length<g.length)
            num=g.length;
        else
            num=s.length;
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