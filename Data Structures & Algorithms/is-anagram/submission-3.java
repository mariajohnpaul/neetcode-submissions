class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,1+map.getOrDefault(c,0));
        }
        for(char c: t.toCharArray()){
            int count = map.getOrDefault(c,0);
            if(count<1)return false;
            map.put(c,--count);
        }
        return true;
    }
}
