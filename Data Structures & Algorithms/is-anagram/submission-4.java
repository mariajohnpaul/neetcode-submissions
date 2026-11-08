class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int [] arr = new int[128];
        for(char c : s.toCharArray()){
            arr[c]++;
        }
        for(char c: t.toCharArray()){
            int count = arr[c];
            if(count<1)return false;
            arr[c]--;
        }
        return true;
    }
}
