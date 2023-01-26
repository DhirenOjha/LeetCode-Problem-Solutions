class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> maps=new HashMap<>();
        HashMap<Character,Integer> mapt=new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(maps.containsKey(s.charAt(i)))
                maps.put(s.charAt(i),maps.get(s.charAt(i))+1);
            else
                maps.put(s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++)
        {
            if(mapt.containsKey(t.charAt(i)))
                mapt.put(t.charAt(i),mapt.get(t.charAt(i))+1);
            else
                mapt.put(t.charAt(i),1);
        }
        if(maps.equals(mapt))
            return true;
        return false;
    }
}