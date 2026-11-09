class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<Integer>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char [] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for(char c: arr)sb.append(c);
            String sorted = sb.toString();
            List<Integer> cur = map.getOrDefault(sorted,new ArrayList<Integer>());
            cur.add(i);
            map.put(sorted,cur);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String k : map.keySet()){
            List<Integer> cur = map.get(k);
            List<String> t = new ArrayList<>();
            for(int i : cur){
                t.add(strs[i]);
            }
            ans.add(t);
        }
        return ans;
    }
}
