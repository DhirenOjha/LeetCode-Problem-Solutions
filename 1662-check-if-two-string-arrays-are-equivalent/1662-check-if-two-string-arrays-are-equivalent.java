class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp="";
        String temp1="";
        for(int i=0;i<word1.length;i++)
        {
            temp=temp.concat(word1[i]);
        }
        for(int i=0;i<word2.length;i++)
        {
            temp1=temp1.concat(word2[i]);
        }

        return temp.equals(temp1);
    }
}