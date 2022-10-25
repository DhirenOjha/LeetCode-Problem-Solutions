class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp="";
        String temp1="";
        // if(word1.length!=1)
        // {
            for(int i=0;i<word1.length;i++)
            {
                temp=temp.concat(word1[i]);
            }
        // }
        // else
        //     temp=word1[0];
        
        // if(word2.length!=1)
        // {
            for(int i=0;i<word2.length;i++)
            {
                temp1=temp1.concat(word2[i]);
            }
        // }
        // else
        //     temp1=word2[0];
        return temp.equals(temp1);
    }
}